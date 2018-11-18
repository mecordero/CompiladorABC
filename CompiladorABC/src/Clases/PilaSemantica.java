/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author Meli
 */
public class PilaSemantica {
    ArrayList<RegistroSemantico> pila;

    public PilaSemantica() {
        pila = new ArrayList<>();
    }
    
    public void pushRegistro(RegistroSemantico registro){
        pila.add(registro);
    }
    
    public RegistroSemantico popRegistro(){
        if(pila.size()>0)
            return pila.remove(pila.size()-1);
        return null;
    }
    
    public RegistroSemantico buscar(String nombreTipo){
        for (int i = pila.size()-1; i != -1; i--) {
            RegistroSemantico actual = pila.get(i);
            
            if(actual.getClass().getName().equals(nombreTipo)){
                return actual;
            }            
        }
        return null;
    }
       
}
