package Scanner;
import Parser.sym;
import java_cup.runtime.*;
import Clases.ScannerException;
%%

%class Lexer
%cupsym sym
%cup
%line
%ignorecase
%yylexthrow ScannerException
%public

%eofval{
  return symbol(sym.EOF);
%eofval}

Letra = [a-zA-Z]
Digito = [0-9]
Espacio = [ \t]
CambioLinea = [\r\n]
CaracteresEspeciales = [\,\+\=\-\>\<\*\/\(\)\[\]\.\!\&\#\_\|\`\~\@\$\%\^\ñ]
CaracteresEspecialesId = [\(\)\[\]\!\&\#\_\|\`\~\@\$\%\^\ñ]


ComentarioLinea = "//".*

%{
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

%}

%state COMENTARIOS1, COMENTARIOS2, YYINITIAL

%%
<YYINITIAL> {
    {CambioLinea} {/*Ignore*/}
    {Espacio} {/*Ignore*/}
    {ComentarioLinea} {/*Ignore*/}

    "(*"              {yybegin(COMENTARIOS1);}
    "{"              {yybegin(COMENTARIOS2);}

    /*Palabras reservadas*/
    //ARRAY { return PALABRA_RESERVADA;}
    //BEGIN { return symbol(sym.BEGIN);}
    BOOLEAN { return symbol(sym.TYPE_BOOLEAN);}
    //BYTE { return PALABRA_RESERVADA;}
    //CASE { return PALABRA_RESERVADA;}
    CHAR { return symbol(sym.TYPE_CHAR);}
    CONST { return symbol(sym.CONST);}
    //DO { return symbol(sym.DO);}
    //DOWNTO { return PALABRA_RESERVADA;}
    //ELSE { return symbol(sym.ELSE);}
    //END { return symbol(sym.END);}
    //FALSE { return symbol(sym.BOOL);}
    //FILE { return PALABRA_RESERVADA;}
    //FOR { return symbol(sym.FOR);}
    //FORWARD { return PALABRA_RESERVADA;}
    //FUNCTION { return symbol(sym.FUNCTION);}
    //GOTO { return PALABRA_RESERVADA;}
    //IF { return symbol(sym.IF);}
    //IN { return PALABRA_RESERVADA;}
    //INLINE { return PALABRA_RESERVADA;}
    INT { return symbol(sym.TYPE_INT);}
    //LABEL { return PALABRA_RESERVADA;}
    LONGINT { return symbol(sym.TYPE_LONGINT);}
    //NIL { return PALABRA_RESERVADA;}
    //OF { return PALABRA_RESERVADA;}
    //PACKED { return PALABRA_RESERVADA;}
    //PROCEDURE { return symbol(sym.PROCEDURE);}
    //PROGRAM { return symbol(sym.PROGRAM);}
    //READ { return symbol(sym.READ);}
    REAL { return symbol(sym.TYPE_REAL);}
    //RECORD { return PALABRA_RESERVADA;}
    //REPEAT { return PALABRA_RESERVADA;}
    //SET { return PALABRA_RESERVADA;}
    SHORTINT { return symbol(sym.TYPE_SHORTINT);}
    STRING { return symbol(sym.TYPE_STRING);}
    //THEN { return symbol(sym.THEN);}
    //TO { return symbol(sym.TO);}
    //TRUE { return symbol(sym.BOOL);}
    //TYPE { return PALABRA_RESERVADA;}
    //UNTIL { return PALABRA_RESERVADA;}
    VAR { return symbol(sym.VAR);}
    //WHILE { return symbol(sym.WHILE);}
    //WITH { return PALABRA_RESERVADA;}
    //WRITE { return symbol(sym.WRITE);}


    /*Operadores*/
    "," { return symbol(sym.COMA);}
    ";" { return symbol(sym.PUNTOYCOMA);}
    //"++" { return symbol(sym.Op_INC);}
    //"+=" { return symbol(sym.OprASIG_MAS);}
    //"--" { return symbol(sym.Op_DEC);}

    ">=" { return symbol(sym.OpMAYOR_IGUAL);}
    ">" { return symbol(sym.OpMAYOR);}
    "<=" { return symbol(sym.OpMENOR_IGUAL);}
    "<" { return symbol(sym.OpMENOR);}
    "<>" { return symbol(sym.OpDIFERENTE);}
    "=" { return symbol(sym.OpIGUAL);}

    "+" { return symbol(sym.OpSUMA);}
    "-" { return symbol(sym.OpRESTA);}
    "*" { return symbol(sym.OpMUL);}
    "/" { return symbol(sym.OpDIV);}
    "(" { return symbol(sym.PARENTESIS_ABRE);}
    ")" { return symbol(sym.PARENTESIS_CIERRA);}
    //"[" { return OPERADOR;}
    //"]" { return OPERADOR;}
    //":=" { return symbol(sym.ASIGNACION);}
    //"." { return OPERADOR;}
    ":" { return symbol(sym.DOS_PUNTOS);}
    //"-=" { return symbol(sym.OprASIG_RESTA);}
    //"*=" { return symbol(sym.OprASIG_MUL);}
    //"/=" { return symbol(sym.OprASIG_DIV);}
    //">>" { return OPERADOR;}
    //"<<" { return OPERADOR;}
    //"<<=" { return OPERADOR;} 
    //">>=" { return OPERADOR;}

    //"AND" { return symbol(sym.OpAND);}
    //"OR" { return symbol(sym.OpOR);}
    //"NOT" { return symbol(sym.OpNOT);}

    "DIV" { return symbol(sym.Op_DIV);}
    //"XOR" { return OPERADOR;}
    //"MOD" { return symbol(sym.OpMOD);}

    /*CARACTERES*/
    //\#[0-9]+ { return symbol(sym.CARACTER);} /*de un caracter dentro de un string*/
    //\".\"   { return symbol(sym.CARACTER);} /*de un caracter dentro de un string*/


    /*STRING*/
    \"({Letra}|{Digito}|{CambioLinea}|{Espacio}|{CaracteresEspeciales})*\" {return symbol(sym.STRING);} // String puede tener letras, digitos, espacios o cambios de linea ""
    /*ERROR STRING*/
    //\"({Letra}|{Digito}|{CambioLinea}|{Espacio}|{CaracteresEspeciales})*<<EOF>> {error("El string no está finalizado.", yytext(),yyline());}// return ERROR;}


    /*Identificadores*/
    {Letra}({Letra}|{Digito})* {return symbol(sym.IDENTIFICADOR);}

    /*ERRORES IDENTIFICADOR*/
    {Letra}+({Letra}|{Digito})*+{CaracteresEspecialesId}+({Letra}|{Digito})* {error("Identificador erróneo: no se puede utilizar caracteres especiales en los identificadores.", yytext(),yyline());}//; return ERROR;}


    /*Literales*/

    {Digito}\.?{Digito}+[Ee][+-]?{Digito}+ {return symbol(sym.FLOAT);} 

    {Digito}+"\."{Digito}+ {return symbol(sym.FLOAT);}

    0 | [1-9][0-9]* {return symbol(sym.INTEGER);}

    //Errores de numeros

    {Digito}+"\."{Digito}*("\."{Digito}*)+ {error("Número erróneo: número no válido", yytext(),yyline());}// return ERROR;}
    {Digito}+"\." {error("Número erróneo: no se puede finalizar un número con punto", yytext(),yyline());}// return ERROR;}
    "\."{Digito}+ {error("Número erróneo: no se puede iniciar un número con punto", yytext(),yyline());}// return ERROR;}
    "\-"{Digito}\.?{Digito}+[Ee][+-]?{Digito}+ {error("Número erróneo: no puede ser negativo el número antes del exponente", yytext(),yyline());}// return ERROR;}
    //{Digito}\.?{Digito}+[Ee][+-]?+"\."{Digito}* {error("Número erróneo: después del exponente no puede ser float", yytext(),yyline());}// return ERROR;}

    //Errores de si hay letras dentro de numeros
    {Digito}"\."{Digito}+E[+-]?"\ " {error("Número erróneo: no se puede ingresar letras dentro de un número.", yytext(),yyline());}//return ERROR;} 
    {Digito}+ ["\."]? ({Digito}*{Letra}+{Digito}*)+ {error("Número erróneo: no se puede ingresar letras dentro de un número.", yytext(),yyline());}// return ERROR;}
    ({Digito}+{Letra}+{Digito}*)+ ["\."]? {Digito}* {error("Número erróneo: no se puede ingresar letras dentro de un número.", yytext(),yyline());}// return ERROR;}
    ({Digito}+{Letra}+{Digito}*)+ ["\."]? ({Digito}*{Letra}+{Digito}*)+ {error("Número erróneo: no se puede ingresar letras dentro de un número.", yytext(),yyline());}// return ERROR;}

    /*EXCEPCIONES*/

}

<COMENTARIOS1> {
    "*)"      { yybegin(YYINITIAL);}
    [^*]+      {/*Ignore*/}
    "*"        {/*Ignore*/} 
    <<EOF>>   {yybegin(YYINITIAL); error("Comentario sin finalizar.", yytext(),yyline()); }//return ERROR;}
}

<COMENTARIOS2> {
    "}"      {yybegin(YYINITIAL);}
    [^}]+      {/*Ignore*/}
    <<EOF>>   {yybegin(YYINITIAL); error("Comentario sin finalizar.", yytext(),yyline());}// return ERROR;}
}
/*ERRORES*/
//Caracter invalido
.   {error("El caracter es inválido", yytext(), yyline());}// return ERROR;}



<<EOF>>   {return symbol(sym.EOF);}