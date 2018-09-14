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
ComentarioBloque = "\*" ({Letra}|{Digito}|{Espacio}|{CambioLinea})* "\*" | "\{"({Letra}|{Digito}|{Espacio}|{CambioLinea})* "\}"

%{
    public String lexeme;

    public int yyline() {
    	return this.yyline;
    }

    public void error(String msg, String caracteres, int linea) throws ScannerException {
        throw new ScannerException("El caracter es inválido", caracteres, linea);
    }

%}
%%
{CambioLinea} {/*Ignore*/}
{Espacio} {/*Ignore*/}
{ComentarioLinea} {/*Ignore*/}
{ComentarioBloque} {/*Ignore*/}


/*Palabras reservadas*/
AND { return PALABRA_RESERVADA;}
ARRAY { return PALABRA_RESERVADA;}
BEGIN { return PALABRA_RESERVADA;}
BOOLEAN { return PALABRA_RESERVADA;}
BYTE { return PALABRA_RESERVADA;}
CASE { return PALABRA_RESERVADA;}
CHAR { return PALABRA_RESERVADA;}
CONST { return PALABRA_RESERVADA;}
DIV { return PALABRA_RESERVADA;}
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
MOD { return PALABRA_RESERVADA;}
NIL { return PALABRA_RESERVADA;}
NOT { return PALABRA_RESERVADA;}
OF { return PALABRA_RESERVADA;}
OR { return PALABRA_RESERVADA;}
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
XOR { return PALABRA_RESERVADA;}

//ERRORES DE STIRNG

/*STRING*/
\"({Letra}|{Digito}|{CambioLinea}|{Espacio}|[\!\&\#\-\_\|\;\"\.\/\,\<\>\`\~\@\$\%\^\*])*\" {return STRING;} // String puede tener letras, digitos, espacios o cambios de linea ""

/*CARACTERES*/
"\#[0-9]+" { return CHAR;} /*de un caracter dentro de un string*/


/*Identificadores*/
{Letra}({Letra}|{Digito})* {return IDENTIFICADOR;}

/*ERRORES IDENTIFICADOR*/
{Letra}({Letra}|{Digito})*[\!\&\#\-\_\|\;\"\.\/\,\<\>\`\~\@\$\%\^\*]|({Letra}|{Digito})* {error("Identificador erróneo: no se puede utilizar los caracter !&# en los identificadores.", yytext(),yyline()); return ERROR;}


/*Literales*/

//Errores de numeros
{Digito}+"." {error("Numero erróneo: no se puede finalizar un número con punto", yytext(),yyline()); return ERROR;}
"\."{Digito}+ {error("Numero erróneo: no se puede iniciar un número con punto", yytext(),yyline()); return ERROR;}

"\#[0-9]+" { return CHAR;} /*de un caracter dentro de un string*/

{Digito}"\."{Digito}+E[+-]?{Digito}+ {return FLOAT;} 

//Errores de si hay letras dentro de numeros
{Digito}"\."{Digito}+E[+-]?" " {return ERROR;} 
{Digito}+ ["\."]? ({Digito}*{Letra}+{Digito}*)+ {error("Numero erróneo: no se puede ingresar letras dentro de un número.", yytext(),yyline()); return ERROR;}
({Digito}+{Letra}+{Digito}*)+ ["\."]? {Digito}+ {error("Numero erróneo: no se puede ingresar letras dentro de un número.", yytext(),yyline()); return ERROR;}
({Digito}+{Letra}+{Digito}*)+ ["\."]? ({Digito}*{Letra}+{Digito}*)+ {error("Numero erróneo: no se puede ingresar letras dentro de un número.", yytext(),yyline()); return ERROR;}

{Digito}+"\."{Digito}+ {return FLOAT;}


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


/*EXCEPCIONES*/


/*ERRORES*/
//Caracter invalido
. {error("El caracter es inválido", yytext(), yyline()); return ERROR;}

