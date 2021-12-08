import java.util.HashSet;
import java.util.Set;

public class Game {
    public final Matchup top;
    public final Matchup jungle;
    public final Matchup mid;
    public final Matchup bot;
    public final Matchup support;

    private final int championCount = 10;

    public Game(Matchup top, Matchup jungle, Matchup mid, Matchup bot, Matchup support) {
        this.top = top;
        this.jungle = jungle;
        this.mid = mid;
        this.bot = bot;
        this.support = support;
    }

    @Override
    public String toString() {
        return this.top + "\n" + this.jungle + "\n" + this.mid + "\n" + this.bot + "\n" + this.support;
    }

    public boolean checkStaticSemantic() {
        Set<String> champions = new HashSet<>();
        champions.add(this.top.left.getChampion());
        champions.add(this.top.right.getChampion());
        champions.add(this.jungle.left.getChampion());
        champions.add(this.jungle.right.getChampion());
        champions.add(this.mid.left.getChampion());
        champions.add(this.mid.right.getChampion());
        champions.add(this.bot.left.getChampion());
        champions.add(this.bot.right.getChampion());
        champions.add(this.support.left.getChampion());
        champions.add(this.support.right.getChampion());
        if (champions.size() < championCount)
            return false;
        return true;
    }

    public String checkDynamicSemantic() {
        int killsLeft = top.left.getScore()[0];
        killsLeft += jungle.left.getScore()[0];
        killsLeft += mid.left.getScore()[0];
        killsLeft += bot.left.getScore()[0];
        killsLeft += support.left.getScore()[0];
        int killsRight = top.right.getScore()[0];
        killsRight += jungle.right.getScore()[0];
        killsRight += mid.right.getScore()[0];
        killsRight += bot.right.getScore()[0];
        killsRight += support.right.getScore()[0];
        if (killsLeft < killsRight)
            return String.format("Right Side is leading with %d kills", killsRight - killsLeft);
        else if(killsLeft > killsRight)
            return String.format("Left Side is leading with %d kills", killsLeft - killsRight);
        else
            return String.format("Game is tied with %d kills", killsLeft);
    }
}
