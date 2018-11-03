package compiladorabc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import Parser.Parser;
import Scanner.Lexer;

/**
 *
 * @author Meli
 */
public class CompiladorABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        try {
            String nombreArchivo = "CodigoPrueba2.txt";
            Lexer l = new Lexer(new FileReader(nombreArchivo));
            Parser parser = new Parser(l);
            parser.parse(); 
            System.out.println("Termina el parseo");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }   
}



/*

Lo que tenía del if

ESTR_IF     ::=  IF CONDICION THEN BEGIN SENTENCIAS ESTR_ELSE;

ESTR_ELSE ::= END ELSE BEGIN SENTENCIAS | ;

*/