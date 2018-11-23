/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author yanil
 */
public class Coder {
    public String codigo;
    public TSimbolos tsimbolo;
    public PilaSemantica pila;

    public Coder() {
        codigo = ".model tiny \n";
        pila = new PilaSemantica();
        tsimbolo = new TSimbolos();
    }
    
    public void recordarIdentificador(String id) {
        pila.pushRegistro(new RS_Identificador(id));
    }
    
    public void recordarTipo(String tipo) {
        pila.pushRegistro(new RS_Tipo(tipo));
    }
    
    public void guardarFuncionEnTsimbolo(String nombre) {
        RegistroSemantico top;
        while((top = pila.popRegistro())!=null) {
            System.out.println(top.toString());
        }
    }
    
    public void guardarVariablesEnTSimbolos(String tipo) {
        RegistroSemantico top = pila.verTop();
        while(top instanceof RS_Identificador) {
            tsimbolo.agregarVariable(((RS_Identificador)top).getNombre(), tipo);
            pila.popRegistro();
            top = pila.verTop();
        }
    }
    
    public void guardarConstanteEnTSimbolos(String nombre, String tipo, Object valor){
        tsimbolo.agregarConstante(nombre, tipo, valor);
    }

    @Override
    public String toString() {
        return tsimbolo.toString();
    }
    
    
    
    
    
    
    
}
