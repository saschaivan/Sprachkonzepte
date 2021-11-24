// ExprPrinter
import ast.Expr;
import ast.ExprVisitor;
import ast.Operation;
import ast.Value;
import java.io.IOException;
import java.io.UncheckedIOException;

public final class ExprPrinter implements ExprVisitor {
    private Appendable result;

    public void print(Appendable result, Expr expr) {
        this.result = result;
        expr.accept(this);
    }

    @Override
    public void visitValue(Value value) {
        try {
            this.result.append(value.getValue());
        } catch(IOException x) {
            throw new UncheckedIOException(x);
        }
    }

    @Override
    public void enterOperation(Operation operation) {
        try {
            this.result.append('(');
        } catch(IOException x) {
            throw new UncheckedIOException(x);
        }
    }

    @Override
    public void visitOperation(Operation operation) {
        try {
            this.result.append(operation.getOperation());
        } catch(IOException x) {
            throw new UncheckedIOException(x);
        }
    }

    @Override
    public void exitOperation(Operation operation) {
        try {
            this.result.append(')');
        } catch(IOException x) {
            throw new UncheckedIOException(x);
        }
    }
}

