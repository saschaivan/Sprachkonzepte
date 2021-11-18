// Generated from .\SaschParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SaschParser}.
 */
public interface SaschParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SaschParser#game}.
	 * @param ctx the parse tree
	 */
	void enterGame(SaschParser.GameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaschParser#game}.
	 * @param ctx the parse tree
	 */
	void exitGame(SaschParser.GameContext ctx);
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
	 * Enter a parse tree produced by {@link SaschParser#champion}.
	 * @param ctx the parse tree
	 */
	void enterChampion(SaschParser.ChampionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaschParser#champion}.
	 * @param ctx the parse tree
	 */
	void exitChampion(SaschParser.ChampionContext ctx);
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
	 * Enter a parse tree produced by {@link SaschParser#kills}.
	 * @param ctx the parse tree
	 */
	void enterKills(SaschParser.KillsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaschParser#kills}.
	 * @param ctx the parse tree
	 */
	void exitKills(SaschParser.KillsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaschParser#deaths}.
	 * @param ctx the parse tree
	 */
	void enterDeaths(SaschParser.DeathsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaschParser#deaths}.
	 * @param ctx the parse tree
	 */
	void exitDeaths(SaschParser.DeathsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaschParser#assists}.
	 * @param ctx the parse tree
	 */
	void enterAssists(SaschParser.AssistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaschParser#assists}.
	 * @param ctx the parse tree
	 */
	void exitAssists(SaschParser.AssistsContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link SaschParser#mythic}.
	 * @param ctx the parse tree
	 */
	void enterMythic(SaschParser.MythicContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaschParser#mythic}.
	 * @param ctx the parse tree
	 */
	void exitMythic(SaschParser.MythicContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaschParser#normal}.
	 * @param ctx the parse tree
	 */
	void enterNormal(SaschParser.NormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaschParser#normal}.
	 * @param ctx the parse tree
	 */
	void exitNormal(SaschParser.NormalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaschParser#unique}.
	 * @param ctx the parse tree
	 */
	void enterUnique(SaschParser.UniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaschParser#unique}.
	 * @param ctx the parse tree
	 */
	void exitUnique(SaschParser.UniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SaschParser#chargesStacks}.
	 * @param ctx the parse tree
	 */
	void enterChargesStacks(SaschParser.ChargesStacksContext ctx);
	/**
	 * Exit a parse tree produced by {@link SaschParser#chargesStacks}.
	 * @param ctx the parse tree
	 */
	void exitChargesStacks(SaschParser.ChargesStacksContext ctx);
}