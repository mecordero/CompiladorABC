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
    "\11\0\1\3\1\4\1\10\1\10\1\4\22\0\1\54\1\6\1\52"+
    "\4\6\1\0\1\11\1\50\1\12\1\46\1\41\1\47\1\5\1\7"+
    "\1\53\11\2\1\51\1\42\1\45\1\44\1\43\1\0\1\6\1\24"+
    "\1\14\1\25\1\33\1\15\1\34\1\16\1\26\1\20\2\1\1\23"+
    "\1\1\1\21\1\22\1\36\1\1\1\27\1\31\1\32\1\35\1\37"+
    "\1\40\3\1\1\6\1\0\4\6\1\24\1\14\1\25\1\33\1\15"+
    "\1\34\1\16\1\26\1\20\2\1\1\23\1\1\1\21\1\22\1\36"+
    "\1\1\1\27\1\31\1\32\1\35\1\37\1\40\3\1\1\13\1\6"+
    "\1\55\1\6\6\0\1\10\153\0\1\6\76\0\2\17\115\0\1\30"+
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
    "\1\7\1\10\2\2\1\1\4\2\1\1\7\2\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\1\1\3\3\4\1\22\1\23\1\24\1\3\1\25"+
    "\1\26\1\4\1\27\4\2\1\0\1\30\1\2\1\30"+
    "\4\2\2\0\2\2\1\31\1\2\1\0\1\2\1\32"+
    "\5\2\1\33\1\34\1\35\1\0\1\36\1\0\1\37"+
    "\1\0\1\23\1\24\1\25\1\24\1\40\1\41\2\2"+
    "\1\42\1\0\1\2\2\43\4\2\2\0\3\2\2\44"+
    "\1\45\2\2\1\46\1\0\1\2\2\0\2\40\1\0"+
    "\1\24\1\0\2\2\2\47\1\2\1\0\1\2\1\50"+
    "\1\51\2\0\2\2\1\52\2\2\1\0\1\2\1\0"+
    "\2\40\1\0\1\24\2\53\1\2\1\0\1\2\2\54"+
    "\2\0\4\2\2\55\1\56\1\0\1\2\1\0\1\2"+
    "\1\0\1\57\1\2\1\57\1\0\2\2\1\60\2\61"+
    "\1\0\1\2\1\0\2\2\2\62\2\63\1\2\1\64";

  private static int [] zzUnpackAction() {
    int [] result = new int[184];
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
    "\0\0\0\56\0\134\0\212\0\270\0\346\0\212\0\u0114"+
    "\0\u0142\0\u0170\0\212\0\212\0\u019e\0\u01cc\0\u01fa\0\u0228"+
    "\0\u0256\0\u0284\0\u02b2\0\u02e0\0\u030e\0\u033c\0\u036a\0\u0398"+
    "\0\u03c6\0\u03f4\0\u0422\0\212\0\212\0\u0450\0\212\0\u047e"+
    "\0\212\0\u04ac\0\212\0\u04da\0\u0508\0\u0536\0\u0564\0\u0592"+
    "\0\u05c0\0\212\0\u05ee\0\u061c\0\u064a\0\u0678\0\u0114\0\u06a6"+
    "\0\212\0\u06d4\0\u0702\0\u0730\0\u075e\0\u078c\0\212\0\u07ba"+
    "\0\270\0\u07e8\0\u0816\0\u0844\0\u0872\0\u08a0\0\u08ce\0\u08fc"+
    "\0\u092a\0\270\0\u0958\0\u0986\0\u09b4\0\270\0\u09e2\0\u0a10"+
    "\0\u0a3e\0\u0a6c\0\u0a9a\0\212\0\212\0\212\0\u0ac8\0\212"+
    "\0\u0508\0\212\0\u0af6\0\u0b24\0\u0b52\0\u0b80\0\u0bae\0\u0bdc"+
    "\0\u0c0a\0\u0c38\0\u0c66\0\270\0\u0c94\0\u0cc2\0\212\0\270"+
    "\0\u0cf0\0\u0d1e\0\u0d4c\0\u0d7a\0\u0da8\0\u0dd6\0\u0e04\0\u0e32"+
    "\0\u0e60\0\212\0\270\0\270\0\u0e8e\0\u0ebc\0\270\0\u0eea"+
    "\0\u0f18\0\u0f46\0\u0f74\0\u0b80\0\u0fa2\0\u0fd0\0\u0ffe\0\u102c"+
    "\0\u105a\0\u1088\0\212\0\270\0\u10b6\0\u10e4\0\u1112\0\270"+
    "\0\270\0\u1140\0\u116e\0\u119c\0\u11ca\0\270\0\u11f8\0\u1226"+
    "\0\u1254\0\u1282\0\u12b0\0\u0fd0\0\u12de\0\u130c\0\212\0\212"+
    "\0\270\0\u133a\0\u1368\0\u1396\0\212\0\270\0\u13c4\0\u13f2"+
    "\0\u1420\0\u144e\0\u147c\0\u14aa\0\212\0\270\0\u14d8\0\u14d8"+
    "\0\u1506\0\u1534\0\u1562\0\u1590\0\212\0\u15be\0\270\0\u15ec"+
    "\0\u161a\0\u1648\0\270\0\212\0\270\0\u1676\0\u16a4\0\u16d2"+
    "\0\u1700\0\u172e\0\212\0\270\0\212\0\270\0\u175c\0\270";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[184];
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
    "\2\5\1\21\1\5\1\22\1\5\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\5\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\45\1\46\1\7\1\4\12\47\1\50\43\47\55\51"+
    "\1\52\57\0\2\5\3\0\1\53\2\0\1\53\2\0"+
    "\3\5\1\0\10\5\1\0\10\5\7\0\1\53\2\0"+
    "\1\5\3\0\1\54\1\55\2\0\1\56\6\0\3\54"+
    "\1\0\10\54\1\0\10\54\12\0\1\55\4\0\1\57"+
    "\50\0\1\57\11\0\1\60\60\0\1\61\44\0\2\5"+
    "\3\0\1\53\2\0\1\53\2\0\1\5\1\62\1\5"+
    "\1\0\2\5\1\63\5\5\1\0\10\5\7\0\1\53"+
    "\2\0\1\5\3\0\2\5\3\0\1\53\2\0\1\53"+
    "\2\0\3\5\1\0\1\5\1\64\1\5\1\65\4\5"+
    "\1\0\10\5\7\0\1\53\2\0\1\5\23\0\1\66"+
    "\12\0\1\67\22\0\2\5\3\0\1\53\2\0\1\53"+
    "\2\0\3\5\1\0\1\5\1\70\6\5\1\0\3\5"+
    "\1\71\4\5\7\0\1\53\2\0\1\5\3\0\2\5"+
    "\3\0\1\53\2\0\1\53\2\0\3\5\1\0\2\5"+
    "\1\72\5\5\1\0\10\5\7\0\1\53\2\0\1\5"+
    "\3\0\2\5\3\0\1\53\2\0\1\53\2\0\3\5"+
    "\1\0\2\5\1\73\3\5\1\74\1\5\1\0\10\5"+
    "\7\0\1\53\2\0\1\5\3\0\2\5\3\0\1\53"+
    "\2\0\1\53\2\0\1\5\1\75\1\5\1\0\10\5"+
    "\1\0\10\5\7\0\1\53\2\0\1\5\30\0\1\76"+
    "\3\0\1\77\24\0\2\5\3\0\1\53\2\0\1\53"+
    "\2\0\3\5\1\0\6\5\1\100\1\5\1\0\1\5"+
    "\1\101\6\5\7\0\1\53\2\0\1\5\3\0\2\5"+
    "\3\0\1\53\2\0\1\53\2\0\3\5\1\0\2\5"+
    "\1\102\3\5\1\103\1\5\1\0\10\5\7\0\1\53"+
    "\2\0\1\5\3\0\2\5\3\0\1\53\2\0\1\53"+
    "\2\0\3\5\1\104\1\105\1\5\1\106\5\5\1\0"+
    "\10\5\7\0\1\53\2\0\1\5\3\0\2\5\3\0"+
    "\1\53\2\0\1\53\2\0\3\5\1\0\2\5\1\107"+
    "\5\5\1\0\4\5\1\110\3\5\7\0\1\53\2\0"+
    "\1\5\3\0\2\5\3\0\1\53\2\0\1\53\2\0"+
    "\3\5\1\0\7\5\1\111\1\0\10\5\7\0\1\53"+
    "\2\0\1\5\3\0\2\5\3\0\1\53\2\0\1\53"+
    "\2\0\3\5\1\0\4\5\1\112\3\5\1\0\10\5"+
    "\7\0\1\53\2\0\1\5\3\0\2\5\3\0\1\53"+
    "\2\0\1\53\2\0\3\5\1\0\6\5\1\113\1\5"+
    "\1\0\10\5\7\0\1\53\2\0\1\5\46\0\1\114"+
    "\54\0\1\115\1\116\13\0\1\117\50\0\1\117\46\0"+
    "\1\120\12\0\7\121\1\0\2\121\1\0\3\121\1\0"+
    "\10\121\1\0\11\121\1\0\6\121\1\0\1\122\2\121"+
    "\2\0\1\54\1\123\2\0\1\56\6\0\3\54\1\0"+
    "\10\54\1\0\10\54\12\0\1\123\2\0\12\47\1\0"+
    "\43\47\50\0\1\52\5\0\55\51\2\0\2\124\3\0"+
    "\1\53\2\0\1\53\2\0\3\124\1\0\10\124\1\0"+
    "\10\124\7\0\1\53\2\0\1\124\3\0\2\54\2\0"+
    "\1\125\6\0\3\54\1\0\10\54\1\0\10\54\12\0"+
    "\1\54\3\0\1\54\1\55\2\0\1\126\6\0\1\54"+
    "\1\127\1\54\1\0\10\54\1\0\10\54\12\0\1\55"+
    "\3\0\1\125\1\130\2\0\1\131\6\0\3\125\1\0"+
    "\10\125\1\0\10\125\12\0\1\130\2\0\4\60\1\0"+
    "\3\60\1\0\45\60\1\0\2\5\3\0\1\53\2\0"+
    "\1\53\2\0\2\5\1\132\1\0\10\5\1\0\10\5"+
    "\7\0\1\53\2\0\1\5\3\0\2\5\3\0\1\53"+
    "\2\0\1\53\2\0\3\5\1\0\2\5\1\133\5\5"+
    "\1\0\10\5\7\0\1\53\2\0\1\5\3\0\2\5"+
    "\3\0\1\53\2\0\1\53\2\0\3\5\1\0\10\5"+
    "\1\0\2\5\1\134\5\5\7\0\1\53\2\0\1\5"+
    "\3\0\2\5\3\0\1\53\2\0\1\53\2\0\3\5"+
    "\1\0\10\5\1\135\1\136\7\5\7\0\1\53\2\0"+
    "\1\5\34\0\1\137\24\0\2\5\3\0\1\53\2\0"+
    "\1\53\2\0\3\5\1\0\10\5\1\0\1\5\1\140"+
    "\6\5\7\0\1\53\2\0\1\5\3\0\2\5\3\0"+
    "\1\53\2\0\1\53\2\0\3\5\1\0\1\5\1\141"+
    "\6\5\1\0\10\5\7\0\1\53\2\0\1\5\3\0"+
    "\2\5\3\0\1\53\2\0\1\53\2\0\3\5\1\0"+
    "\1\5\1\142\6\5\1\0\10\5\7\0\1\53\2\0"+
    "\1\5\3\0\2\5\3\0\1\53\2\0\1\53\2\0"+
    "\3\5\1\0\4\5\1\143\3\5\1\0\10\5\7\0"+
    "\1\53\2\0\1\5\3\0\2\5\3\0\1\53\2\0"+
    "\1\53\2\0\3\5\1\0\4\5\1\144\3\5\1\0"+
    "\10\5\7\0\1\53\2\0\1\5\24\0\1\145\62\0"+
    "\1\146\27\0\2\5\3\0\1\53\2\0\1\53\2\0"+
    "\3\5\1\0\2\5\1\147\5\5\1\0\10\5\7\0"+
    "\1\53\2\0\1\5\3\0\2\5\3\0\1\53\2\0"+
    "\1\53\2\0\3\5\1\0\7\5\1\150\1\0\10\5"+
    "\7\0\1\53\2\0\1\5\3\0\2\5\3\0\1\53"+
    "\2\0\1\53\2\0\1\5\1\151\1\5\1\0\10\5"+
    "\1\0\10\5\7\0\1\53\2\0\1\5\41\0\1\152"+
    "\17\0\2\5\3\0\1\53\2\0\1\53\2\0\3\5"+
    "\1\0\10\5\1\0\6\5\1\153\1\5\7\0\1\53"+
    "\2\0\1\5\3\0\2\5\3\0\1\53\2\0\1\53"+
    "\2\0\3\5\1\0\7\5\1\154\1\0\10\5\7\0"+
    "\1\53\2\0\1\5\3\0\2\5\3\0\1\53\2\0"+
    "\1\53\2\0\3\5\1\0\1\5\1\155\6\5\1\0"+
    "\10\5\7\0\1\53\2\0\1\5\3\0\2\5\3\0"+
    "\1\53\2\0\1\53\2\0\3\5\1\0\2\5\1\156"+
    "\5\5\1\0\10\5\7\0\1\53\2\0\1\5\3\0"+
    "\2\5\3\0\1\53\2\0\1\53\2\0\3\5\1\0"+
    "\7\5\1\157\1\0\10\5\7\0\1\53\2\0\1\5"+
    "\3\0\2\5\3\0\1\53\2\0\1\53\2\0\3\5"+
    "\1\160\1\161\7\5\1\0\10\5\7\0\1\53\2\0"+
    "\1\5\4\0\1\162\2\0\1\163\45\0\1\162\3\0"+
    "\1\54\1\123\2\0\1\126\6\0\1\54\1\127\1\54"+
    "\1\0\10\54\1\0\10\54\12\0\1\123\3\0\2\124"+
    "\11\0\3\124\1\0\10\124\1\0\10\124\12\0\1\124"+
    "\3\0\2\125\11\0\3\125\1\0\10\125\1\0\10\125"+
    "\12\0\1\125\3\0\1\125\1\164\2\0\1\131\6\0"+
    "\3\125\1\0\10\125\1\0\10\125\12\0\1\164\3\0"+
    "\1\54\1\165\2\0\1\125\6\0\3\54\1\0\10\54"+
    "\1\0\10\54\5\0\2\166\3\0\1\165\3\0\1\125"+
    "\1\130\2\0\1\131\6\0\1\125\1\167\1\125\1\0"+
    "\10\125\1\0\10\125\12\0\1\130\4\0\1\131\2\0"+
    "\1\131\45\0\1\131\3\0\2\5\3\0\1\53\2\0"+
    "\1\53\2\0\3\5\1\170\1\171\7\5\1\0\10\5"+
    "\7\0\1\53\2\0\1\5\3\0\2\5\3\0\1\53"+
    "\2\0\1\53\2\0\3\5\1\0\3\5\1\172\4\5"+
    "\1\0\10\5\7\0\1\53\2\0\1\5\17\0\1\173"+
    "\41\0\2\5\3\0\1\53\2\0\1\53\2\0\1\5"+
    "\1\174\1\5\1\0\10\5\1\0\10\5\7\0\1\53"+
    "\2\0\1\5\3\0\2\5\3\0\1\53\2\0\1\53"+
    "\2\0\2\5\1\175\1\0\10\5\1\0\10\5\7\0"+
    "\1\53\2\0\1\5\3\0\2\5\3\0\1\53\2\0"+
    "\1\53\2\0\3\5\1\0\10\5\1\176\1\177\7\5"+
    "\7\0\1\53\2\0\1\5\3\0\2\5\3\0\1\53"+
    "\2\0\1\53\2\0\3\5\1\0\7\5\1\200\1\0"+
    "\10\5\7\0\1\53\2\0\1\5\3\0\2\5\3\0"+
    "\1\53\2\0\1\53\2\0\3\5\1\0\3\5\1\201"+
    "\4\5\1\0\10\5\7\0\1\53\2\0\1\5\31\0"+
    "\1\202\45\0\2\203\36\0\2\5\3\0\1\53\2\0"+
    "\1\53\2\0\3\5\1\0\7\5\1\204\1\0\10\5"+
    "\7\0\1\53\2\0\1\5\3\0\2\5\3\0\1\53"+
    "\2\0\1\53\2\0\3\5\1\203\1\205\7\5\1\0"+
    "\10\5\7\0\1\53\2\0\1\5\3\0\2\5\3\0"+
    "\1\53\2\0\1\53\2\0\3\5\1\0\1\5\1\206"+
    "\6\5\1\0\10\5\7\0\1\53\2\0\1\5\3\0"+
    "\2\5\3\0\1\53\2\0\1\53\2\0\3\5\1\0"+
    "\5\5\1\207\2\5\1\0\10\5\7\0\1\53\2\0"+
    "\1\5\3\0\2\5\3\0\1\53\2\0\1\53\2\0"+
    "\3\5\1\0\5\5\1\210\2\5\1\0\10\5\7\0"+
    "\1\53\2\0\1\5\25\0\1\211\33\0\2\5\3\0"+
    "\1\53\2\0\1\53\2\0\3\5\1\0\3\5\1\212"+
    "\4\5\1\0\10\5\7\0\1\53\2\0\1\5\4\0"+
    "\1\162\12\0\1\213\35\0\1\162\4\0\1\162\50\0"+
    "\1\162\3\0\1\54\1\165\2\0\1\125\6\0\3\54"+
    "\1\0\10\54\1\0\10\54\12\0\1\165\4\0\1\214"+
    "\50\0\1\214\3\0\1\125\1\215\11\0\3\125\1\0"+
    "\10\125\1\0\10\125\5\0\2\216\3\0\1\215\1\217"+
    "\22\0\1\220\35\0\2\5\3\0\1\53\2\0\1\53"+
    "\2\0\3\5\1\0\1\5\1\221\6\5\1\0\10\5"+
    "\7\0\1\53\2\0\1\5\3\0\2\5\3\0\1\53"+
    "\2\0\1\53\2\0\1\5\1\222\1\5\1\0\10\5"+
    "\1\0\10\5\7\0\1\53\2\0\1\5\3\0\2\5"+
    "\3\0\1\53\2\0\1\53\2\0\3\5\1\223\1\224"+
    "\7\5\1\0\10\5\7\0\1\53\2\0\1\5\34\0"+
    "\1\225\24\0\2\5\3\0\1\53\2\0\1\53\2\0"+
    "\3\5\1\0\10\5\1\0\1\5\1\226\6\5\7\0"+
    "\1\53\2\0\1\5\34\0\1\227\44\0\1\230\35\0"+
    "\2\5\3\0\1\53\2\0\1\53\2\0\3\5\1\0"+
    "\10\5\1\0\1\5\1\231\6\5\7\0\1\53\2\0"+
    "\1\5\3\0\2\5\3\0\1\53\2\0\1\53\2\0"+
    "\3\5\1\0\1\5\1\232\6\5\1\0\10\5\7\0"+
    "\1\53\2\0\1\5\3\0\2\5\3\0\1\53\2\0"+
    "\1\53\2\0\3\5\1\0\10\5\1\0\1\5\1\233"+
    "\6\5\7\0\1\53\2\0\1\5\3\0\2\5\3\0"+
    "\1\53\2\0\1\53\2\0\1\5\1\234\1\5\1\0"+
    "\10\5\1\0\10\5\7\0\1\53\2\0\1\5\17\0"+
    "\1\235\41\0\2\5\3\0\1\53\2\0\1\53\2\0"+
    "\1\5\1\236\1\5\1\0\10\5\1\0\10\5\7\0"+
    "\1\53\2\0\1\5\4\0\1\237\43\0\2\240\3\0"+
    "\1\237\3\0\1\125\1\215\11\0\3\125\1\0\10\125"+
    "\1\0\10\125\12\0\1\215\4\0\1\214\50\0\1\214"+
    "\1\217\2\0\2\5\3\0\1\53\2\0\1\53\2\0"+
    "\3\5\1\0\4\5\1\241\3\5\1\0\10\5\7\0"+
    "\1\53\2\0\1\5\23\0\1\242\35\0\2\5\3\0"+
    "\1\53\2\0\1\53\2\0\3\5\1\0\1\5\1\243"+
    "\6\5\1\0\10\5\7\0\1\53\2\0\1\5\21\0"+
    "\2\244\53\0\1\245\40\0\2\5\3\0\1\53\2\0"+
    "\1\53\2\0\3\5\1\244\1\246\7\5\1\0\10\5"+
    "\7\0\1\53\2\0\1\5\3\0\2\5\3\0\1\53"+
    "\2\0\1\53\2\0\2\5\1\247\1\0\10\5\1\0"+
    "\10\5\7\0\1\53\2\0\1\5\3\0\2\5\3\0"+
    "\1\53\2\0\1\53\2\0\3\5\1\250\1\251\7\5"+
    "\1\0\10\5\7\0\1\53\2\0\1\5\3\0\2\5"+
    "\3\0\1\53\2\0\1\53\2\0\3\5\1\0\10\5"+
    "\1\0\2\5\1\252\5\5\7\0\1\53\2\0\1\5"+
    "\4\0\1\237\50\0\1\237\3\0\2\5\3\0\1\53"+
    "\2\0\1\53\2\0\3\5\1\0\1\5\1\253\6\5"+
    "\1\0\10\5\7\0\1\53\2\0\1\5\34\0\1\254"+
    "\24\0\2\5\3\0\1\53\2\0\1\53\2\0\3\5"+
    "\1\0\10\5\1\0\1\5\1\255\6\5\7\0\1\53"+
    "\2\0\1\5\23\0\1\256\35\0\2\5\3\0\1\53"+
    "\2\0\1\53\2\0\3\5\1\0\1\5\1\257\6\5"+
    "\1\0\10\5\7\0\1\53\2\0\1\5\24\0\1\260"+
    "\34\0\2\5\3\0\1\53\2\0\1\53\2\0\3\5"+
    "\1\0\2\5\1\261\5\5\1\0\10\5\7\0\1\53"+
    "\2\0\1\5\3\0\2\5\3\0\1\53\2\0\1\53"+
    "\2\0\3\5\1\0\10\5\1\0\4\5\1\262\3\5"+
    "\7\0\1\53\2\0\1\5\34\0\1\263\24\0\2\5"+
    "\3\0\1\53\2\0\1\53\2\0\3\5\1\0\10\5"+
    "\1\0\1\5\1\264\6\5\7\0\1\53\2\0\1\5"+
    "\23\0\1\265\35\0\2\5\3\0\1\53\2\0\1\53"+
    "\2\0\3\5\1\0\1\5\1\266\6\5\1\0\10\5"+
    "\7\0\1\53\2\0\1\5\3\0\2\5\3\0\1\53"+
    "\2\0\1\53\2\0\3\5\1\0\7\5\1\267\1\0"+
    "\10\5\7\0\1\53\2\0\1\5\3\0\2\5\3\0"+
    "\1\53\2\0\1\53\2\0\1\5\1\270\1\5\1\0"+
    "\10\5\1\0\10\5\7\0\1\53\2\0\1\5\2\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6026];
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
    "\3\0\1\11\2\1\1\11\3\1\2\11\17\1\2\11"+
    "\1\1\1\11\1\1\1\11\1\1\1\11\6\1\1\11"+
    "\6\1\1\11\4\1\1\0\1\11\6\1\2\0\4\1"+
    "\1\0\7\1\3\11\1\0\1\11\1\0\1\11\1\0"+
    "\11\1\1\0\1\1\1\11\5\1\2\0\3\1\1\11"+
    "\5\1\1\0\1\1\2\0\2\1\1\0\1\1\1\0"+
    "\2\1\1\11\2\1\1\0\3\1\2\0\5\1\1\0"+
    "\1\1\1\0\2\1\1\0\2\11\2\1\1\0\1\1"+
    "\1\11\1\1\2\0\4\1\1\11\2\1\1\0\1\1"+
    "\1\0\1\1\1\0\1\11\2\1\1\0\3\1\1\11"+
    "\1\1\1\0\1\1\1\0\2\1\1\11\1\1\1\11"+
    "\3\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[184];
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
        return new Symbol(type, yyline);
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
            case 185: break;
            case COMENTARIOS2: {
              yybegin(YYINITIAL); error("Comentario sin finalizar.", yytext(),yyline());
            }  // fall though
            case 186: break;
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
          case 53: break;
          case 2: 
            { return symbol(sym.IDENTIFICADOR);
            } 
            // fall through
          case 54: break;
          case 3: 
            { return symbol(sym.INTEGER);
            } 
            // fall through
          case 55: break;
          case 4: 
            { /*Ignore*/
            } 
            // fall through
          case 56: break;
          case 5: 
            { return symbol(sym.OpDIV);
            } 
            // fall through
          case 57: break;
          case 6: 
            { return symbol(sym.PARENTESIS_ABRE);
            } 
            // fall through
          case 58: break;
          case 7: 
            { return symbol(sym.OpMUL);
            } 
            // fall through
          case 59: break;
          case 8: 
            { yybegin(COMENTARIOS2);
            } 
            // fall through
          case 60: break;
          case 9: 
            { return symbol(sym.COMA);
            } 
            // fall through
          case 61: break;
          case 10: 
            { return symbol(sym.PUNTOYCOMA);
            } 
            // fall through
          case 62: break;
          case 11: 
            { return symbol(sym.OpMAYOR);
            } 
            // fall through
          case 63: break;
          case 12: 
            { return symbol(sym.OpIGUAL);
            } 
            // fall through
          case 64: break;
          case 13: 
            { return symbol(sym.OpMENOR);
            } 
            // fall through
          case 65: break;
          case 14: 
            { return symbol(sym.OpSUMA);
            } 
            // fall through
          case 66: break;
          case 15: 
            { return symbol(sym.OpRESTA);
            } 
            // fall through
          case 67: break;
          case 16: 
            { return symbol(sym.PARENTESIS_CIERRA);
            } 
            // fall through
          case 68: break;
          case 17: 
            { return symbol(sym.DOS_PUNTOS);
            } 
            // fall through
          case 69: break;
          case 18: 
            { yybegin(YYINITIAL);
            } 
            // fall through
          case 70: break;
          case 19: 
            { error("Identificador erróneo: no se puede utilizar caracteres especiales en los identificadores.", yytext(),yyline());
            } 
            // fall through
          case 71: break;
          case 20: 
            { error("Número erróneo: no se puede ingresar letras dentro de un número.", yytext(),yyline());
            } 
            // fall through
          case 72: break;
          case 21: 
            { error("Número erróneo: no se puede finalizar un número con punto", yytext(),yyline());
            } 
            // fall through
          case 73: break;
          case 22: 
            { error("Número erróneo: no se puede iniciar un número con punto", yytext(),yyline());
            } 
            // fall through
          case 74: break;
          case 23: 
            { yybegin(COMENTARIOS1);
            } 
            // fall through
          case 75: break;
          case 24: 
            { return symbol(sym.IF);
            } 
            // fall through
          case 76: break;
          case 25: 
            { return symbol(sym.TO);
            } 
            // fall through
          case 77: break;
          case 26: 
            { return symbol(sym.DO);
            } 
            // fall through
          case 78: break;
          case 27: 
            { return symbol(sym.OpMAYOR_IGUAL);
            } 
            // fall through
          case 79: break;
          case 28: 
            { return symbol(sym.OpDIFERENTE);
            } 
            // fall through
          case 80: break;
          case 29: 
            { return symbol(sym.OpMENOR_IGUAL);
            } 
            // fall through
          case 81: break;
          case 30: 
            { return symbol(sym.OprASIGNACION);
            } 
            // fall through
          case 82: break;
          case 31: 
            { return symbol(sym.STRING);
            } 
            // fall through
          case 83: break;
          case 32: 
            { return symbol(sym.FLOAT);
            } 
            // fall through
          case 84: break;
          case 33: 
            { error("Número erróneo: número no válido", yytext(),yyline());
            } 
            // fall through
          case 85: break;
          case 34: 
            { return symbol(sym.END);
            } 
            // fall through
          case 86: break;
          case 35: 
            { return symbol(sym.TYPE_INT);
            } 
            // fall through
          case 87: break;
          case 36: 
            { return symbol(sym.Op_DIV);
            } 
            // fall through
          case 88: break;
          case 37: 
            { return symbol(sym.FOR);
            } 
            // fall through
          case 89: break;
          case 38: 
            { return symbol(sym.VAR);
            } 
            // fall through
          case 90: break;
          case 39: 
            { return symbol(sym.ELSE);
            } 
            // fall through
          case 91: break;
          case 40: 
            { return symbol(sym.TYPE_CHAR);
            } 
            // fall through
          case 92: break;
          case 41: 
            { return symbol(sym.TYPE_REAL);
            } 
            // fall through
          case 93: break;
          case 42: 
            { return symbol(sym.THEN);
            } 
            // fall through
          case 94: break;
          case 43: 
            { return symbol(sym.BEGIN);
            } 
            // fall through
          case 95: break;
          case 44: 
            { return symbol(sym.CONST);
            } 
            // fall through
          case 96: break;
          case 45: 
            { return symbol(sym.WHILE);
            } 
            // fall through
          case 97: break;
          case 46: 
            { error("Número erróneo: no puede ser negativo el número antes del exponente", yytext(),yyline());
            } 
            // fall through
          case 98: break;
          case 47: 
            { return symbol(sym.TYPE_STRING);
            } 
            // fall through
          case 99: break;
          case 48: 
            { return symbol(sym.TYPE_BOOLEAN);
            } 
            // fall through
          case 100: break;
          case 49: 
            { return symbol(sym.TYPE_LONGINT);
            } 
            // fall through
          case 101: break;
          case 50: 
            { return symbol(sym.TYPE_SHORTINT);
            } 
            // fall through
          case 102: break;
          case 51: 
            { return symbol(sym.FUNCTION);
            } 
            // fall through
          case 103: break;
          case 52: 
            { return symbol(sym.PROCEDURE);
            } 
            // fall through
          case 104: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
