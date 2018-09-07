/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorabc;

import Scanner.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;

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
        
        System.out.println(scanner.escanearArchivo("CodigoPrueba.txt"));
        
    }
    
}
