package compiladorabc;

import Clases.ScannerException;
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
            System.out.println("");
            System.out.println(parser.getCoder().toString());
            System.out.println("FINALIZA EL PARSEO");
        } 
        catch (ScannerException e) {
                System.out.println("[Línea: " + e.getLinea() + "]=>" + e.getCaracteres()+ ": " + e.getMessage()+ "\n");
        } 
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }   
}

