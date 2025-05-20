import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Stream;

/**
 * Main application to recursively parse Rust source files (.rs) within a folder,
 * log any syntax errors to a single log file (named after the repository and stored
 * in a dedicated folder), and optionally (in debug mode) print the tokens and parse
 * tree for a specified file.
 *
 * Usage:
 *   java RustParserApp <folder_path> [print <debugFileName>]
 *
 * When "print" is provided as the second parameter along with a third parameter (the
 * name of the Rust file for which tokens and tree output are desired), then that file's
 * tokens and parse tree are written to "output_tokens.txt" and "output_tree.txt"
 * respectively, stored inside the log folder.
 */
public class Main {

    public static void main(String[] args) {
        // Expected usage:
        // java RustParserApp <folder_path> [print <debugFileName>]
        String folderPathStr;
        final boolean debugMode;
        final String debugFileName;
        final String toIgnorePathStr;
        if (args.length == 0) {
            System.err.println("Usage: java RustParserApp <folder_path> [print <debugFileName>]");
            return;
        } else {
            folderPathStr = args[0];
            int idx = 1;
            if (args.length >= 3 && args[1].equalsIgnoreCase("print")) {
                debugMode = true;
                debugFileName = args[2];
                idx = 3;
            } else {
                debugMode = false;
                debugFileName = null;
            }
            if (args.length > idx) {
                toIgnorePathStr = args[idx];
            } else {
                toIgnorePathStr = null;
            }
        }

        // Convert to absolute path and check if it's a directory
        Path folderPath = Paths.get(folderPathStr).toAbsolutePath();
        if (!Files.isDirectory(folderPath)) {
            System.err.println("Provided path is not a directory: " + folderPath);
            return;
        }

        // The repository name is the last folder in the provided path.
        String repoName = folderPath.getFileName().toString();
        // Create (or get) a folder inside the project root for this repo's logs.
        Path logFolder = getLogFolder(repoName);
        // Determine the unique log file name inside the log folder.
        Path logFilePath = getUniqueLogFilePath(repoName, logFolder);

        // Load ignore information if provided
        Path projectRoot = Paths.get(System.getProperty("user.dir"));
        IgnoreData ignoreData = loadIgnoreData(
                toIgnorePathStr != null ? projectRoot.resolve(toIgnorePathStr) : null);

        Path parsedFilesPath = logFolder.resolve("parsed_files.txt");

        // Open writers for logging errors and the list of parsed files
        try (BufferedWriter logWriter = Files.newBufferedWriter(
                logFilePath,
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
             BufferedWriter fileListWriter = Files.newBufferedWriter(
                parsedFilesPath,
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND)) {

            // Recursively traverse the folder and process all .rs files.
            try (Stream<Path> paths = Files.walk(folderPath)) {
                paths.filter(Files::isRegularFile)
                     .filter(path -> path.toString().endsWith(".rs"))
                     .filter(path -> !shouldIgnore(path, folderPath, ignoreData))
                     .forEach(rustFile ->
                         parseRustFile(rustFile, logWriter, debugMode, debugFileName, logFolder,
                                      folderPath, fileListWriter)
                     );
            }
            System.out.println("Parsing completed. Errors (if any) are logged to: " + logFilePath);
        } catch (IOException e) {
            System.err.println("Failed to create/write to log file: " + e.getMessage());
        }
    }

    /**
     * Returns the folder (inside the project root) used for storing logs for the repository.
     * If the folder doesn't exist, it is created.
     *
     * @param repoName The name of the repository (last segment of folderPathStr).
     * @return The Path to the log folder.
     */
    private static Path getLogFolder(String repoName) {
        Path projectRoot = Paths.get(System.getProperty("user.dir"));
        Path logFolder = projectRoot.resolve(repoName);
        if (!Files.exists(logFolder)) {
            try {
                Files.createDirectories(logFolder);
            } catch (IOException e) {
                System.err.println("Failed to create log folder: " + logFolder + " - " + e.getMessage());
            }
        }
        return logFolder;
    }

    /**
     * Generates a unique log file name in the given logFolder.
     * If a file with the name "<repoName>_log.txt" exists, it increments the name.
     *
     * @param repoName  The repository name.
     * @param logFolder The folder where log files are stored.
     * @return A unique Path for the log file.
     */
    private static Path getUniqueLogFilePath(String repoName, Path logFolder) {
        int counter = 1;
        Path logPath = logFolder.resolve(repoName + "_log.txt");
        while (Files.exists(logPath)) {
            counter++;
            logPath = logFolder.resolve(repoName + "_log_" + counter + ".txt");
        }
        return logPath;
    }

    /** Container for ignore information. */
    private static class IgnoreData {
        final Set<String> paths = new HashSet<>();
        final Set<String> names = new HashSet<>();
    }

    /**
     * Loads ignore information from the provided file. The file paths are
     * considered relative to the project root.
     */
    private static IgnoreData loadIgnoreData(Path ignoreFile) {
        IgnoreData data = new IgnoreData();
        if (ignoreFile == null || !Files.isRegularFile(ignoreFile)) {
            return data;
        }
        try (Stream<String> lines = Files.lines(ignoreFile)) {
            lines.forEach(line -> {
                String trimmed = line.trim();
                if (trimmed.isEmpty()) return;
                trimmed = trimmed.replaceFirst("^\\d+\\s+", "");
                if (!trimmed.endsWith(".rs")) return;
                trimmed = trimmed.replace('\\', '/');
                if (trimmed.contains("/")) {
                    data.paths.add(trimmed);
                } else {
                    data.names.add(trimmed);
                }
            });
        } catch (IOException e) {
            System.err.println("Failed to read ignore file: " + ignoreFile + " - " + e.getMessage());
        }
        return data;
    }

    /**
     * Determines if the given file should be ignored based on the loaded ignore data.
     */
    private static boolean shouldIgnore(Path file, Path root, IgnoreData data) {
        if (data.paths.isEmpty() && data.names.isEmpty()) {
            return false;
        }
        String rel = root.relativize(file).toString().replace('\\', '/');
        if (data.paths.contains(rel)) {
            return true;
        }
        return data.names.contains(file.getFileName().toString());
    }

    /**
     * Custom error listener that logs parsing errors to a shared BufferedWriter.
     * It loads the file lines (once per file) for reporting the specific line content
     * where an error occurs.
     */
    private static class RustErrorListener extends BaseErrorListener {
        private final String filePath;
        private final List<String> lines;
        private final BufferedWriter logWriter;

        RustErrorListener(String filePath, List<String> lines, BufferedWriter logWriter) {
            this.filePath = filePath;
            this.lines = lines;
            this.logWriter = logWriter;
        }

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line,
                                int charPositionInLine,
                                String msg,
                                RecognitionException e) {
            // Retrieve the content of the line where the error occurred (if available)
            String lineContent = "";
            if (line > 0 && line <= lines.size()) {
                lineContent = lines.get(line - 1);
            }
            // Format the error details
            String errorDetails = String.format(
                "Rust Parse Error:\n" +
                "    File Path   : %s\n" +
                "    Line        : %d\n" +
                "    Column      : %d\n" +
                "    Error       : %s\n" +
                "    Line Content: %s",
                filePath, line, charPositionInLine + 1, msg, lineContent
            );
            try {
                logWriter.write(errorDetails);
                logWriter.newLine();
                logWriter.flush();
            } catch (IOException ioEx) {
                System.err.println("Failed to log error: " + ioEx.getMessage());
            }
        }
    }

