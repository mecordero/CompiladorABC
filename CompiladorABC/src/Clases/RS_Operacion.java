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
public class RS_Operacion extends RegistroSemantico{
    
    private String operador;

    public RS_Operacion(String operador) {
        this.operador = operador;
    }   

    public String getOperador() {
        return operador;
    }
    
}
