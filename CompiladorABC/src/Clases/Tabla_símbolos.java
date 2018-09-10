/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.HashMap;

/**
 *
 * @author Meli
 */
public class Tabla_símbolos {
    private HashMap <String, Token> tokens_encontrados;

    public Tabla_símbolos() {
        tokens_encontrados = new HashMap<>();
    }   
    
    public void agregarToken(String caracteres, Tipo_token tipo, int linea){
        Token token = tokens_encontrados.get(caracteres.toUpperCase());
        
        if(token ==null){
            tokens_encontrados.put(caracteres.toUpperCase(), new Token(caracteres.toUpperCase(), tipo, linea));
        }else{
            token.nuevaRepetición(linea);
        }
    }

    @Override
    public String toString() {
        String resultado = "TOKEN   TIPO TOKEN  LINEA \n";
        
        for(String caracteres: tokens_encontrados.keySet()){
            Token token = tokens_encontrados.get(caracteres);
            resultado += caracteres + "   " + token.getTipo() + "    ";
            
            boolean primero = true;
            for(Integer linea: token.getRepeticiones().keySet()){
                Integer num = token.getRepeticiones().get(linea);
                
                if(!primero)
                    resultado += ", ";
                else
                    primero = false;
                
                if(num > 1)
                    resultado += linea + "(" + num + ")";
                else
                    resultado += linea;
            }
            resultado += "\n";
        }
              
        return resultado;
    }
    
    
    
}
