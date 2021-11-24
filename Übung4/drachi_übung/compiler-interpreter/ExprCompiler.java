// ExprCompiler
import ast.Expr;
import ast.ExprVisitor;
import ast.Operation;
import ast.Value;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.UncheckedIOException;

public final class ExprCompiler implements ExprVisitor {
    private Appendable result;

    private static final int PRECISION = 6;

    public void print(Appendable result, Expr expr) {
        try {
            this.result = result;
            this.result.append("#!/usr/bin/dc\n");
            this.result.append(String.valueOf(PRECISION));
            this.result.append("\nk\n");
            expr.accept(this);
            this.result.append("p\n");
        } catch(IOException x) {
            throw new UncheckedIOException(x);
        }
    }

    @Override
    public void visitValue(Value value) {
        try {
            String v = value.getValue();
            if (v.startsWith("-")) {
                v = v.replace('-', '_');
            } else if (v.startsWith("+")) {
                v = v.substring(1);
            }
            this.result.append(v);
            this.result.append('\n');
        } catch(IOException x) {
            throw new UncheckedIOException(x);
        }
    }

    @Override
    public void exitOperation(Operation operation) {
        try {
            this.result.append(operation.getOperation());
            this.result.append('\n');
        } catch(IOException x) {
            throw new UncheckedIOException(x);
        }
    }
}

