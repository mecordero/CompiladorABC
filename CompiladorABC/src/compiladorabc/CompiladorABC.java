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
        Tabla_símbolos tabla_simbolos = new Tabla_símbolos();
        
        scanner.escanearArchivo("CodigoPrueba.txt", tabla_simbolos);
        
        System.out.println(tabla_simbolos.toString());

        
    }
    
}
