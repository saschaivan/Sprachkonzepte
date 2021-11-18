
// ExprBuilder.java
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public final class ExprBuilder extends SaschParserBaseListener {
    private Game game;
    private Stack<Side> side;
    private Stack<Matchup> matchup;
    private int[] score;
    String champion;
    List<String> itemsList = new LinkedList<String>();

    public Game build(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);
        return game;
    }

    @Override
    public void exitGame(SaschParser.GameContext ctx) {
        Matchup support = matchup.pop();
        Matchup bot = matchup.pop();
        Matchup mid = matchup.pop();
        Matchup jungle = matchup.pop();
        Matchup top = matchup.pop();
        this.game = new Game(top, jungle, mid, bot, support);
    }

    @Override
    public void exitMatchup(SaschParser.MatchupContext ctx) {
        Side right = side.pop();
        Side left = side.pop();
        matchup.push(new Matchup(left, right));
    }

    @Override
    public void exitSide(SaschParser.SideContext ctx) {
        side.push(new Side(champion, itemsList, score));
    }

    @Override
    public void exitScore(SaschParser.ScoreContext ctx) {
        String kills = ctx.kills().getText();
        String deaths = ctx.deaths().getText();
        String assists = ctx.assists().getText();
        this.score = new int[] { Integer.parseInt(kills), Integer.parseInt(deaths), Integer.parseInt(assists) };
    }

    @Override
    public void exitItems(SaschParser.ItemsContext ctx) {
        ctx.children.forEach(item -> {
            switch (item.getText()) {
            case "mythic":
                this.itemsList.add(item.getText());
                break;
            case "normal":
                this.itemsList.add(item.getText());
                break;
            case "unique":
                this.itemsList.add(item.getText());
                break;
            case "chargesStacks":
                this.itemsList.add(item.getText());
                break;
            default:
                break;
            }
        });
    }

    @Override
    public void exitChampion(SaschParser.ChampionContext ctx) {
        this.champion = ctx.Champion().getText();
    }
}
