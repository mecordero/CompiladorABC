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
public class Token {
    private String caracteres;
    private Tipo_token tipo;
    private HashMap<Integer, Integer> repeticiones;

    public Token(String caracteres, Tipo_token tipo, int linea) {
        this.caracteres = caracteres;
        this.tipo = tipo;
        this.repeticiones = new HashMap<>();
        this.repeticiones.put(linea, 1);                
    }
    
    public void nuevaRepetición(int linea){
        Integer num = repeticiones.get(linea);
        if(num == null){
            repeticiones.put(linea, 1);
        }else{
            repeticiones.put(linea, num+1);
        }
    }

    public Tipo_token getTipo() {
        return tipo;
    }

    public HashMap<Integer, Integer> getRepeticiones() {
        return repeticiones;
    }
    
    
}
