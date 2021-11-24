
// ExprBuilder.java
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.ArrayList;
import java.util.Stack;

public final class ExprBuilder extends SaschParserBaseListener {
    private Game game;
    private Stack<Side> side = new Stack<Side>();
    private Stack<Matchup> matchup = new Stack<Matchup>();
    private int[] score;
    String champion;
    ArrayList<String> itemsList = new ArrayList<String>();
    int counter;

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
        ArrayList<String> copied =  new ArrayList<String>(itemsList);
        side.push(new Side(champion, copied, score));
        itemsList.clear();
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
        counter = 0;
        ctx.children.forEach(item -> {
            switch (item.getText()) {
            case "[":
                break;
            case ", ":
                break;
            case "]":
                break;
            default:
                itemsList.add(item.getText());      
                break;
            }
        });
    }

    @Override
    public void exitChampion(SaschParser.ChampionContext ctx) {
        this.champion = ctx.Champion().getText();
    }
}
