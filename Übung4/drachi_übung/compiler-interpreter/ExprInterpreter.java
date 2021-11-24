// ExprInterpreter
import ast.Expr;
import ast.ExprVisitor;
import ast.Operation;
import ast.Value;
import java.util.Stack;

public final class ExprInterpreter implements ExprVisitor {
    private Stack<Double> values = new Stack<Double>();

    public double interpret(Expr expr) {
        expr.accept(this);
        return this.values.pop();
    }

    @Override
    public void visitValue(Value value) {
        this.values.push(Double.valueOf(value.getValue()));
    }

    @Override
    public void exitOperation(Operation operation) {
        double rhs = this.values.pop();
        double lhs = this.values.pop();

        switch (operation.getOperation()) {
        case "+":
            this.values.push(lhs + rhs);
            break;
        case "-":
            this.values.push(lhs - rhs);
            break;
        case "*":
            this.values.push(lhs * rhs);
            break;
        case "/":
            this.values.push(lhs / rhs);
            break;
        default:
            this.values.push(Double.NaN);
        }
    }
}

