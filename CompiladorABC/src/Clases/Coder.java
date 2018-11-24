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
        System.out.println("Recuerda identificador");
        pila.pushRegistro(new RS_Identificador(id));
    }
    
    public void recordarTipo(String tipo) {
        pila.pushRegistro(new RS_Tipo(tipo));
    }
    
    public void recordarDO(String nombreVariable, Object valor){
        System.out.println("Recuerda DO " + nombreVariable);
        pila.pushRegistro(new RS_DO(nombreVariable,valor));        
    }
    
    public void recordarOperacion(String operador){
        System.out.println("Recuerda Operación " + operador);
        pila.pushRegistro(new RS_Operacion(operador));
    }
    
    public void guardarFuncionEnTsimbolo(String nombre) {
        RegistroSemantico top;
        while((top = pila.popRegistro())!=null) {
            System.out.println(top.toString());
        }
    }
    
    public void guardarVariablesEnTSimbolos(String tipo) {
        System.out.println("Guarda variables en ts");
        RegistroSemantico top = pila.verTop();
        while(top instanceof RS_Identificador) {
            tsimbolo.agregarVariable(((RS_Identificador)top).getNombre(), tipo);
            pila.popRegistro();
            top = pila.verTop();
        }
    }
    
    public void guardarConstanteEnTSimbolos(String nombre, String tipo, Object valor){
        System.out.println("Gurda constante en ts");
        tsimbolo.agregarConstante(nombre, tipo, valor);
    }
    
    public void evalOperacion(){
        System.out.println("Evalúa operacion");
        RegistroSemantico top = pila.verTop();
        if(top instanceof RS_Operacion && ((RS_Identificador)top).getNombre().equals(")")){
            pila.popRegistro();
            top = pila.verTop();
            while(!(top instanceof RS_Operacion && ((RS_Identificador)top).getNombre().equals("("))){
                RegistroSemantico resultado = evalBinaria();
                top = pila.verTop();
                pila.pushRegistro(resultado);
            }
        }
    }

    public RegistroSemantico evalBinaria(){
        RS_DO operando2 = (RS_DO) pila.popRegistro();
        RS_Operacion operador = (RS_Operacion) pila.popRegistro();
        RS_DO operando1 = (RS_DO) pila.popRegistro();
        
        //validar tipos
        if(operando1.getNombreVariable().equals(operando2.getNombreVariable())){
            //son del mismo tipo, o son el mismo identificador
            //se asume que son el mismo tipo
            String tipo = operando1.getNombreVariable();
            
            if(tipo.equals("Int")){
                int operando1Int = (int) operando1.getValor();
                int operando2Int = (int) operando2.getValor();
            }else if(tipo.equals("Float")){
                
            }
            
        }
        //else generar codigo
        //crear rs_do resultado
        //return rs_do resultado
        return null;
    }
    
    @Override
    public String toString() {
        return tsimbolo.toString();
    }
    
    
    
    
    
    
    
}
