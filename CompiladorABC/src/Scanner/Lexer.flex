package Scanner;

import Clases.Tipo_token;
import static Clases.Tipo_token.*;
import Clases.ScannerException;
%%
%class Lexer
%type Tipo_token
%line
%ignorecase
%yylexthrow ScannerException
Letra = [a-zA-Z]
Digito = [0-9]
Espacio = [ \t]
CambioLinea = [\r\n]

ComentarioLinea = "\/\/" ({Letra}|{Digito}|{Espacio})*
ComentarioBloque = "\(\*" ({Letra}|{Digito}|{Espacio}|{CambioLinea})* "\*\)" | "\{"({Letra}|{Digito}|{Espacio}|{CambioLinea})* "\}"

%{
    public String lexeme;

    public int yyline() {
    	return this.yyline;
    }

    public void error(String msg, String caracteres, int linea) throws ScannerException {
        throw new ScannerException(msg, caracteres, linea+1);
    }

%}
%%
{CambioLinea} {/*Ignore*/}
{Espacio} {/*Ignore*/}
{ComentarioLinea} {/*Ignore*/}
{ComentarioBloque} {/*Ignore*/}


/*Palabras reservadas*/

ARRAY { return PALABRA_RESERVADA;}
BEGIN { return PALABRA_RESERVADA;}
BOOLEAN { return PALABRA_RESERVADA;}
BYTE { return PALABRA_RESERVADA;}
CASE { return PALABRA_RESERVADA;}
CHAR { return PALABRA_RESERVADA;}
CONST { return PALABRA_RESERVADA;}
DO { return PALABRA_RESERVADA;}
DOWNTO { return PALABRA_RESERVADA;}
ELSE { return PALABRA_RESERVADA;}
END { return PALABRA_RESERVADA;}
FALSE { return PALABRA_RESERVADA;}
FILE { return PALABRA_RESERVADA;}
FOR { return PALABRA_RESERVADA;}
FORWARD { return PALABRA_RESERVADA;}
FUNCTION { return PALABRA_RESERVADA;}
GOTO { return PALABRA_RESERVADA;}
IF { return PALABRA_RESERVADA;}
IN { return PALABRA_RESERVADA;}
INLINE { return PALABRA_RESERVADA;}
INT { return PALABRA_RESERVADA;}
LABEL { return PALABRA_RESERVADA;}
LONGINT { return PALABRA_RESERVADA;}
NIL { return PALABRA_RESERVADA;}
OF { return PALABRA_RESERVADA;}
PACKED { return PALABRA_RESERVADA;}
PROCEDURE { return PALABRA_RESERVADA;}
PROGRAM { return PALABRA_RESERVADA;}
READ { return PALABRA_RESERVADA;}
REAL { return PALABRA_RESERVADA;}
RECORD { return PALABRA_RESERVADA;}
REPEAT { return PALABRA_RESERVADA;}
SET { return PALABRA_RESERVADA;}
SHORTINT { return PALABRA_RESERVADA;}
STRING { return PALABRA_RESERVADA;}
THEN { return PALABRA_RESERVADA;}
TO { return PALABRA_RESERVADA;}
TRUE { return PALABRA_RESERVADA;}
TYPE { return PALABRA_RESERVADA;}
UNTIL { return PALABRA_RESERVADA;}
VAR { return PALABRA_RESERVADA;}
WHILE { return PALABRA_RESERVADA;}
WITH { return PALABRA_RESERVADA;}
WRITE { return PALABRA_RESERVADA;}


/*Operadores*/
"," { return OPERADOR;}
";" { return OPERADOR;}
"++" { return OPERADOR;}
"+=" { return OPERADOR;}
"--" { return OPERADOR;}
">=" { return OPERADOR;}
">" { return OPERADOR;}
"<=" { return OPERADOR;}
"<" { return OPERADOR;}
"<>" { return OPERADOR;}
"=" { return OPERADOR;}
"+" { return OPERADOR;}
"-" { return OPERADOR;}
"*" { return OPERADOR;}
"/" { return OPERADOR;}
"(" { return OPERADOR;}
")" { return OPERADOR;}
"[" { return OPERADOR;}
"]" { return OPERADOR;}
":=" { return OPERADOR;}
"." { return OPERADOR;}
":" { return OPERADOR;}
"-=" { return OPERADOR;}
"*=" { return OPERADOR;}
"/=" { return OPERADOR;}
">>" { return OPERADOR;}
"<<" { return OPERADOR;}
"<<=" { return OPERADOR;} 
">>=" { return OPERADOR;}
"AND" { return OPERADOR;}
"OR" { return OPERADOR;}
"NOT" { return OPERADOR;}
"DIV" { return OPERADOR;}
"XOR" { return OPERADOR;}
"MOD" { return OPERADOR;}

/*CARACTERES*/
\#[0-9]+ { return CHAR;} /*de un caracter dentro de un string*/
\".\"   { return CHAR;} /*de un caracter dentro de un string*/


/*STRING*/
\"({Letra}|{Digito}|{CambioLinea}|{Espacio}|[\!\&\#\-\_\|\;\.\/\,\<\>\`\~\@\$\%\^\*\=\+])*\" {return STRING;} // String puede tener letras, digitos, espacios o cambios de linea ""

/*ERROR STRING*/
\"({Letra}|{Digito}|{CambioLinea}|{Espacio}|[\!\&\#\-\_\|\;\.\/\,\<\>\`\~\@\$\%\^\*\=\+])*EOF {error("El string no está finalizado.", yytext(),yyline()); return ERROR;}


/*Identificadores*/
{Letra}({Letra}|{Digito})* {return IDENTIFICADOR;}

/*ERRORES IDENTIFICADOR*/
{Letra}  ({Letra}|{Digito})*   [\!\&\#\-\_\|\;\.\/\,\<\>\`\~\@\$\%\^\*\=\+]+  ({Letra}|{Digito})* {error("Identificador erróneo: no se puede utilizar los caracter !&# en los identificadores.", yytext(),yyline()); return ERROR;}






/*Literales*/

{Digito}\.?{Digito}+[Ee][+-]?{Digito}+ {return FLOAT;} 

{Digito}+"\."{Digito}+ {return FLOAT;}

0 | [1-9][0-9]* {return INTEGER;}

//Errores de numeros
{Digito}+"\." {error("Número erróneo: no se puede finalizar un número con punto", yytext(),yyline()); return ERROR;}
"\."{Digito}+ {error("Número erróneo: no se puede iniciar un número con punto", yytext(),yyline()); return ERROR;}

//Errores de si hay letras dentro de numeros
{Digito}"\."{Digito}+E[+-]?"\ " {return ERROR;} 
{Digito}+ ["\."]? ({Digito}*{Letra}+{Digito}*)+ {error("Número erróneo: no se puede ingresar letras dentro de un número.", yytext(),yyline()); return ERROR;}
({Digito}+{Letra}+{Digito}*)+ ["\."]? {Digito}* {error("Número erróneo: no se puede ingresar letras dentro de un número.", yytext(),yyline()); return ERROR;}
({Digito}+{Letra}+{Digito}*)+ ["\."]? ({Digito}*{Letra}+{Digito}*)+ {error("Número erróneo: no se puede ingresar letras dentro de un número.", yytext(),yyline()); return ERROR;}

/*EXCEPCIONES*/


/*ERRORES*/
//Caracter invalido
.   {error("El caracter es inválido", yytext(), yyline()); return ERROR;}

