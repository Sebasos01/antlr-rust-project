import org.antlr.v4.runtime.*;

public abstract class RustParserBase extends Parser {
    public RustParserBase(TokenStream input){
        super(input);
    }

    public boolean next(char expect){
        int expectType = findTokenType(_input, String.valueOf(expect));
        return _input.LA(1) == expectType;
    }

    /**
     * Searches through the tokens in the given TokenStream and returns the type
     * of the token whose getText() exactly equals the target string.
     *
     * @param tokenStream the token stream to search (assumed to be a buffered stream)
     * @param target      the string to match
     * @return the token type if found; otherwise, -1
     */
    public static int findTokenType(TokenStream tokenStream, String target) {
        int index = 0;
        // Loop until we hit an EOF token (whose type is typically -1)
        // or we run out of tokens.
        while (true) {
            Token token;
            try {
                token = tokenStream.get(index);
            } catch (IndexOutOfBoundsException e) {
                // If get(index) throws an exception, we assume we reached the end.
                break;
            }
            // Stop if we reached the EOF token.
            if (token.getType() == Token.EOF) {
                break;
            }
            // Check if this token's text matches the target string exactly.
            if (target.equals(token.getText())) {
                return token.getType();
            }
            index++;
        }
        // If no matching token was found, return -777.
        return Integer.MIN_VALUE;
    }
}