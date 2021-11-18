public class Game {
    public final Matchup top;
    public final Matchup jungle;
    public final Matchup mid;
    public final Matchup bot;
    public final Matchup support;

    public Game(Matchup top, Matchup jungle, Matchup mid, Matchup bot, Matchup support) {
        this.top = top;
        this.jungle = jungle;
        this.mid = mid;
        this.bot = bot;
        this.support = support;
    }

    public String toString() {
        return this.top + "\n" + this.jungle + "\n" + this.mid + "\n" + this.bot + "\n" + this.support;
    }
}
