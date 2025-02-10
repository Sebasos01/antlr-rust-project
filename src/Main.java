

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        RustLexer lexer = new RustLexer(CharStreams.fromString("fn main() { println!(\"Hello, world!\"); }"));
        RustParser parser = new RustParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.crate();
        System.out.println(tree.toStringTree(parser));
    }
}
