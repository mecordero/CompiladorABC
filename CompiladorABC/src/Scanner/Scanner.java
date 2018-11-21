/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Scanner;

import Clases.ScannerException;
import Clases.Tabla_símbolos;
import Clases.Tipo_token;
import static Clases.Tipo_token.ERROR;
import static Clases.Tipo_token.IDENTIFICADOR;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java_cup.*;
/**
 *
 * @author Meli
 */
public class Scanner {

    String pathLexer;
    String pathParser;
    String pathProyecto;
    String listaErrores;

    public String getListaErrores() {
        return listaErrores;
    }


    public Scanner() {

        //pathLexer = "C:/Users/Meli/Documents/TEC/2018 2do Sem/Compiladores e Interpretes/Proyecto/CompiladorABC/CompiladorABC/src/Scanner/Lexer.flex";
        pathLexer = "C:/Users/yanil/Documents/COMPILADORABC/CompiladorABC/CompiladorABC/src/Scanner/Lexer.flex";
        //pathParser = "C:/Users/Meli/Documents/TEC/2018 2do Sem/Compiladores e Interpretes/Proyecto/CompiladorABC/CompiladorABC/src/Parser/Parser.cup";
        pathParser = "C:/Users/yanil/Documents/COMPILADORABC/CompiladorABC/CompiladorABC/src/Parser/Parser.cup";
        //pathProyecto = "C:/Users/Meli/Documents/TEC/2018 2do Sem/Compiladores e Interpretes/Proyecto/CompiladorABC/CompiladorABC/";
        pathProyecto = "C:/Users/yanil/Documents/COMPILADORABC/CompiladorABC/CompiladorABC/";

        listaErrores = "";
    }

    public void generarLexer() {
        System.out.println("GENERA LEXER");
        File lexer = new File(pathLexer);
        jflex.Main.generate(lexer);
        
    }
    
    public void generarParser(){
        
        System.out.println("GENERA PARSER");
        
        String [] asintactico = {"-parser", "Parser", pathParser};
        
        try{
            java_cup.Main.main(asintactico);
        }catch(Exception e){
            System.out.println("excepcion: " + e);
        }
        
    }
    
    public void moverArchivosParser(){
        System.out.println("MUEVE ARCHIVOS");
        File sym = new File (pathProyecto + "sym.java");
        File parser = new File (pathProyecto + "Parser.java");
        
        if(sym.exists()){
            File symViejo = new File (pathProyecto + "src/Parser/sym.java");
            symViejo.delete();
            sym.renameTo(new File (pathProyecto + "src/Parser/sym.java"));          
            
        }
        
        if(parser.exists()){
            File parserViejo = new File(pathProyecto + "src/Parser/Parser.java");
            parserViejo.delete();
            parser.renameTo(new File (pathProyecto + "src/Parser/Parser.java"));
        }
        
    }
    
    
/*
    public void escanearArchivo(String nombreArchivo) throws FileNotFoundException, IOException {
        Reader reader = new BufferedReader(new FileReader(nombreArchivo));
        Lexer lexer = new Lexer(reader);

        System.out.println("\n");
        
        
        
        
        
        while (true) {
           
            
            try {
                Tipo_token t_token = lexer.yylex();
                if (t_token == null) {
                    break;
                }
                
                if(t_token == IDENTIFICADOR && lexer.yytext().length() > 127 ) {
                    throw new ScannerException("Identificador erróneo, no puede ser mayor a 127 caracteres",  lexer.yytext(), lexer.yyline());
                }
                if (t_token != ERROR) {
                    tabla_simbolos.agregarToken(lexer.yytext(), t_token, lexer.yyline() + 1);
                }
            } catch (ScannerException e) {
                if(e.getCaracteres().length() == 1 && (int) e.getCaracteres().charAt(0) == 65279){
                    continue;
                }
                listaErrores+=("[Línea: " + e.getLinea() + "]=>" + e.getCaracteres()+ ": " + e.getMessage()+ "\n");
            } 
        }
        System.out.println("\n");
    }*/
}
