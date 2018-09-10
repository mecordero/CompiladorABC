/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;

import Clases.Tabla_símbolos;
import Clases.Tipo_token;
import static Clases.Tipo_token.ERROR;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 *
 * @author Meli
 */
public class Scanner {
    
    String path;

    public Scanner() {
        
        path = "C:/Users/Meli/Documents/TEC/2018 2do Sem/Compiladores e Interpretes/Proyecto/CompiladorABC/CompiladorABC/src/Scanner/Lexer.flex";
        //path = "C://Users//yanil//Google Drive//IIS.2018//COMPILADORES//PROYECTO//CompiladorABC//CompiladorABC//src//Scanner//Lexer.flex";
        generarLexer();
    }
        
    public void generarLexer(){
        File lexer = new File(path);
        jflex.Main.generate(lexer);
    }
    
    public void escanearArchivo(String nombreArchivo, Tabla_símbolos tabla_simbolos) throws FileNotFoundException, IOException{
        Reader reader = new BufferedReader(new FileReader(nombreArchivo));
        Lexer lexer = new Lexer(reader);
        
        System.out.println("\n");
        
        while(true){
            Tipo_token t_token = lexer.yylex();
            if(t_token == null){
                break;
            }
            
            if(t_token != ERROR){
                tabla_simbolos.agregarToken(lexer.yytext(), t_token, lexer.yyline()+1);            
            }else{
                System.out.println("Error '" + lexer.yytext() + "' en linea " + lexer.yyline()+1);
            }
        }
        System.out.println("\n");
    }
}
    

