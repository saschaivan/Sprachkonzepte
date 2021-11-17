import java.util.*;

public final class Side {
    private final String champion;
    private List<String> items = new LinkedList<String>();
    private int[] score = new int[3];

    public Side(String champion, List<String> items, int[] score) {
        this.champion = champion;
        this.items = items;
        this.score = score;
    }

    public String getChampion() {
        return this.champion;
    }

    public List<String> getItems() {
        return this.items;
    }

    public int[] getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        String delim = ", ";
        String res = String.join(delim, this.items);

        return this.champion + " : " + this.score[0] + "/" + this.score[1] + "/" + this.score[2] + " - " + "[" + res
                + "]";
    }
}