    /**
     * Parses a single Rust source file using ANTLR. Logs syntax errors via the provided logWriter.
     * If debugMode is enabled and the current file's name matches the specified debug file path,
     * outputs the token stream and parse tree to "output_tokens.txt" and "output_tree.txt" stored in logFolder.
     *
     * @param rustFile      The .rs file to parse.
     * @param logWriter     Writer for logging errors.
     * @param debugMode     If true, indicates that token and parse tree output is desired.
     * @param debugFilePath The name of the file for which tokens and tree should be printed.
     * @param logFolder     The folder where debug output should be stored.
     * @param rootPath      Root folder being scanned (for relative path output).
     * @param fileListWriter Writer to record processed file paths.
     */
    private static void parseRustFile(Path rustFile, BufferedWriter logWriter, boolean debugMode,
                                      String debugFilePath, Path logFolder, Path rootPath,
                                      BufferedWriter fileListWriter) {
        try {
            // Record the path of this file relative to the scanned folder
            try {
                String rel = rootPath.relativize(rustFile).toString().replace('\\', '/');
                fileListWriter.write(rel);
                fileListWriter.newLine();
                fileListWriter.flush();
            } catch (IOException ex) {
                System.err.println("Failed to record parsed file: " + rustFile + " - " + ex.getMessage());
            }
            // Read all lines (for error reporting)
            List<String> lines = Files.readAllLines(rustFile, StandardCharsets.UTF_8);
            // Create a CharStream from the file
            CharStream input = CharStreams.fromPath(rustFile, StandardCharsets.UTF_8);

            // Initialize lexer and parser
            RustLexer lexer = new RustLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RustParser parser = new RustParser(tokens);

            // Attach the custom error listener
            RustErrorListener errorListener = new RustErrorListener(rustFile.toString(), lines, logWriter);
            lexer.removeErrorListeners();
            parser.removeErrorListeners();
            lexer.addErrorListener(errorListener);
            parser.addErrorListener(errorListener);

            // Use default error recovery strategy
            parser.setErrorHandler(new DefaultErrorStrategy());

            // Parse using the top-level rule (assuming 'crate' is the correct start rule)
            ParseTree tree = parser.crate();

            // If debug mode is enabled and this file matches the specified debug file name, output tokens and tree.
            if (debugMode && debugFilePath != null) {
                String fullPath = rustFile.toAbsolutePath().toString();
                Path debugPath = Paths.get(debugFilePath).toAbsolutePath();

                if (fullPath.equals(debugPath.toString()) || fullPath.endsWith(File.separator + debugFilePath)) {
                    // Write token stream to output_tokens.txt inside the log folder
                    Path tokenOutputPath = logFolder.resolve("output_tokens.txt");
                    try (PrintWriter tokenWriter = new PrintWriter(new FileWriter(tokenOutputPath.toFile()))) {
                        tokenWriter.println("File: " + rustFile.toAbsolutePath());
                        for (Token token : tokens.getTokens()) {
                            if (token.getType() == Token.EOF) continue;
                            tokenWriter.printf("Type: %-15s  Text: '%s'  Line: %d, Col: %d%n",
                                RustLexer.VOCABULARY.getDisplayName(token.getType()),
                                token.getText(),
                                token.getLine(),
                                token.getCharPositionInLine());
                        }
                    } catch (IOException e) {
                        System.err.println("Failed to write tokens for file: " + rustFile + " due to: " + e.getMessage());
                    }

                    // Write parse tree to output_tree.txt inside the log folder
                    Path treeOutputPath = logFolder.resolve("output_tree.txt");
                    try (PrintWriter treeWriter = new PrintWriter(new FileWriter(treeOutputPath.toFile()))) {
                        treeWriter.println("File: " + rustFile.toAbsolutePath());
                        writeTree(tree, parser, 0, treeWriter);
                    } catch (IOException e) {
                        System.err.println("Failed to write parse tree for file: " + rustFile + " due to: " + e.getMessage());
                    }
                }
            }

            // --- CLEAR THE DFA CACHE AFTER PARSING THIS FILE ---
            // This call clears the DFA (and thus the cached ATNConfig objects) from the parser.
            // It helps prevent memory buildup when parsing a large number of files.
            parser.getInterpreter().clearDFA();
            lexer.getInterpreter().clearDFA();
            // ALSO RESET THE SHARED PREDICTION CONTEXT CACHE
            // (This cache is static in the generated parser and holds onto SingletonPredictionContext instances)
            // RustParser.clearSharedContextCache();
        } catch (IOException ioEx) {
            System.err.println("Failed to read file: " + rustFile + " - " + ioEx.getMessage());
        } catch (Exception ex) {
            System.err.println("Parsing aborted for file: " + rustFile + " due to: " + ex.getMessage());
        }
    }

    /**
     * Helper method to write the parse tree with indentation.
     *
     * @param tree   The parse tree.
     * @param parser The parser (used to retrieve rule names).
     * @param indent The current indentation level.
     * @param writer The PrintWriter to which the tree is written.
     */
    private static void writeTree(ParseTree tree, Parser parser, int indent, PrintWriter writer) {
        String indentStr = "  ".repeat(indent);
        String node;
        if (tree instanceof RuleNode) {
            int ruleIndex = ((RuleNode) tree).getRuleContext().getRuleIndex();
            node = parser.getRuleNames()[ruleIndex];
        } else {
            node = tree.getText();
        }
        writer.println(indentStr + node);
        for (int i = 0; i < tree.getChildCount(); i++) {
            writeTree(tree.getChild(i), parser, indent + 1, writer);
        }
    }
}
