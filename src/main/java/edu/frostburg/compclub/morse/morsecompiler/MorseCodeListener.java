// Generated from C:/Users/Kevin/IdeaProjects/Morse/src/main/resources\MorseCode.g4 by ANTLR 4.5
package edu.frostburg.compclub.morse.morsecompiler;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MorseCodeParser}.
 */
public interface MorseCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MorseCodeParser#morsealpha}.
	 * @param ctx the parse tree
	 */
	void enterMorsealpha(@NotNull MorseCodeParser.MorsealphaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MorseCodeParser#morsealpha}.
	 * @param ctx the parse tree
	 */
	void exitMorsealpha(@NotNull MorseCodeParser.MorsealphaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MorseCodeParser#sequence}.
	 * @param ctx the parse tree
	 */
	void enterSequence(@NotNull MorseCodeParser.SequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MorseCodeParser#sequence}.
	 * @param ctx the parse tree
	 */
	void exitSequence(@NotNull MorseCodeParser.SequenceContext ctx);
}