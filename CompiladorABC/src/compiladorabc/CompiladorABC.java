/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorabc;

import Clases.Tabla_símbolos;
import Clases.Tipo_token;
import Clases.Token;
import Scanner.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import javafx.util.Pair;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

/**
 *
 * @author Meli
 */
public class CompiladorABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        Scanner scanner = new Scanner();

        scanner.generarLexer();
        
        
        /*
        String nombreArchivo = "codigo.abc";
=======
        
        /*String nombreArchivo = "codigo.abc";
>>>>>>> 47ad72c0a0d10c74b7e88a7ab09a135358477e16
        Reader reader = new BufferedReader(new FileReader(nombreArchivo));
        Lexer lex = new Lexer(reader);
        Parser pars = new Parser(lex);
        pars.parse();*/
                
        //Tabla_símbolos tabla_simbolos = new Tabla_símbolos();
        
        //scanner.escanearArchivo("CodigoPrueba.txt", tabla_simbolos);
        
        //tabla_simbolos.print();
        
       //System.out.println("\n\n");
        
        //System.out.println(scanner.getListaErrores());
        
    }
    
}
