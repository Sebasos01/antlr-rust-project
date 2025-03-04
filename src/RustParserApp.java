import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.DefaultErrorStrategy;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

/**
 * Main application to parse Rust source files (.rs) within a folder recursively 
 * and log any syntax errors to a single log file named after the folder.
 */
public class RustParserApp {

    /**
     * Custom error listener that writes parsing errors to a given BufferedWriter.
     */
    private static class RustErrorListener extends BaseErrorListener {
        private final String filePath;        // Current Rust file being parsed
        private final List<String> lines;     // Contents of the file
        private final BufferedWriter logWriter;

        RustErrorListener(String filePath, List<String> lines, BufferedWriter logWriter) {
            this.filePath = filePath;
            this.lines    = lines;
            this.logWriter = logWriter;
        }

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line, 
                                int charPositionInLine,
                                String msg, 
                                RecognitionException e) {
            // Retrieve content of the line where the error occurred
            String lineContent = "";
            if (line > 0 && line <= lines.size()) {
                lineContent = lines.get(line - 1);
            }

            // Prepare a nicely formatted error message
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
                // Log the error details into the shared log file
                logWriter.write(errorDetails);
                logWriter.newLine();
                logWriter.flush();
            } catch (IOException ioEx) {
                // If logging fails, print to stderr for fallback
                System.err.println("Failed to log error: " + ioEx.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        String folderPathStr = "/home/socub/U/tesis/rust_repos/bevy";
        // // 1. Validate and retrieve folder path from arguments
        // if (args.length == 0) {
        //     System.err.println("Usage: java RustParserApp <folder_path>");
        //     return;
        // }

        Path folderPath = Paths.get(folderPathStr).toAbsolutePath();
        if (!Files.isDirectory(folderPath)) {
            System.err.println("Provided path is not a directory: " + folderPath);
            return;
        }

        // 2. Determine the log file name based on the folder’s name (e.g., "MyFolder_log.txt").
        //    If "MyFolder_log.txt" already exists, increment to "MyFolder_log_2.txt", etc.
        String folderName = folderPath.getFileName().toString();
        Path logFilePath = getUniqueLogFilePath(folderName);

        // 3. Open a single BufferedWriter for all .rs files' errors
        try (BufferedWriter logWriter = Files.newBufferedWriter(
                logFilePath,
                StandardCharsets.UTF_8,
                StandardOpenOption.CREATE, 
                StandardOpenOption.APPEND)
        ) {
            // 4. Recursively walk through the folder and parse all .rs files
            try (Stream<Path> paths = Files.walk(folderPath)) {
                paths.filter(Files::isRegularFile)
                     .filter(path -> path.toString().endsWith(".rs"))
                     .forEach(rustFile -> {
                         parseRustFile(rustFile, logWriter);
                     });
            }
            System.out.println("Parsing completed. Errors (if any) are logged to: " + logFilePath);
        } catch (IOException e) {
            System.err.println("Failed to create/write to log file: " + e.getMessage());
        }
    }

    /**
     * Generate a unique log file name in the provided folder.
     * Example: If folderName = "MyFolder", tries "MyFolder_log.txt", 
     * then "MyFolder_log_2.txt", and so on until an available file name is found.
     *
     * @param folderPath Path to the folder in which to place the log file.
     * @param folderName Name of the folder, used to generate log file name.
     * @return The Path for a unique log file within folderPath.
     */
    private static Path getUniqueLogFilePath(String folderName) {
        // Use the current Java project root directory
        Path projectRoot = Paths.get(System.getProperty("user.dir"));
        int counter = 1;
        Path logPath = projectRoot.resolve(folderName + "_log.txt");
    
        // While a file with this name exists, keep incrementing
        while (Files.exists(logPath)) {
            counter++;
            logPath = projectRoot.resolve(folderName + "_log_" + counter + ".txt");
        }
        return logPath;
    }
    

    /**
     * Parse a single .rs file using ANTLR, reporting any syntax errors
     * via the shared logWriter.
     *
     * @param rustFile  The .rs file to parse.
     * @param logWriter Writer for logging errors.
     */
    private static void parseRustFile(Path rustFile, BufferedWriter logWriter) {
        try {
            // Read all lines for error reporting
            List<String> lines = Files.readAllLines(rustFile, StandardCharsets.UTF_8);
            // Create an ANTLR CharStream from the file
            CharStream input = CharStreams.fromPath(rustFile, StandardCharsets.UTF_8);

            // Initialize ANTLR lexer & parser
            RustLexer lexer = new RustLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            RustParser parser = new RustParser(tokens);

            // Attach our custom error listener
            RustErrorListener errorListener = new RustErrorListener(rustFile.toString(), lines, logWriter);
            lexer.removeErrorListeners();
            parser.removeErrorListeners();
            lexer.addErrorListener(errorListener);
            parser.addErrorListener(errorListener);

            // Use default error strategy to continue parsing after errors
            parser.setErrorHandler(new DefaultErrorStrategy());

            // Parse using the top-level rule of the Rust grammar (assuming 'crate' is correct)
            parser.crate();

        } catch (IOException ioEx) {
            // If there's an issue reading the file itself, log or print the error
            System.err.println("Failed to read file: " + rustFile + " - " + ioEx.getMessage());
        } catch (Exception ex) {
            // Catch any unexpected exceptions
            System.err.println("Parsing aborted for file: " + rustFile + " due to: " + ex.getMessage());
        }
    }
}
