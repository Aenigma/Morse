// Generated from C:/Users/Kevin/IdeaProjects/Morse/src/main/resources\MorseCode.g4 by ANTLR 4.5
package edu.frostburg.compclub.morse.morsecompiler;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MorseCodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MorseCodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MorseCodeParser#morsealpha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMorsealpha(@NotNull MorseCodeParser.MorsealphaContext ctx);
	/**
	 * Visit a parse tree produced by {@link MorseCodeParser#sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(@NotNull MorseCodeParser.SequenceContext ctx);
}