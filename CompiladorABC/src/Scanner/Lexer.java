/* The following code was generated by JFlex 1.7.0 */

package Scanner;
import Parser.sym;
import java_cup.runtime.*;
import Clases.ScannerException;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>C:/Users/yanil/Documents/COMPILADORABC/CompiladorABC/CompiladorABC/src/Scanner/Lexer.flex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMENTARIOS1 = 2;
  public static final int COMENTARIOS2 = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\4\1\10\1\10\1\4\22\0\1\55\1\6\1\53"+
    "\4\6\1\0\1\11\1\51\1\12\1\44\1\42\1\46\1\5\1\7"+
    "\1\54\11\2\1\52\1\43\1\50\1\45\1\47\1\0\1\6\1\24"+
    "\1\14\1\25\1\33\1\15\1\34\1\16\1\26\1\20\2\1\1\23"+
    "\1\37\1\21\1\22\1\36\1\1\1\27\1\31\1\32\1\35\1\40"+
    "\1\41\3\1\1\6\1\0\4\6\1\24\1\14\1\25\1\33\1\15"+
    "\1\34\1\16\1\26\1\20\2\1\1\23\1\37\1\21\1\22\1\36"+
    "\1\1\1\27\1\31\1\32\1\35\1\40\1\41\3\1\1\13\1\6"+
    "\1\56\1\6\6\0\1\10\153\0\1\6\76\0\2\17\115\0\1\30"+
    "\u1ea8\0\1\10\1\10\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\4\1\1\1\5\1\6"+
    "\1\7\1\10\2\2\1\1\7\2\1\1\10\2\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\1\1\3\3\4\1\22\1\23\1\3\1\24\1\25"+
    "\1\4\1\26\1\27\1\30\4\2\1\0\1\31\1\2"+
    "\1\31\1\2\1\32\5\2\2\0\2\2\1\33\1\2"+
    "\1\0\1\2\1\34\7\2\1\35\1\36\1\0\1\37"+
    "\1\40\1\41\1\42\1\43\1\44\1\0\1\45\1\0"+
    "\1\23\1\24\1\23\1\46\1\47\2\2\1\50\1\0"+
    "\1\2\2\51\1\52\1\2\1\53\3\2\2\0\3\2"+
    "\2\54\1\55\2\2\1\56\1\57\1\0\1\2\1\0"+
    "\1\2\2\0\2\46\1\0\1\23\1\0\2\2\2\60"+
    "\1\2\1\0\1\2\1\61\1\62\1\63\2\0\2\2"+
    "\1\64\3\2\1\0\1\2\1\0\1\2\1\0\2\46"+
    "\1\0\1\23\2\65\1\2\1\0\1\2\2\66\2\0"+
    "\5\2\2\67\2\70\1\71\1\0\1\2\1\0\1\2"+
    "\1\0\1\72\1\2\1\72\1\0\3\2\1\73\2\74"+
    "\1\0\1\2\1\0\1\2\1\75\1\2\2\76\2\77"+
    "\1\2\1\100";

  private static int [] zzUnpackAction() {
    int [] result = new int[211];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\136\0\215\0\274\0\353\0\215\0\u011a"+
    "\0\u0149\0\u0178\0\u01a7\0\215\0\u01d6\0\u0205\0\u0234\0\u0263"+
    "\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db"+
    "\0\u040a\0\u0439\0\u0468\0\u0497\0\u04c6\0\u04f5\0\u0524\0\215"+
    "\0\215\0\u0553\0\215\0\u0582\0\u05b1\0\u05e0\0\215\0\u060f"+
    "\0\u063e\0\u066d\0\u069c\0\u06cb\0\u06fa\0\215\0\u0729\0\u0758"+
    "\0\u0787\0\u011a\0\u07b6\0\215\0\215\0\215\0\u07e5\0\u0814"+
    "\0\u0843\0\u0872\0\u08a1\0\215\0\u08d0\0\274\0\u08ff\0\274"+
    "\0\u092e\0\u095d\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0a77"+
    "\0\u0aa6\0\274\0\u0ad5\0\u0b04\0\u0b33\0\274\0\u0b62\0\u0b91"+
    "\0\u0bc0\0\u0bef\0\u0c1e\0\u0c4d\0\u0c7c\0\215\0\215\0\u0cab"+
    "\0\215\0\215\0\215\0\215\0\215\0\215\0\u063e\0\215"+
    "\0\u0cda\0\u0d09\0\u0d38\0\u0d67\0\u0d96\0\u0dc5\0\u0df4\0\u0e23"+
    "\0\274\0\u0e52\0\u0e81\0\215\0\274\0\274\0\u0eb0\0\274"+
    "\0\u0edf\0\u0f0e\0\u0f3d\0\u0f6c\0\u0f9b\0\u0fca\0\u0ff9\0\u1028"+
    "\0\215\0\274\0\274\0\u1057\0\u1086\0\274\0\274\0\u10b5"+
    "\0\u10e4\0\u1113\0\u1142\0\u1171\0\u11a0\0\u0d38\0\u11cf\0\u11fe"+
    "\0\u122d\0\u125c\0\u128b\0\u12ba\0\215\0\274\0\u12e9\0\u1318"+
    "\0\u1347\0\274\0\274\0\274\0\u1376\0\u13a5\0\u13d4\0\u1403"+
    "\0\274\0\u1432\0\u1461\0\u1490\0\u14bf\0\u14ee\0\u151d\0\u154c"+
    "\0\u157b\0\u11fe\0\u15aa\0\u15d9\0\215\0\215\0\274\0\u1608"+
    "\0\u1637\0\u1666\0\215\0\274\0\u1695\0\u16c4\0\u16f3\0\u1722"+
    "\0\u1751\0\u1780\0\u17af\0\215\0\274\0\215\0\274\0\u17de"+
    "\0\u17de\0\u180d\0\u183c\0\u186b\0\u189a\0\215\0\u18c9\0\274"+
    "\0\u18f8\0\u1927\0\u1956\0\u1985\0\274\0\215\0\274\0\u19b4"+
    "\0\u19e3\0\u1a12\0\u1a41\0\274\0\u1a70\0\215\0\274\0\215"+
    "\0\274\0\u1a9f\0\274";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[211];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\2\7\1\10\1\4\1\11\1\0"+
    "\1\12\1\13\1\14\1\15\1\16\1\5\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\25\1\5\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\5\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\45\1\46"+
    "\1\47\1\50\1\51\1\52\1\7\1\4\12\53\1\54"+
    "\44\53\56\55\1\56\60\0\2\5\11\0\3\5\1\0"+
    "\10\5\1\0\11\5\12\0\1\5\3\0\1\57\1\60"+
    "\2\0\1\61\6\0\3\57\1\0\10\57\1\0\11\57"+
    "\12\0\1\60\4\0\1\62\51\0\1\62\11\0\1\63"+
    "\35\0\1\64\23\0\1\65\111\0\1\66\12\0\2\5"+
    "\11\0\1\5\1\67\1\5\1\0\2\5\1\70\5\5"+
    "\1\0\11\5\12\0\1\5\3\0\2\5\11\0\3\5"+
    "\1\0\1\5\1\71\1\5\1\72\4\5\1\0\11\5"+
    "\12\0\1\5\23\0\1\73\12\0\1\74\23\0\2\5"+
    "\11\0\3\5\1\0\1\5\1\75\6\5\1\0\3\5"+
    "\1\76\5\5\12\0\1\5\3\0\2\5\11\0\3\5"+
    "\1\0\2\5\1\77\5\5\1\0\11\5\12\0\1\5"+
    "\3\0\2\5\11\0\3\5\1\0\7\5\1\100\1\0"+
    "\11\5\12\0\1\5\3\0\2\5\11\0\3\5\1\0"+
    "\2\5\1\101\5\5\1\0\11\5\12\0\1\5\3\0"+
    "\2\5\11\0\3\5\1\0\1\5\1\102\6\5\1\0"+
    "\11\5\12\0\1\5\3\0\2\5\11\0\3\5\1\0"+
    "\2\5\1\103\3\5\1\104\1\5\1\0\11\5\12\0"+
    "\1\5\3\0\2\5\11\0\1\5\1\105\1\5\1\0"+
    "\10\5\1\0\11\5\12\0\1\5\30\0\1\106\3\0"+
    "\1\107\25\0\2\5\11\0\3\5\1\0\6\5\1\110"+
    "\1\5\1\0\1\5\1\111\7\5\12\0\1\5\3\0"+
    "\2\5\11\0\3\5\1\0\2\5\1\112\3\5\1\113"+
    "\1\5\1\0\11\5\12\0\1\5\3\0\2\5\11\0"+
    "\3\5\1\114\1\115\1\5\1\116\5\5\1\0\11\5"+
    "\12\0\1\5\3\0\2\5\11\0\3\5\1\0\2\5"+
    "\1\117\5\5\1\0\4\5\1\120\4\5\12\0\1\5"+
    "\3\0\2\5\11\0\3\5\1\0\7\5\1\121\1\0"+
    "\11\5\12\0\1\5\3\0\2\5\11\0\3\5\1\0"+
    "\2\5\1\122\5\5\1\0\11\5\12\0\1\5\3\0"+
    "\2\5\11\0\3\5\1\0\4\5\1\123\3\5\1\0"+
    "\11\5\12\0\1\5\3\0\2\5\11\0\3\5\1\0"+
    "\6\5\1\124\1\125\1\0\11\5\12\0\1\5\46\0"+
    "\1\126\1\127\13\0\1\130\42\0\1\131\1\132\5\0"+
    "\1\130\47\0\1\133\56\0\1\134\1\0\1\135\54\0"+
    "\1\136\12\0\7\137\1\0\2\137\1\0\3\137\1\0"+
    "\10\137\1\0\12\137\1\0\6\137\1\0\1\140\2\137"+
    "\2\0\1\57\1\141\2\0\1\61\6\0\3\57\1\0"+
    "\10\57\1\0\11\57\12\0\1\141\2\0\12\53\1\0"+
    "\44\53\51\0\1\56\5\0\56\55\2\0\2\57\2\0"+
    "\1\142\6\0\3\57\1\0\10\57\1\0\11\57\12\0"+
    "\1\57\3\0\1\57\1\60\2\0\1\143\6\0\1\57"+
    "\1\144\1\57\1\0\10\57\1\0\11\57\12\0\1\60"+
    "\3\0\1\142\1\145\2\0\1\146\6\0\3\142\1\0"+
    "\10\142\1\0\11\142\12\0\1\145\2\0\4\63\1\0"+
    "\3\63\1\0\46\63\1\0\2\5\11\0\2\5\1\147"+
    "\1\0\10\5\1\0\11\5\12\0\1\5\3\0\2\5"+
    "\11\0\3\5\1\0\2\5\1\150\5\5\1\0\11\5"+
    "\12\0\1\5\3\0\2\5\11\0\3\5\1\0\10\5"+
    "\1\0\2\5\1\151\6\5\12\0\1\5\3\0\2\5"+
    "\11\0\3\5\1\0\10\5\1\152\1\153\10\5\12\0"+
    "\1\5\34\0\1\154\25\0\2\5\11\0\3\5\1\0"+
    "\10\5\1\0\1\5\1\155\7\5\12\0\1\5\3\0"+
    "\2\5\11\0\3\5\1\0\10\5\1\0\1\5\1\156"+
    "\7\5\12\0\1\5\3\0\2\5\11\0\3\5\1\0"+
    "\1\5\1\157\6\5\1\0\11\5\12\0\1\5\3\0"+
    "\2\5\11\0\3\5\1\0\10\5\1\0\2\5\1\160"+
    "\6\5\12\0\1\5\3\0\2\5\11\0\3\5\1\0"+
    "\1\5\1\161\6\5\1\0\11\5\12\0\1\5\3\0"+
    "\2\5\11\0\3\5\1\0\4\5\1\162\3\5\1\0"+
    "\11\5\12\0\1\5\3\0\2\5\11\0\3\5\1\0"+
    "\4\5\1\163\3\5\1\0\11\5\12\0\1\5\24\0"+
    "\1\164\63\0\1\165\30\0\2\5\11\0\3\5\1\0"+
    "\2\5\1\166\5\5\1\0\11\5\12\0\1\5\3\0"+
    "\2\5\11\0\3\5\1\0\7\5\1\167\1\0\11\5"+
    "\12\0\1\5\3\0\2\5\11\0\1\5\1\170\1\5"+
    "\1\0\10\5\1\0\11\5\12\0\1\5\42\0\1\171"+
    "\17\0\2\5\11\0\3\5\1\0\10\5\1\0\7\5"+
    "\1\172\1\5\12\0\1\5\3\0\2\5\11\0\3\5"+
    "\1\0\7\5\1\173\1\0\11\5\12\0\1\5\3\0"+
    "\2\5\11\0\3\5\1\0\1\5\1\174\6\5\1\0"+
    "\11\5\12\0\1\5\3\0\2\5\11\0\3\5\1\0"+
    "\2\5\1\175\5\5\1\0\11\5\12\0\1\5\3\0"+
    "\2\5\11\0\3\5\1\0\10\5\1\0\2\5\1\176"+
    "\6\5\12\0\1\5\3\0\2\5\11\0\3\5\1\0"+
    "\7\5\1\177\1\0\11\5\12\0\1\5\3\0\2\5"+
    "\11\0\3\5\1\200\1\201\7\5\1\0\11\5\12\0"+
    "\1\5\3\0\2\5\11\0\3\5\1\202\1\203\7\5"+
    "\1\0\11\5\12\0\1\5\4\0\1\204\2\0\1\205"+
    "\46\0\1\204\3\0\1\57\1\141\2\0\1\143\6\0"+
    "\1\57\1\144\1\57\1\0\10\57\1\0\11\57\12\0"+
    "\1\141\3\0\2\142\11\0\3\142\1\0\10\142\1\0"+
    "\11\142\12\0\1\142\3\0\1\142\1\206\2\0\1\146"+
    "\6\0\3\142\1\0\10\142\1\0\11\142\12\0\1\206"+
    "\3\0\1\57\1\207\2\0\1\142\6\0\3\57\1\0"+
    "\10\57\1\0\11\57\2\0\1\210\1\0\1\210\5\0"+
    "\1\207\3\0\1\142\1\145\2\0\1\146\6\0\1\142"+
    "\1\211\1\142\1\0\10\142\1\0\11\142\12\0\1\145"+
    "\4\0\1\146\2\0\1\146\46\0\1\146\3\0\2\5"+
    "\11\0\3\5\1\212\1\213\7\5\1\0\11\5\12\0"+
    "\1\5\3\0\2\5\11\0\3\5\1\0\3\5\1\214"+
    "\4\5\1\0\11\5\12\0\1\5\17\0\1\215\42\0"+
    "\2\5\11\0\1\5\1\216\1\5\1\0\10\5\1\0"+
    "\11\5\12\0\1\5\3\0\2\5\11\0\2\5\1\217"+
    "\1\0\10\5\1\0\11\5\12\0\1\5\3\0\2\5"+
    "\11\0\3\5\1\0\10\5\1\220\1\221\10\5\12\0"+
    "\1\5\3\0\2\5\11\0\3\5\1\0\7\5\1\222"+
    "\1\0\11\5\12\0\1\5\3\0\2\5\11\0\3\5"+
    "\1\0\3\5\1\223\4\5\1\0\2\5\1\224\6\5"+
    "\12\0\1\5\31\0\1\225\46\0\2\226\37\0\2\5"+
    "\11\0\3\5\1\0\7\5\1\227\1\0\11\5\12\0"+
    "\1\5\3\0\2\5\11\0\3\5\1\226\1\230\7\5"+
    "\1\0\11\5\12\0\1\5\3\0\2\5\11\0\3\5"+
    "\1\0\1\5\1\231\6\5\1\0\11\5\12\0\1\5"+
    "\3\0\2\5\11\0\3\5\1\0\5\5\1\232\2\5"+
    "\1\0\11\5\12\0\1\5\3\0\2\5\11\0\2\5"+
    "\1\233\1\0\5\5\1\234\2\5\1\0\11\5\12\0"+
    "\1\5\25\0\1\235\34\0\2\5\11\0\3\5\1\0"+
    "\3\5\1\236\4\5\1\0\11\5\12\0\1\5\34\0"+
    "\1\237\25\0\2\5\11\0\3\5\1\0\10\5\1\0"+
    "\1\5\1\240\7\5\12\0\1\5\4\0\1\204\12\0"+
    "\1\241\36\0\1\204\4\0\1\204\51\0\1\204\3\0"+
    "\1\57\1\207\2\0\1\142\6\0\3\57\1\0\10\57"+
    "\1\0\11\57\12\0\1\207\4\0\1\242\51\0\1\242"+
    "\3\0\1\142\1\243\11\0\3\142\1\0\10\142\1\0"+
    "\11\142\2\0\1\244\1\0\1\244\5\0\1\243\1\245"+
    "\22\0\1\246\36\0\2\5\11\0\3\5\1\0\1\5"+
    "\1\247\6\5\1\0\11\5\12\0\1\5\3\0\2\5"+
    "\11\0\1\5\1\250\1\5\1\0\10\5\1\0\11\5"+
    "\12\0\1\5\3\0\2\5\11\0\3\5\1\251\1\252"+
    "\7\5\1\0\11\5\12\0\1\5\34\0\1\253\25\0"+
    "\2\5\11\0\3\5\1\0\10\5\1\0\1\5\1\254"+
    "\7\5\12\0\1\5\34\0\1\255\45\0\1\256\36\0"+
    "\2\5\11\0\3\5\1\0\10\5\1\0\1\5\1\257"+
    "\7\5\12\0\1\5\3\0\2\5\11\0\3\5\1\0"+
    "\1\5\1\260\6\5\1\0\11\5\12\0\1\5\3\0"+
    "\2\5\11\0\3\5\1\0\10\5\1\0\1\5\1\261"+
    "\7\5\12\0\1\5\3\0\2\5\11\0\3\5\1\0"+
    "\7\5\1\262\1\0\11\5\12\0\1\5\3\0\2\5"+
    "\11\0\1\5\1\263\1\5\1\0\10\5\1\0\11\5"+
    "\12\0\1\5\17\0\1\264\42\0\2\5\11\0\1\5"+
    "\1\265\1\5\1\0\10\5\1\0\11\5\12\0\1\5"+
    "\17\0\1\266\42\0\2\5\11\0\1\5\1\267\1\5"+
    "\1\0\10\5\1\0\11\5\12\0\1\5\4\0\1\270"+
    "\41\0\1\271\1\0\1\271\5\0\1\270\3\0\1\142"+
    "\1\243\11\0\3\142\1\0\10\142\1\0\11\142\12\0"+
    "\1\243\4\0\1\242\51\0\1\242\1\245\2\0\2\5"+
    "\11\0\3\5\1\0\4\5\1\272\3\5\1\0\11\5"+
    "\12\0\1\5\23\0\1\273\36\0\2\5\11\0\3\5"+
    "\1\0\1\5\1\274\6\5\1\0\11\5\12\0\1\5"+
    "\21\0\2\275\54\0\1\276\41\0\2\5\11\0\3\5"+
    "\1\275\1\277\7\5\1\0\11\5\12\0\1\5\3\0"+
    "\2\5\11\0\2\5\1\300\1\0\10\5\1\0\11\5"+
    "\12\0\1\5\3\0\2\5\11\0\3\5\1\301\1\302"+
    "\7\5\1\0\11\5\12\0\1\5\3\0\2\5\11\0"+
    "\3\5\1\0\4\5\1\303\3\5\1\0\11\5\12\0"+
    "\1\5\3\0\2\5\11\0\3\5\1\0\10\5\1\0"+
    "\2\5\1\304\6\5\12\0\1\5\4\0\1\270\51\0"+
    "\1\270\3\0\2\5\11\0\3\5\1\0\1\5\1\305"+
    "\6\5\1\0\11\5\12\0\1\5\34\0\1\306\25\0"+
    "\2\5\11\0\3\5\1\0\10\5\1\0\1\5\1\307"+
    "\7\5\12\0\1\5\23\0\1\310\36\0\2\5\11\0"+
    "\3\5\1\0\1\5\1\311\6\5\1\0\11\5\12\0"+
    "\1\5\24\0\1\312\35\0\2\5\11\0\3\5\1\0"+
    "\2\5\1\313\5\5\1\0\11\5\12\0\1\5\3\0"+
    "\2\5\11\0\3\5\1\0\10\5\1\0\6\5\1\314"+
    "\2\5\12\0\1\5\3\0\2\5\11\0\3\5\1\0"+
    "\10\5\1\0\4\5\1\315\4\5\12\0\1\5\34\0"+
    "\1\316\25\0\2\5\11\0\3\5\1\0\10\5\1\0"+
    "\1\5\1\317\7\5\12\0\1\5\23\0\1\320\36\0"+
    "\2\5\11\0\3\5\1\0\1\5\1\321\6\5\1\0"+
    "\11\5\12\0\1\5\3\0\2\5\11\0\3\5\1\0"+
    "\7\5\1\322\1\0\11\5\12\0\1\5\3\0\2\5"+
    "\11\0\1\5\1\323\1\5\1\0\10\5\1\0\11\5"+
    "\12\0\1\5\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6862];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\2\1\1\11\4\1\1\11\23\1\2\11"+
    "\1\1\1\11\3\1\1\11\6\1\1\11\5\1\3\11"+
    "\4\1\1\0\1\11\11\1\2\0\4\1\1\0\11\1"+
    "\2\11\1\0\6\11\1\0\1\11\1\0\10\1\1\0"+
    "\1\1\1\11\7\1\2\0\3\1\1\11\6\1\1\0"+
    "\1\1\1\0\1\1\2\0\2\1\1\0\1\1\1\0"+
    "\2\1\1\11\2\1\1\0\4\1\2\0\6\1\1\0"+
    "\1\1\1\0\1\1\1\0\2\1\1\0\2\11\2\1"+
    "\1\0\1\1\1\11\1\1\2\0\5\1\1\11\1\1"+
    "\1\11\2\1\1\0\1\1\1\0\1\1\1\0\1\11"+
    "\2\1\1\0\4\1\1\11\1\1\1\0\1\1\1\0"+
    "\3\1\1\11\1\1\1\11\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[211];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    public String lexeme;

    public int yyline() {
    	return this.yyline;
    }

    public void error(String msg, String caracteres, int linea) throws ScannerException {
        throw new ScannerException(msg, caracteres, linea+1);
    }

    private Symbol symbol(int type) {
        return new Symbol(type, yytext());
    }



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 220) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException, ScannerException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
            switch (zzLexicalState) {
            case COMENTARIOS1: {
              yybegin(YYINITIAL); error("Comentario sin finalizar.", yytext(),yyline());
            }  // fall though
            case 212: break;
            case COMENTARIOS2: {
              yybegin(YYINITIAL); error("Comentario sin finalizar.", yytext(),yyline());
            }  // fall though
            case 213: break;
            default:
              {
                return symbol(sym.EOF);
              }
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { error("El caracter es inválido", yytext(), yyline());
            } 
            // fall through
          case 65: break;
          case 2: 
            { return symbol(sym.IDENTIFICADOR);
            } 
            // fall through
          case 66: break;
          case 3: 
            { return symbol(sym.INTEGER);
            } 
            // fall through
          case 67: break;
          case 4: 
            { /*Ignore*/
            } 
            // fall through
          case 68: break;
          case 5: 
            { return symbol(sym.OpDIV);
            } 
            // fall through
          case 69: break;
          case 6: 
            { return symbol(sym.PARENTESIS_ABRE);
            } 
            // fall through
          case 70: break;
          case 7: 
            { return symbol(sym.OpMUL);
            } 
            // fall through
          case 71: break;
          case 8: 
            { yybegin(COMENTARIOS2);
            } 
            // fall through
          case 72: break;
          case 9: 
            { return symbol(sym.COMA);
            } 
            // fall through
          case 73: break;
          case 10: 
            { return symbol(sym.PUNTOYCOMA);
            } 
            // fall through
          case 74: break;
          case 11: 
            { return symbol(sym.OpSUMA);
            } 
            // fall through
          case 75: break;
          case 12: 
            { return symbol(sym.OpIGUAL);
            } 
            // fall through
          case 76: break;
          case 13: 
            { return symbol(sym.OpRESTA);
            } 
            // fall through
          case 77: break;
          case 14: 
            { return symbol(sym.OpMAYOR);
            } 
            // fall through
          case 78: break;
          case 15: 
            { return symbol(sym.OpMENOR);
            } 
            // fall through
          case 79: break;
          case 16: 
            { return symbol(sym.PARENTESIS_CIERRA);
            } 
            // fall through
          case 80: break;
          case 17: 
            { return symbol(sym.DOS_PUNTOS);
            } 
            // fall through
          case 81: break;
          case 18: 
            { yybegin(YYINITIAL);
            } 
            // fall through
          case 82: break;
          case 19: 
            { error("Número erróneo: no se puede ingresar letras dentro de un número.", yytext(),yyline());
            } 
            // fall through
          case 83: break;
          case 20: 
            { error("Número erróneo: no se puede finalizar un número con punto", yytext(),yyline());
            } 
            // fall through
          case 84: break;
          case 21: 
            { error("Número erróneo: no se puede iniciar un número con punto", yytext(),yyline());
            } 
            // fall through
          case 85: break;
          case 22: 
            { return symbol(sym.OprASIG_DIV);
            } 
            // fall through
          case 86: break;
          case 23: 
            { yybegin(COMENTARIOS1);
            } 
            // fall through
          case 87: break;
          case 24: 
            { return symbol(sym.OprASIG_MUL);
            } 
            // fall through
          case 88: break;
          case 25: 
            { return symbol(sym.IF);
            } 
            // fall through
          case 89: break;
          case 26: 
            { return symbol(sym.OpOR);
            } 
            // fall through
          case 90: break;
          case 27: 
            { return symbol(sym.TO);
            } 
            // fall through
          case 91: break;
          case 28: 
            { return symbol(sym.DO);
            } 
            // fall through
          case 92: break;
          case 29: 
            { return symbol(sym.Op_INC);
            } 
            // fall through
          case 93: break;
          case 30: 
            { return symbol(sym.OprASIG_MAS);
            } 
            // fall through
          case 94: break;
          case 31: 
            { return symbol(sym.OprASIG_RESTA);
            } 
            // fall through
          case 95: break;
          case 32: 
            { return symbol(sym.Op_DEC);
            } 
            // fall through
          case 96: break;
          case 33: 
            { return symbol(sym.OpMAYOR_IGUAL);
            } 
            // fall through
          case 97: break;
          case 34: 
            { return symbol(sym.OpMENOR_IGUAL);
            } 
            // fall through
          case 98: break;
          case 35: 
            { return symbol(sym.OpDIFERENTE);
            } 
            // fall through
          case 99: break;
          case 36: 
            { return symbol(sym.OprASIGNACION);
            } 
            // fall through
          case 100: break;
          case 37: 
            { return symbol(sym.STRING);
            } 
            // fall through
          case 101: break;
          case 38: 
            { return symbol(sym.FLOAT);
            } 
            // fall through
          case 102: break;
          case 39: 
            { error("Número erróneo: número no válido", yytext(),yyline());
            } 
            // fall through
          case 103: break;
          case 40: 
            { return symbol(sym.END);
            } 
            // fall through
          case 104: break;
          case 41: 
            { return symbol(sym.TYPE_INT);
            } 
            // fall through
          case 105: break;
          case 42: 
            { return symbol(sym.OpNOT);
            } 
            // fall through
          case 106: break;
          case 43: 
            { return symbol(sym.OpAND);
            } 
            // fall through
          case 107: break;
          case 44: 
            { return symbol(sym.Op_DIV);
            } 
            // fall through
          case 108: break;
          case 45: 
            { return symbol(sym.FOR);
            } 
            // fall through
          case 109: break;
          case 46: 
            { return symbol(sym.Op_MOD);
            } 
            // fall through
          case 110: break;
          case 47: 
            { return symbol(sym.VAR);
            } 
            // fall through
          case 111: break;
          case 48: 
            { return symbol(sym.ELSE);
            } 
            // fall through
          case 112: break;
          case 49: 
            { return symbol(sym.TYPE_CHAR);
            } 
            // fall through
          case 113: break;
          case 50: 
            { return symbol(sym.TYPE_REAL);
            } 
            // fall through
          case 114: break;
          case 51: 
            { return symbol(sym.READ);
            } 
            // fall through
          case 115: break;
          case 52: 
            { return symbol(sym.THEN);
            } 
            // fall through
          case 116: break;
          case 53: 
            { return symbol(sym.BEGIN);
            } 
            // fall through
          case 117: break;
          case 54: 
            { return symbol(sym.CONST);
            } 
            // fall through
          case 118: break;
          case 55: 
            { return symbol(sym.WHILE);
            } 
            // fall through
          case 119: break;
          case 56: 
            { return symbol(sym.WRITE);
            } 
            // fall through
          case 120: break;
          case 57: 
            { error("Número erróneo: no puede ser negativo el número antes del exponente", yytext(),yyline());
            } 
            // fall through
          case 121: break;
          case 58: 
            { return symbol(sym.TYPE_STRING);
            } 
            // fall through
          case 122: break;
          case 59: 
            { return symbol(sym.TYPE_BOOLEAN);
            } 
            // fall through
          case 123: break;
          case 60: 
            { return symbol(sym.TYPE_LONGINT);
            } 
            // fall through
          case 124: break;
          case 61: 
            { return symbol(sym.PROGRAM);
            } 
            // fall through
          case 125: break;
          case 62: 
            { return symbol(sym.TYPE_SHORTINT);
            } 
            // fall through
          case 126: break;
          case 63: 
            { return symbol(sym.FUNCTION);
            } 
            // fall through
          case 127: break;
          case 64: 
            { return symbol(sym.PROCEDURE);
            } 
            // fall through
          case 128: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
