import org.antlr.v4.runtime.*;
import java.util.HashMap;
import java.util.Map;

public abstract class RustParserBase extends Parser {
    // A single global map for all token streams
    private static final Map<String, Integer> globalTokenTypeMap = new HashMap<>();

    public RustParserBase(TokenStream input){
        super(input);
    }

    public boolean next(char expect){
        return _input.LA(1) == findTokenType(_input, String.valueOf(expect));
    }

    public boolean nextIsIdentifier() {
        int laType = _input.LA(1);
        return laType == RustParser.NON_KEYWORD_IDENTIFIER ||
               laType == RustParser.RAW_IDENTIFIER ||
               laType == RustParser.KW_MACRORULES ||
               laType == RustParser.KW_UNION;
    }

    /**
     * Searches through the tokens in the given TokenStream and returns the type
     * of the token whose getText() exactly equals the target string.
     * This version uses a single global cache for all token streams.
     *
     * @param tokenStream the token stream to search (assumed to be a buffered stream)
     * @param target      the string to match
     * @return the token type if found; otherwise, Integer.MIN_VALUE
     */
    public static int findTokenType(TokenStream tokenStream, String target) {
        // Check the global cache first.
        if (globalTokenTypeMap.containsKey(target)) {
            return globalTokenTypeMap.get(target);
        }

        int index = 0;
        while (true) {
            Token token;
            try {
                token = tokenStream.get(index);
            } catch (IndexOutOfBoundsException e) {
                break;
            }
            // Stop if we reach the EOF token.
            if (token.getType() == Token.EOF) {
                break;
            }
            String text = token.getText();
            // Cache the token text with its type if not already cached.
            if (!globalTokenTypeMap.containsKey(text)) {
                globalTokenTypeMap.put(text, token.getType());
            }
            // Check if this token matches the target.
            if (target.equals(text)) {
                return token.getType();
            }
            index++;
        }
        // If no matching token was found, return Integer.MIN_VALUE.
        return Integer.MIN_VALUE;
    }
}
