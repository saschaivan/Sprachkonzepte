
// ExprBuilder.java
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import javax.print.DocFlavor.STRING;

public final class ExprBuilder extends SaschParserBaseListener {
    private Matchup matchup;
    private Stack<Side> side;
    private int[] score;
    String champion; 
    List<String> itemsList = new LinkedList<String>();
    
    public Matchup build(ParseTree tree) {
        new ParseTreeWalker().walk(this, tree);
        return matchup;
    }

    @Override
    public void exitMatchup(SaschParser.MatchupContext ctx) {
        Side right = side.pop();
        Side left = side.pop();
        matchup = new Matchup(left, right);
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
        this.score[0] = Integer.parseInt(kills);
        this.score[1] = Integer.parseInt(deaths);
        this.score[2] = Integer.parseInt(assists);
    }

    @Override
    public void exitItems(SaschParser.ItemsContext ctx) {
        
    }

    @Override
    public void exitChampion(SaschParser.ChampionContext ctx) {
        this.champion = ctx.Champion().getText();
    }
}
