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
public class Coder {
    private String codigo;
    private TSimbolos tsimbolo;
    private PilaSemantica pila;
    private GeneradorLabels generadorLabels;

    public String getCodigo() {
        return codigo;
    }
    
    

    public Coder() {
        codigo = ".model tiny \n";
        pila = new PilaSemantica();
        tsimbolo = new TSimbolos();
        generadorLabels = new GeneradorLabels();
    }
    
    public void recordarIdentificador(String id) {
        System.out.println("Recuerda identificador");
        pila.pushRegistro(new RS_Identificador(id));
    }
    
    public void recordarTipo(String tipo) {
        pila.pushRegistro(new RS_Tipo(tipo));
    }
    
    public void recordarDO(String nombreVariable, String valor){
        System.out.println("Recuerda DO " + nombreVariable);
        pila.pushRegistro(new RS_DO(nombreVariable,valor));        
    }
    
    public void recordarOperacion(String operador){
        System.out.println("Recuerda Operación " + operador);
        pila.pushRegistro(new RS_Operacion(operador));
    }
    
    public void guardarFuncionEnTsimbolo(String nombre) {
        System.out.println("Guarda variables en ts");
        ArrayList<Simbolo> argumentos = new ArrayList<>();
        
        RegistroSemantico tipo = pila.popRegistro();
        RegistroSemantico top = pila.verTop();
        
        int pos = 0;
        
        while(!(top instanceof RS_Func)) {
            pos++;
            // top es un identificador
            pila.popRegistro();
            // el que viene es el tipo
            RegistroSemantico tipoArg = pila.popRegistro();
            Simbolo s  = new Simbolo(((RS_Identificador)top).getNombre(),((RS_Tipo)tipoArg).getTipo(), pos );
            argumentos.add(s);
            top = pila.verTop();
        }
        
        tsimbolo.agregarFuncion( nombre, ((RS_Tipo)tipo).getTipo(), argumentos);
    }
    
