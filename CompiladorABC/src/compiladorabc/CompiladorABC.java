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
import java_cup.Lexer;
import java_cup.parser;

/**
 *
 * @author Meli
 */
public class CompiladorABC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String nombreArchivo = "CodigoPrueba.txt";
        Reader reader = new BufferedReader(new FileReader(nombreArchivo));
        try{
            System.out.println("linea 1");
            parser p = new parser(new Lexer(reader));
            System.out.println("linea 2");
            p.parse();
            p.parse();
            System.out.println("\n*** Resultados finales ***");
        }catch(Exception e){
            System.out.println("Excepcion: " + e.toString());
        }
        System.out.println("Termina el parseo");
    }   
}
