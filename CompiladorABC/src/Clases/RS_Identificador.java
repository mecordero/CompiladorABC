/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Meli
 */
public class RS_Identificador extends RegistroSemantico {

    private String nombre;

    public RS_Identificador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "RS_Ident{" + "Iden=" + nombre + '}';
    }
}
