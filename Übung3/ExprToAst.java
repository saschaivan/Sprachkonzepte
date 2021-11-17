
// ExprToAst.java
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public final class ExprToAst {
    private ExprToAst() {
    }

    public static void main(String[] args) throws Exception {
        SaschLexer lexer = new SaschLexer(CharStreams.fromStream(System.in));
        SaschParser parser = new SaschParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.matchup();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            System.exit(1);
        }

        //String ast = new ExprBuilder().build(tree);
        //System.out.printf("Expr.toString() = \"%s\"%n", ast);
    }
}
