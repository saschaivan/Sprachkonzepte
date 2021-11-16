// Matchup.java
public final class Matchup extends Expr {
    public final Expr left;
    public final Expr right;

    public Matchup(Expr left, Expr right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return this.left + " vs. " + this.right;
    }
}