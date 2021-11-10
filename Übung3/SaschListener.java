// Generated from .\Sasch.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SaschParser}.
 */
public interface SaschListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SaschParser#matchup}.
	 * @param ctx the parse tree
	 */
	void enterMatchup(SaschParser.MatchupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaschParser#matchup}.
	 * @param ctx the parse tree
	 */
	void exitMatchup(SaschParser.MatchupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaschParser#side}.
	 * @param ctx the parse tree
	 */
	void enterSide(SaschParser.SideContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaschParser#side}.
	 * @param ctx the parse tree
	 */
	void exitSide(SaschParser.SideContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaschParser#score}.
	 * @param ctx the parse tree
	 */
	void enterScore(SaschParser.ScoreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaschParser#score}.
	 * @param ctx the parse tree
	 */
	void exitScore(SaschParser.ScoreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaschParser#items}.
	 * @param ctx the parse tree
	 */
	void enterItems(SaschParser.ItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaschParser#items}.
	 * @param ctx the parse tree
	 */
	void exitItems(SaschParser.ItemsContext ctx);
}