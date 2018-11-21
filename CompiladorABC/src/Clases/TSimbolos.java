/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author yanil
 */
public class TSimbolos {

    private HashMap<String, Simbolo> tablaSimbolos;
    private int contDireccion;
    
    public TSimbolos() {
        tablaSimbolos = new HashMap<>();
        contDireccion = 0;
    }
    
            public int agregarFuncion(String nombre, String tipo, ArrayList argumentos){
        // buscar si existe en t simbolos y si esta devuelve error
        if (tablaSimbolos.containsKey(nombre)){
            return -1;
        }
        
        //generar direccion
        contDireccion = contDireccion + 1;
        
        //agregar var a t simbolo
        Simbolo s = new Simbolo( nombre, tipo, contDireccion, argumentos);
        tablaSimbolos.put(nombre, s);
        
        return 0;
    }
    
    public int agregarVariable(String nombre, String tipo){
        // buscar si existe en t simbolos y si esta devuelve error
        if (tablaSimbolos.containsKey(nombre)){
            return -1;
        }
        
        //generar direccion
        contDireccion = contDireccion + 1;
        
        //agregar var a t simbolo
        Simbolo s = new Simbolo( nombre, tipo, contDireccion);
        tablaSimbolos.put(nombre, s);
        
        return 0;
    }
    
        public int agregarConstante(String nombre, String tipo, Object valor){
        // buscar si existe en t simbolos y si esta devuelve error
        if (tablaSimbolos.containsKey(nombre)){
            return -1;
        }
        
        //generar direccion
        contDireccion = contDireccion + 1;
        
        //agregar var a t simbolo
        Simbolo s = new Simbolo( nombre, tipo, contDireccion, valor);
        tablaSimbolos.put(nombre, s);
        
        return 0;
    }
     
    
   public void eliminarSimbolo(String nombre){
       tablaSimbolos.remove(nombre);
   }
   
   
   public boolean buscarSimbolo (String nombre){
       return tablaSimbolos.containsKey(nombre);
   }
    

}