    public void recordarFuncion() {
        pila.pushRegistro(new RS_Func());
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
    
    /*
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
    }*/

    public void evalBinaria(){
        System.out.println("Evalúa operacion binaria");
        RS_DO operando2 = (RS_DO) pila.popRegistro();
        RS_Operacion operador = (RS_Operacion) pila.popRegistro();
        RS_DO operando1 = (RS_DO) pila.popRegistro();
        
        if(!isOperacion(operador.getOperador())){
            //si no es una operacion binaria lo devuelve a como estaba
            pila.pushRegistro(operando1);
            pila.pushRegistro(operador);
            pila.pushRegistro(operando2);
            return;
        }        
        if(operando1.getNombreVariable().equals(operando2.getNombreVariable())){
            //son del mismo tipo, o son el mismo identificador
            //se asume que son el mismo tipo
            String tipo = operando1.getNombreVariable();
            
            if(tipo.equals("Int") && operando1.getValor() != null){
                int operando1Int = (int) operando1.getValor();
                int operando2Int = (int) operando2.getValor();
                int resultado = realizarOperacion(operando1Int, operando2Int, operador.getOperador());
                pila.pushRegistro(new RS_DO("Int", resultado));
                return;
            }else if(tipo.equals("Float") && operando1.getValor() != null){
                Float operando1Float = (Float) operando1.getValor();
                Float operando2Float = (Float) operando2.getValor();
                
                Float resultado = realizarOperacion(operando1Float, operando2Float, operador.getOperador());
                pila.pushRegistro(new RS_DO("Float", resultado));
                return;
            }
            
        } 

        //es una operacion que tiene identificadores

        //validar que existen

        //validar tipos

        //generar codigo
        codigo += "     mov ax, ";
        if((operando1.getNombreVariable().equals("Int") || operando1.getNombreVariable().equals("Float") ) && operando1.getValor() != null){
            //primer operador es un entero o un flotante
            codigo += operando1.getValor().toString() + "\n";
        }else{
            codigo += operando1.getNombreVariable() + "\n";
        }
        
        switch(operador.getOperador().toUpperCase()){
            case "+":
                codigo += "add ax, ";
                break;
            case "-":
                codigo += "sub ax, ";
                break;
            case "*":
                codigo += "mul ";
                break;
            case "/":
            case "DIV":
            case "MOD":
                codigo += "div ";
                
        }
       
        if((operando2.getNombreVariable().equals("Int") || operando2.getNombreVariable().equals("Float") ) && operando2.getValor() != null){
            //segunfo operador es un entero o un flotante
            codigo += operando2.getValor().toString() + "\n";            
        }else{
            codigo += operando2.getNombreVariable() + "\n";
        }
        
        if(operador.getOperador().toUpperCase().equals("MOD")){
            recordarDO("dx", null);
            return;
        }
        //crear rs_do resultado
        //push pila
        recordarDO("ax", null);      
       
    }
    
    private boolean isOperacion(String operador){
        return operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/") ||
                operador.toUpperCase().equals("DIV") || operador.toUpperCase().equals("MOD");
    }
    
    private int realizarOperacion(int op1, int op2, String operador){
        switch(operador){
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
            case "DIV":
                return op1 / op2;
            case "MOD":
                return op1 % op2;
        }        
        return 0;
    }
    
    private Float realizarOperacion(Float op1, Float op2, String operador){
        switch(operador){
            case "+":
                return op1 + op2;
            case "-":
                return op1 - op2;
            case "*":
                return op1 * op2;
            case "/":
            case "DIV":
                return op1 / op2;
            case "MOD":
                return op1 % op2;
        }        
        return 0F;
    }
    
    public void generarCodigoAsignacion(){
        RS_DO valorAsignar = (RS_DO) pila.popRegistro();
        RS_Operacion operadorAsignacion = (RS_Operacion) pila.popRegistro();
        RS_DO identificador = (RS_DO) pila.popRegistro();
        codigo += "     mov " + identificador.getNombreVariable() + ", ";  
        if(valorAsignar.getValor() != null){
            codigo += String.valueOf(valorAsignar.getValor());
        }else{
            codigo += valorAsignar.getNombreVariable();
        }
    }
    
    public void preIncDec(){
        RS_DO operando = (RS_DO) pila.popRegistro();
        RS_Operacion operador = (RS_Operacion) pila.popRegistro();
        generarCodigoIncDec(operando, operador);
        recordarDO(operando.getNombreVariable(), null);
    }
    
    public void postIncDec(){
        RS_Operacion operador = (RS_Operacion) pila.popRegistro();
        RS_DO operando = (RS_DO) pila.popRegistro();
        generarCodigoIncDec(operando, operador);
        recordarDO(operando.getNombreVariable(), null);
    }
    
    private void generarCodigoIncDec(RS_DO operando, RS_Operacion operador){
        System.out.println("genera codigo inc dec");
        switch(operador.getOperador()){
            case "++":
                codigo += "     inc " + operando.getNombreVariable() + "\n";                
                break;
            case "--":
                codigo += "     dec " + operando.getNombreVariable() + "\n";
        }
    }
    
    public void start_if(){
        // Se crea RS de If y se generan las etiquetas
        RS_If rs = new RS_If();
        System.out.println("Recuerda if");
        pila.pushRegistro(rs);  
    }
    
    public void evalExp_if() {
        // TODO Falta generar codigo del condicional
        RS_If rs =(RS_If) pila.buscar("Clases.RS_If");
        codigo += "     jz " + rs.getElse_label() + "\n"; 
    }
    
    public void else_if() {
        RegistroSemantico rs = pila.buscar("Clases.RS_If");
        // se agrega el salto
         codigo += "     jmp " + ((RS_If)rs).getExit_label() + "\n";
         // Se agrega la etiqueta del Else
         codigo += " " + ((RS_If)rs).getElse_label()+ ":\n";
    }
    
    public void end_if(){
        RegistroSemantico rs = pila.popRegistro();
        while(!(rs instanceof RS_If)){
            rs = pila.popRegistro();
        }
        codigo += " " + ((RS_If)rs).getExit_label() + ":\n";
    }
    
    public void start_while(){
        RS_While rs = new RS_While();
        codigo += " " + rs.getStart_label()+ ":\n";
        pila.pushRegistro(rs);
    }
    
    public void evalCondicion(){

        RS_DO operando2 = (RS_DO) pila.popRegistro();
        RS_Operacion operador = (RS_Operacion) pila.popRegistro();
        RS_DO operando1 = (RS_DO) pila.popRegistro();
        
        codigo += "     mov ax, ";
        if((operando1.getNombreVariable().equals("Int") || operando1.getNombreVariable().equals("Float") ) && operando1.getValor() != null){
            //primer operando es un entero o un flotante
            codigo+= operando1.getValor().toString() + "\n";
        }else{
            codigo+= operando1.getNombreVariable() + "\n";
        }
        
        codigo += "     mov bx, ";
        
        if((operando2.getNombreVariable().equals("Int") || operando2.getNombreVariable().equals("Float") ) && operando2.getValor() != null){
            //segundo operando es un entero o un flotante
            codigo+= operando2.getValor().toString() + "\n";
        }else{
            codigo+= operando2.getNombreVariable() + "\n";
        }
        
        codigo += "     cmp ax, bx \n";
        
        
    }
    
    public void evalExp_While(){
        // TODO Falta generar codigo del condicional
        RegistroSemantico rs = pila.buscar("RS_While");
        codigo += "     jz " + ((RS_If)rs).getExit_label()+ "\n"; 
        pila.popRegistro();
    }
    
    public void end_while(){
       RegistroSemantico rs = pila.popRegistro();
       codigo += "     jz " + ((RS_While)rs).getStart_label()+ "\n";
       codigo += " " + ((RS_While)rs).getExit_label()+ ":\n";
    }
    
    @Override
    public String toString() {
        return tsimbolo.toString();
    }
    
    
    
    
    
    
    
}
