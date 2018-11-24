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
public class RS_DO extends RegistroSemantico{
    
    private String nombreVariable; //donde se almacena, 'Int', 'Float' o 'String'
    private Object valor;

    public RS_DO(String nombreVariable, String valor) {
        this.nombreVariable = nombreVariable;
        if(nombreVariable.equals("Int")){            
            this.valor = Integer.valueOf((String)valor);
        }else if(nombreVariable.equals("Float")){            
            this.valor = Float.valueOf((String)valor);
        }else
            this.valor = valor;
    }
    
    public RS_DO(String nombreVariable, int valor) {
        this.nombreVariable = nombreVariable;               
        this.valor = valor;
    }
    
    public RS_DO(String nombreVariable, Float valor) {
        this.nombreVariable = nombreVariable;               
        this.valor = valor;
    }

    public String getNombreVariable() {
        return nombreVariable;
    }

    public Object getValor() {
        return valor;
    }
    
    
}
