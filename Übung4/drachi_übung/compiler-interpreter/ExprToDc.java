// ExprToDc.java
import grammar.ExprLexer;
import grammar.ExprParser;
import ast.Expr;
import ast.ExprBuilder;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public final class ExprToDc {
    private ExprToDc() { }

    public static void main(String[] args) throws Exception {
        ExprLexer lexer = new ExprLexer(CharStreams.fromStream(System.in));
        ExprParser parser = new ExprParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.start();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            System.exit(1);
        }

        Expr ast = new ExprBuilder().build(tree);

        new ExprCompiler().print(System.out, ast);
    }
}

