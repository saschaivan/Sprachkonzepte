
// ExprToAst.java
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public final class ExprToAst {
    private ExprToAst() {
    }

    public static void main(String[] args) throws Exception {
        File initialFile = new File(args[0]);
        InputStream targetStream = new FileInputStream(initialFile);
        SaschLexer lexer = new SaschLexer(CharStreams.fromStream(targetStream));
        SaschParser parser = new SaschParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.game();
        if (parser.getNumberOfSyntaxErrors() > 0) {
            System.err.printf("%d error(s) detected%n", parser.getNumberOfSyntaxErrors());
            System.exit(1);
        }

        Game ast = new ExprBuilder().build(tree);
        boolean check = ast.checkStaticSemantic();
        if (!check) {
            System.out.printf("Same Champion cannot appear twice\n");
        } else {
            System.out.printf("\"%s\"%n", ast.toString());
            System.out.printf("\"%s\"%n", ast.checkDynamicSemantic());
        }
    }
}
