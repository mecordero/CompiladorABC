/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author yanil
 */
public class Simbolo {

    String nombre;
    String tipo;
    int direccion;
    Object valor;
    ArrayList<Simbolo> argumentos;
    boolean esVariable = false;
    boolean esConstante = false;
    boolean esFuncion = false;
    //constructor funciones
    public Simbolo(String nombre, String tipo, int direccion, ArrayList<Simbolo> argumentos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.argumentos = new ArrayList<>();
        for(int i = argumentos.size()-1; i > -1; i--){
            this.argumentos.add(argumentos.get(i));
        }
        this.esFuncion = true;
    }
    //constructor variables
    public Simbolo(String nombre, String tipo, int direccion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.esVariable = true;
    }
    //constructor constantes
    public Simbolo(String nombre, String tipo, int direccion, Object valor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.valor = valor;
        this.esConstante = true;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public boolean getEsVariable() {
        return esVariable;
    }

    public void setEsVariable(boolean esVariable) {
        this.esVariable = esVariable;
    }

    public boolean getEsConstante() {
        return esConstante;
    }

    public void setEsConstante(boolean esConstante) {
        this.esConstante = esConstante;
    }

    public boolean getEsFuncion() {
        return esFuncion;
    }

    public void setEsFuncion(boolean esFuncion) {
        this.esFuncion = esFuncion;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public ArrayList getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(ArrayList argumentos) {
        this.argumentos = argumentos;
    }
    
    public String toString() {
        if(!esFuncion)
            return nombre + "->[" + tipo + "]" ;
        String result = nombre + "->[" + tipo + "]" + ", argumentos: ";
        
        for (Simbolo argumento : argumentos) {
            result += argumento.nombre + "->[" + argumento.tipo + "]  ";
        }
        
        return result;
    }
    
    
    
}
