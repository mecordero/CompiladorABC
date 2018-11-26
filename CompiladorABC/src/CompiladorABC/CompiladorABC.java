package compiladorabc;

import Clases.ScannerException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import Parser.Parser;
import Scanner.Lexer;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

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
            
            String nombreArchivo = "CodigoPrueba2";
            Lexer l = new Lexer(new FileReader(nombreArchivo+".txt"));
            Parser parser = new Parser(l);
            parser.parse();  
            System.out.println("");
            System.out.println(parser.getCoder().toString());
            System.out.println("FINALIZA EL PARSEO");
            
            FileWriter f = new FileWriter(new File(nombreArchivo + ".abc"));
            PrintWriter p = new PrintWriter(f);
            p.print(parser.getCoder().getCodigo());
            p.close();
        } 
        catch (ScannerException e) {
                System.out.println("[Línea: " + e.getLinea() + "]=>" + e.getCaracteres()+ ": " + e.getMessage()+ "\n");
        } 
        catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }   
}

