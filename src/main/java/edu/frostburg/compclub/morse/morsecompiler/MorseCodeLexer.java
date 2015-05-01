// Generated from C:/Users/Kevin/IdeaProjects/Morse/src/main/resources\MorseCode.g4 by ANTLR 4.5
package edu.frostburg.compclub.morse.morsecompiler;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MorseCodeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, A=2, B=3, C=4, D=5, E=6, F=7, G=8, H=9, I=10, J=11, K=12, L=13, 
		M=14, N=15, O=16, P=17, Q=18, R=19, S=20, T=21, U=22, V=23, W=24, X=25, 
		Y=26, Z=27, NUM0=28, NUM1=29, NUM2=30, NUM3=31, NUM4=32, NUM5=33, NUM6=34, 
		NUM7=35, NUM8=36, NUM9=37;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"WS", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
		"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "NUM0", 
		"NUM1", "NUM2", "NUM3", "NUM4", "NUM5", "NUM6", "NUM7", "NUM8", "NUM9"
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


	public MorseCodeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MorseCode.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 1: 
			A_action((RuleContext)_localctx, actionIndex); 
			break;

		case 2: 
			B_action((RuleContext)_localctx, actionIndex); 
			break;

		case 3: 
			C_action((RuleContext)_localctx, actionIndex); 
			break;

		case 4: 
			D_action((RuleContext)_localctx, actionIndex); 
			break;

		case 5: 
			E_action((RuleContext)_localctx, actionIndex); 
			break;

		case 6: 
			F_action((RuleContext)_localctx, actionIndex); 
			break;

		case 7: 
			G_action((RuleContext)_localctx, actionIndex); 
			break;

		case 8: 
			H_action((RuleContext)_localctx, actionIndex); 
			break;

		case 9: 
			I_action((RuleContext)_localctx, actionIndex); 
			break;

		case 10: 
			J_action((RuleContext)_localctx, actionIndex); 
			break;

		case 11: 
			K_action((RuleContext)_localctx, actionIndex); 
			break;

		case 12: 
			L_action((RuleContext)_localctx, actionIndex); 
			break;

		case 13: 
			M_action((RuleContext)_localctx, actionIndex); 
			break;

		case 14: 
			N_action((RuleContext)_localctx, actionIndex); 
			break;

		case 15: 
			O_action((RuleContext)_localctx, actionIndex); 
			break;

		case 16: 
			P_action((RuleContext)_localctx, actionIndex); 
			break;

		case 17: 
			Q_action((RuleContext)_localctx, actionIndex); 
			break;

		case 18: 
			R_action((RuleContext)_localctx, actionIndex); 
			break;

		case 19: 
			S_action((RuleContext)_localctx, actionIndex); 
			break;

		case 20: 
			T_action((RuleContext)_localctx, actionIndex); 
			break;

		case 21: 
			U_action((RuleContext)_localctx, actionIndex); 
			break;

		case 22: 
			V_action((RuleContext)_localctx, actionIndex); 
			break;

		case 23: 
			W_action((RuleContext)_localctx, actionIndex); 
			break;

		case 24: 
			X_action((RuleContext)_localctx, actionIndex); 
			break;

		case 25: 
			Y_action((RuleContext)_localctx, actionIndex); 
			break;

		case 26: 
			Z_action((RuleContext)_localctx, actionIndex); 
			break;

		case 27: 
			NUM0_action((RuleContext)_localctx, actionIndex); 
			break;

		case 28: 
			NUM1_action((RuleContext)_localctx, actionIndex); 
			break;

		case 29: 
			NUM2_action((RuleContext)_localctx, actionIndex); 
			break;

		case 30: 
			NUM3_action((RuleContext)_localctx, actionIndex); 
			break;

		case 31: 
			NUM4_action((RuleContext)_localctx, actionIndex); 
			break;

		case 32: 
			NUM5_action((RuleContext)_localctx, actionIndex); 
			break;

		case 33: 
			NUM6_action((RuleContext)_localctx, actionIndex); 
			break;

		case 34: 
			NUM7_action((RuleContext)_localctx, actionIndex); 
			break;

		case 35: 
			NUM8_action((RuleContext)_localctx, actionIndex); 
			break;

		case 36: 
			NUM9_action((RuleContext)_localctx, actionIndex); 
			break;
		}
	}
	private void A_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: 
			System.out.print("A"); 
			break;
		}
	}
	private void B_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: 
			System.out.print("B"); 
			break;
		}
	}
	private void C_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: 
			System.out.print("C"); 
			break;
		}
	}
	private void D_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: 
			System.out.print("D"); 
			break;
		}
	}
	private void E_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: 
			System.out.print("E"); 
			break;
		}
	}
	private void F_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: 
			System.out.print("F"); 
			break;
		}
	}
	private void G_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: 
			System.out.print("G"); 
			break;
		}
	}
	private void H_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: 
			System.out.print("H"); 
			break;
		}
	}
	private void I_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: 
			System.out.print("I"); 
			break;
		}
	}
	private void J_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: 
			System.out.print("J"); 
			break;
		}
	}
	private void K_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: 
			System.out.print("K"); 
			break;
		}
	}
	private void L_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: 
			System.out.print("L"); 
			break;
		}
	}
	private void M_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: 
			System.out.print("M"); 
			break;
		}
	}
	private void N_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: 
			System.out.print("N"); 
			break;
		}
	}
	private void O_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 14: 
			System.out.print("O"); 
			break;
		}
	}
	private void P_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 15: 
			System.out.print("P"); 
			break;
		}
	}
	private void Q_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 16: 
			System.out.print("Q"); 
			break;
		}
	}
	private void R_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 17: 
			System.out.print("R"); 
			break;
		}
	}
	private void S_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 18: 
			System.out.print("S"); 
			break;
		}
	}
	private void T_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 19: 
			System.out.print("T"); 
			break;
		}
	}
	private void U_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 20: 
			System.out.print("U"); 
			break;
		}
	}
	private void V_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 21: 
			System.out.print("V"); 
			break;
		}
	}
	private void W_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 22: 
			System.out.print("W"); 
			break;
		}
	}
	private void X_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 23: 
			System.out.print("X"); 
			break;
		}
	}
	private void Y_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 24: 
			System.out.print("Y"); 
			break;
		}
	}
	private void Z_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 25: 
			System.out.print("Z"); 
			break;
		}
	}
	private void NUM0_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 26: 
			System.out.print("0"); 
			break;
		}
	}
	private void NUM1_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 27: 
			System.out.print("1"); 
			break;
		}
	}
	private void NUM2_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 28: 
			System.out.print("2"); 
			break;
		}
	}
	private void NUM3_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 29: 
			System.out.print("3"); 
			break;
		}
	}
	private void NUM4_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 30: 
			System.out.print("4"); 
			break;
		}
	}
	private void NUM5_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 31: 
			System.out.print("5"); 
			break;
		}
	}
	private void NUM6_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 32: 
			System.out.print("6"); 
			break;
		}
	}
	private void NUM7_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 33: 
			System.out.print("7"); 
			break;
		}
	}
	private void NUM8_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 34: 
			System.out.print("8"); 
			break;
		}
	}
	private void NUM9_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 35: 
			System.out.print("9"); 
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\'\u013f\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\2\2\'\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30"+
		"/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'\3\2\3\5\2\13\f"+
		"\17\17\"\"\u013e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5Q\3\2\2\2\7V\3\2"+
		"\2\2\t]\3\2\2\2\13d\3\2\2\2\rj\3\2\2\2\17m\3\2\2\2\21t\3\2\2\2\23z\3\2"+
		"\2\2\25\u0081\3\2\2\2\27\u0086\3\2\2\2\31\u008d\3\2\2\2\33\u0093\3\2\2"+
		"\2\35\u009a\3\2\2\2\37\u009f\3\2\2\2!\u00a4\3\2\2\2#\u00aa\3\2\2\2%\u00b1"+
		"\3\2\2\2\'\u00b8\3\2\2\2)\u00be\3\2\2\2+\u00c4\3\2\2\2-\u00c7\3\2\2\2"+
		"/\u00cd\3\2\2\2\61\u00d4\3\2\2\2\63\u00da\3\2\2\2\65\u00e1\3\2\2\2\67"+
		"\u00e8\3\2\2\29\u00ef\3\2\2\2;\u00f7\3\2\2\2=\u00ff\3\2\2\2?\u0107\3\2"+
		"\2\2A\u010f\3\2\2\2C\u0117\3\2\2\2E\u011f\3\2\2\2G\u0127\3\2\2\2I\u012f"+
		"\3\2\2\2K\u0137\3\2\2\2MN\t\2\2\2NO\3\2\2\2OP\b\2\2\2P\4\3\2\2\2QR\7\60"+
		"\2\2RS\7/\2\2ST\3\2\2\2TU\b\3\3\2U\6\3\2\2\2VW\7/\2\2WX\7\60\2\2XY\7\60"+
		"\2\2YZ\7\60\2\2Z[\3\2\2\2[\\\b\4\4\2\\\b\3\2\2\2]^\7/\2\2^_\7\60\2\2_"+
		"`\7/\2\2`a\7\60\2\2ab\3\2\2\2bc\b\5\5\2c\n\3\2\2\2de\7/\2\2ef\7\60\2\2"+
		"fg\7\60\2\2gh\3\2\2\2hi\b\6\6\2i\f\3\2\2\2jk\7\60\2\2kl\b\7\7\2l\16\3"+
		"\2\2\2mn\7\60\2\2no\7\60\2\2op\7/\2\2pq\7\60\2\2qr\3\2\2\2rs\b\b\b\2s"+
		"\20\3\2\2\2tu\7/\2\2uv\7/\2\2vw\7\60\2\2wx\3\2\2\2xy\b\t\t\2y\22\3\2\2"+
		"\2z{\7\60\2\2{|\7\60\2\2|}\7\60\2\2}~\7\60\2\2~\177\3\2\2\2\177\u0080"+
		"\b\n\n\2\u0080\24\3\2\2\2\u0081\u0082\7\60\2\2\u0082\u0083\7\60\2\2\u0083"+
		"\u0084\3\2\2\2\u0084\u0085\b\13\13\2\u0085\26\3\2\2\2\u0086\u0087\7\60"+
		"\2\2\u0087\u0088\7/\2\2\u0088\u0089\7/\2\2\u0089\u008a\7/\2\2\u008a\u008b"+
		"\3\2\2\2\u008b\u008c\b\f\f\2\u008c\30\3\2\2\2\u008d\u008e\7/\2\2\u008e"+
		"\u008f\7\60\2\2\u008f\u0090\7/\2\2\u0090\u0091\3\2\2\2\u0091\u0092\b\r"+
		"\r\2\u0092\32\3\2\2\2\u0093\u0094\7\60\2\2\u0094\u0095\7/\2\2\u0095\u0096"+
		"\7\60\2\2\u0096\u0097\7\60\2\2\u0097\u0098\3\2\2\2\u0098\u0099\b\16\16"+
		"\2\u0099\34\3\2\2\2\u009a\u009b\7/\2\2\u009b\u009c\7/\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009e\b\17\17\2\u009e\36\3\2\2\2\u009f\u00a0\7/\2\2\u00a0"+
		"\u00a1\7\60\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\b\20\20\2\u00a3 \3\2\2"+
		"\2\u00a4\u00a5\7/\2\2\u00a5\u00a6\7/\2\2\u00a6\u00a7\7/\2\2\u00a7\u00a8"+
		"\3\2\2\2\u00a8\u00a9\b\21\21\2\u00a9\"\3\2\2\2\u00aa\u00ab\7\60\2\2\u00ab"+
		"\u00ac\7/\2\2\u00ac\u00ad\7/\2\2\u00ad\u00ae\7\60\2\2\u00ae\u00af\3\2"+
		"\2\2\u00af\u00b0\b\22\22\2\u00b0$\3\2\2\2\u00b1\u00b2\7/\2\2\u00b2\u00b3"+
		"\7/\2\2\u00b3\u00b4\7\60\2\2\u00b4\u00b5\7/\2\2\u00b5\u00b6\3\2\2\2\u00b6"+
		"\u00b7\b\23\23\2\u00b7&\3\2\2\2\u00b8\u00b9\7\60\2\2\u00b9\u00ba\7/\2"+
		"\2\u00ba\u00bb\7\60\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\b\24\24\2\u00bd"+
		"(\3\2\2\2\u00be\u00bf\7\60\2\2\u00bf\u00c0\7\60\2\2\u00c0\u00c1\7\60\2"+
		"\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\b\25\25\2\u00c3*\3\2\2\2\u00c4\u00c5"+
		"\7/\2\2\u00c5\u00c6\b\26\26\2\u00c6,\3\2\2\2\u00c7\u00c8\7\60\2\2\u00c8"+
		"\u00c9\7\60\2\2\u00c9\u00ca\7/\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\b\27"+
		"\27\2\u00cc.\3\2\2\2\u00cd\u00ce\7\60\2\2\u00ce\u00cf\7\60\2\2\u00cf\u00d0"+
		"\7\60\2\2\u00d0\u00d1\7/\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\b\30\30\2"+
		"\u00d3\60\3\2\2\2\u00d4\u00d5\7\60\2\2\u00d5\u00d6\7/\2\2\u00d6\u00d7"+
		"\7/\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\b\31\31\2\u00d9\62\3\2\2\2\u00da"+
		"\u00db\7/\2\2\u00db\u00dc\7\60\2\2\u00dc\u00dd\7\60\2\2\u00dd\u00de\7"+
		"/\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b\32\32\2\u00e0\64\3\2\2\2\u00e1"+
		"\u00e2\7/\2\2\u00e2\u00e3\7\60\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e5\7/\2"+
		"\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\33\33\2\u00e7\66\3\2\2\2\u00e8\u00e9"+
		"\7/\2\2\u00e9\u00ea\7/\2\2\u00ea\u00eb\7\60\2\2\u00eb\u00ec\7\60\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ee\b\34\34\2\u00ee8\3\2\2\2\u00ef\u00f0\7/\2\2"+
		"\u00f0\u00f1\7/\2\2\u00f1\u00f2\7/\2\2\u00f2\u00f3\7/\2\2\u00f3\u00f4"+
		"\7/\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\b\35\35\2\u00f6:\3\2\2\2\u00f7"+
		"\u00f8\7\60\2\2\u00f8\u00f9\7/\2\2\u00f9\u00fa\7/\2\2\u00fa\u00fb\7/\2"+
		"\2\u00fb\u00fc\7/\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b\36\36\2\u00fe"+
		"<\3\2\2\2\u00ff\u0100\7\60\2\2\u0100\u0101\7\60\2\2\u0101\u0102\7/\2\2"+
		"\u0102\u0103\7/\2\2\u0103\u0104\7/\2\2\u0104\u0105\3\2\2\2\u0105\u0106"+
		"\b\37\37\2\u0106>\3\2\2\2\u0107\u0108\7\60\2\2\u0108\u0109\7\60\2\2\u0109"+
		"\u010a\7\60\2\2\u010a\u010b\7/\2\2\u010b\u010c\7/\2\2\u010c\u010d\3\2"+
		"\2\2\u010d\u010e\b  \2\u010e@\3\2\2\2\u010f\u0110\7\60\2\2\u0110\u0111"+
		"\7\60\2\2\u0111\u0112\7\60\2\2\u0112\u0113\7\60\2\2\u0113\u0114\7/\2\2"+
		"\u0114\u0115\3\2\2\2\u0115\u0116\b!!\2\u0116B\3\2\2\2\u0117\u0118\7\60"+
		"\2\2\u0118\u0119\7\60\2\2\u0119\u011a\7\60\2\2\u011a\u011b\7\60\2\2\u011b"+
		"\u011c\7\60\2\2\u011c\u011d\3\2\2\2\u011d\u011e\b\"\"\2\u011eD\3\2\2\2"+
		"\u011f\u0120\7/\2\2\u0120\u0121\7\60\2\2\u0121\u0122\7\60\2\2\u0122\u0123"+
		"\7\60\2\2\u0123\u0124\7\60\2\2\u0124\u0125\3\2\2\2\u0125\u0126\b##\2\u0126"+
		"F\3\2\2\2\u0127\u0128\7/\2\2\u0128\u0129\7/\2\2\u0129\u012a\7\60\2\2\u012a"+
		"\u012b\7\60\2\2\u012b\u012c\7\60\2\2\u012c\u012d\3\2\2\2\u012d\u012e\b"+
		"$$\2\u012eH\3\2\2\2\u012f\u0130\7/\2\2\u0130\u0131\7/\2\2\u0131\u0132"+
		"\7/\2\2\u0132\u0133\7\60\2\2\u0133\u0134\7\60\2\2\u0134\u0135\3\2\2\2"+
		"\u0135\u0136\b%%\2\u0136J\3\2\2\2\u0137\u0138\7/\2\2\u0138\u0139\7/\2"+
		"\2\u0139\u013a\7/\2\2\u013a\u013b\7/\2\2\u013b\u013c\7\60\2\2\u013c\u013d"+
		"\3\2\2\2\u013d\u013e\b&&\2\u013eL\3\2\2\2\3\2\'\b\2\2\3\3\2\3\4\3\3\5"+
		"\4\3\6\5\3\7\6\3\b\7\3\t\b\3\n\t\3\13\n\3\f\13\3\r\f\3\16\r\3\17\16\3"+
		"\20\17\3\21\20\3\22\21\3\23\22\3\24\23\3\25\24\3\26\25\3\27\26\3\30\27"+
		"\3\31\30\3\32\31\3\33\32\3\34\33\3\35\34\3\36\35\3\37\36\3 \37\3! \3\""+
		"!\3#\"\3$#\3%$\3&%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}