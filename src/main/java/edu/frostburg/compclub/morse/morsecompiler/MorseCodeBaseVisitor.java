// Generated from C:/Users/Kevin/IdeaProjects/Morse/src/main/resources\MorseCode.g4 by ANTLR 4.5
package edu.frostburg.compclub.morse.morsecompiler;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link MorseCodeVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class MorseCodeBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements MorseCodeVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitMorsealpha(@NotNull MorseCodeParser.MorsealphaContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitSequence(@NotNull MorseCodeParser.SequenceContext ctx) { return visitChildren(ctx); }
}