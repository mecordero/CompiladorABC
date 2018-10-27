/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorabc;

import Scanner.Scanner;

/**
 *
 * @author Meli
 */
public class MainCompilarJflex {
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        
        scanner.generarLexer();
    }
    
    
}
