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
    ArrayList argumentos;
    //constructor funciones
    public Simbolo(String nombre, String tipo, int direccion, ArrayList argumentos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.valor = valor;
        this.argumentos = argumentos;
    }
    //constructor variables
    public Simbolo(String nombre, String tipo, int direccion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
    }
    //constructor constantes
    public Simbolo(String nombre, String tipo, int direccion, Object valor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.direccion = direccion;
        this.valor = valor;
    }

    public Object getValor() {
        return valor;
    }

    public void setValor(Object valor) {
        this.valor = valor;
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
        return nombre + "->[" + tipo + "]";
    }
    
    
    
}
