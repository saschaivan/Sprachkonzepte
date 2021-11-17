// Matchup.java
public final class Matchup {
    public final Side left;
    public final Side right;

    public Matchup(Side left, Side right) {
        this.left = left;
        this.right = right;
    }

    public String toString() {
        return this.left + " vs. " + this.right;
    }
}