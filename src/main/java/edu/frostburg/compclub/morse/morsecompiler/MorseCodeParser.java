// Generated from C:/Users/Kevin/IdeaProjects/Morse/src/main/resources\MorseCode.g4 by ANTLR 4.5
package edu.frostburg.compclub.morse.morsecompiler;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MorseCodeParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, A=2, B=3, C=4, D=5, E=6, F=7, G=8, H=9, I=10, J=11, K=12, L=13, 
		M=14, N=15, O=16, P=17, Q=18, R=19, S=20, T=21, U=22, V=23, W=24, X=25, 
		Y=26, Z=27, NUM0=28, NUM1=29, NUM2=30, NUM3=31, NUM4=32, NUM5=33, NUM6=34, 
		NUM7=35, NUM8=36, NUM9=37;
	public static final int
		RULE_morsealpha = 0, RULE_sequence = 1;
	public static final String[] ruleNames = {
		"morsealpha", "sequence"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'.-'", "'-...'", "'-.-.'", "'-..'", "'.'", "'..-.'", "'--.'", 
		"'....'", "'..'", "'.---'", "'-.-'", "'.-..'", "'--'", "'-.'", "'---'", 
		"'.--.'", "'--.-'", "'.-.'", "'...'", "'-'", "'..-'", "'...-'", "'.--'", 
		"'-..-'", "'-.--'", "'--..'", "'-----'", "'.----'", "'..---'", "'...--'", 
		"'....-'", "'.....'", "'-....'", "'--...'", "'---..'", "'----.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", 
		"M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", 
		"NUM0", "NUM1", "NUM2", "NUM3", "NUM4", "NUM5", "NUM6", "NUM7", "NUM8", 
		"NUM9"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override
	@NotNull
	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MorseCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MorseCodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class MorsealphaContext extends ParserRuleContext {
		public TerminalNode A() { return getToken(MorseCodeParser.A, 0); }
		public TerminalNode B() { return getToken(MorseCodeParser.B, 0); }
		public TerminalNode C() { return getToken(MorseCodeParser.C, 0); }
		public TerminalNode D() { return getToken(MorseCodeParser.D, 0); }
		public TerminalNode E() { return getToken(MorseCodeParser.E, 0); }
		public TerminalNode F() { return getToken(MorseCodeParser.F, 0); }
		public TerminalNode G() { return getToken(MorseCodeParser.G, 0); }
		public TerminalNode H() { return getToken(MorseCodeParser.H, 0); }
		public TerminalNode I() { return getToken(MorseCodeParser.I, 0); }
		public TerminalNode J() { return getToken(MorseCodeParser.J, 0); }
		public TerminalNode K() { return getToken(MorseCodeParser.K, 0); }
		public TerminalNode L() { return getToken(MorseCodeParser.L, 0); }
		public TerminalNode M() { return getToken(MorseCodeParser.M, 0); }
		public TerminalNode N() { return getToken(MorseCodeParser.N, 0); }
		public TerminalNode O() { return getToken(MorseCodeParser.O, 0); }
		public TerminalNode P() { return getToken(MorseCodeParser.P, 0); }
		public TerminalNode Q() { return getToken(MorseCodeParser.Q, 0); }
		public TerminalNode R() { return getToken(MorseCodeParser.R, 0); }
		public TerminalNode S() { return getToken(MorseCodeParser.S, 0); }
		public TerminalNode T() { return getToken(MorseCodeParser.T, 0); }
		public TerminalNode U() { return getToken(MorseCodeParser.U, 0); }
		public TerminalNode V() { return getToken(MorseCodeParser.V, 0); }
		public TerminalNode W() { return getToken(MorseCodeParser.W, 0); }
		public TerminalNode X() { return getToken(MorseCodeParser.X, 0); }
		public TerminalNode Y() { return getToken(MorseCodeParser.Y, 0); }
		public TerminalNode Z() { return getToken(MorseCodeParser.Z, 0); }
		public TerminalNode NUM0() { return getToken(MorseCodeParser.NUM0, 0); }
		public TerminalNode NUM1() { return getToken(MorseCodeParser.NUM1, 0); }
		public TerminalNode NUM2() { return getToken(MorseCodeParser.NUM2, 0); }
		public TerminalNode NUM3() { return getToken(MorseCodeParser.NUM3, 0); }
		public TerminalNode NUM4() { return getToken(MorseCodeParser.NUM4, 0); }
		public TerminalNode NUM5() { return getToken(MorseCodeParser.NUM5, 0); }
		public TerminalNode NUM6() { return getToken(MorseCodeParser.NUM6, 0); }
		public TerminalNode NUM7() { return getToken(MorseCodeParser.NUM7, 0); }
		public TerminalNode NUM8() { return getToken(MorseCodeParser.NUM8, 0); }
		public TerminalNode NUM9() { return getToken(MorseCodeParser.NUM9, 0); }
		public MorsealphaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_morsealpha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MorseCodeListener ) ((MorseCodeListener)listener).enterMorsealpha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MorseCodeListener ) ((MorseCodeListener)listener).exitMorsealpha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MorseCodeVisitor ) return ((MorseCodeVisitor<? extends T>)visitor).visitMorsealpha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MorsealphaContext morsealpha() throws RecognitionException {
		MorsealphaContext _localctx = new MorsealphaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_morsealpha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << NUM0) | (1L << NUM1) | (1L << NUM2) | (1L << NUM3) | (1L << NUM4) | (1L << NUM5) | (1L << NUM6) | (1L << NUM7) | (1L << NUM8) | (1L << NUM9))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SequenceContext extends ParserRuleContext {
		public List<MorsealphaContext> morsealpha() {
			return getRuleContexts(MorsealphaContext.class);
		}
		public MorsealphaContext morsealpha(int i) {
			return getRuleContext(MorsealphaContext.class,i);
		}
		public SequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MorseCodeListener ) ((MorseCodeListener)listener).enterSequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MorseCodeListener ) ((MorseCodeListener)listener).exitSequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MorseCodeVisitor ) return ((MorseCodeVisitor<? extends T>)visitor).visitSequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SequenceContext sequence() throws RecognitionException {
		SequenceContext _localctx = new SequenceContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(9);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << A) | (1L << B) | (1L << C) | (1L << D) | (1L << E) | (1L << F) | (1L << G) | (1L << H) | (1L << I) | (1L << J) | (1L << K) | (1L << L) | (1L << M) | (1L << N) | (1L << O) | (1L << P) | (1L << Q) | (1L << R) | (1L << S) | (1L << T) | (1L << U) | (1L << V) | (1L << W) | (1L << X) | (1L << Y) | (1L << Z) | (1L << NUM0) | (1L << NUM1) | (1L << NUM2) | (1L << NUM3) | (1L << NUM4) | (1L << NUM5) | (1L << NUM6) | (1L << NUM7) | (1L << NUM8) | (1L << NUM9))) != 0)) {
				{
				{
				setState(6); 
				morsealpha();
				}
				}
				setState(11);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\17\4\2\t\2\4\3"+
		"\t\3\3\2\3\2\3\3\7\3\n\n\3\f\3\16\3\r\13\3\3\3\2\2\4\2\4\2\3\3\2\4\'\r"+
		"\2\6\3\2\2\2\4\13\3\2\2\2\6\7\t\2\2\2\7\3\3\2\2\2\b\n\5\2\2\2\t\b\3\2"+
		"\2\2\n\r\3\2\2\2\13\t\3\2\2\2\13\f\3\2\2\2\f\5\3\2\2\2\r\13\3\2\2\2\3"+
		"\13";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}