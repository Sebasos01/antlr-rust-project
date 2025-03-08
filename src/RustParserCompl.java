import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.PredictionContextCache;

public class RustParserCompl extends RustParser {
    public RustParserCompl(TokenStream input) {
        super(input);
    }
    // public static void clearSharedContextCache() {
	// 	_sharedContextCache = new PredictionContextCache();
	// }
}
