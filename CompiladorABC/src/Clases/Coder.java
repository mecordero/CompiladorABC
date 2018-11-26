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
    private Boolean generarCodigo;
    private String codTemp;
    private int contFunc;

    public String getCodigo() {
        return codigo;
    }

    public Coder() {
        codigo = ".model tiny " + System.lineSeparator();
        pila = new PilaSemantica();
        tsimbolo = new TSimbolos();
        generadorLabels = new GeneradorLabels();
        generarCodigo = true;
        codTemp = "";
        contFunc = 1;
    }

    public void recordarIdentificador(String id) {
        pila.pushRegistro(new RS_Identificador(id));
    }

    public void recordarTipo(String tipo) {
        pila.pushRegistro(new RS_Tipo(tipo));
    }

    public void recordarDO(String nombreVariable, String valor) {
        
        //verifica que si es una variable exista
        if(valor == null && !nombreVariable.equals("ax") ){
            Simbolo s = tsimbolo.buscarSimbolo(nombreVariable);
            if(s == null)
                System.out.println("Error semántico: el identificador " + nombreVariable + " no ha sido declarado");
        }
        
        pila.pushRegistro(new RS_DO(nombreVariable, valor));
    }

    public void recordarOperacion(String operador) {
        pila.pushRegistro(new RS_Operacion(operador));
    }

    public void guardarFuncionEnTsimbolo(String nombre) {
        ArrayList<Simbolo> argumentos = new ArrayList<Simbolo>();

        RegistroSemantico tipo = pila.popRegistro();
        RegistroSemantico top = pila.verTop();

        int pos = 0;

        while (top != null && !(top instanceof RS_Func)) {
            pos++;
            // top es un identificador
            pila.popRegistro();
            // el que viene es el tipo
            RegistroSemantico tipoArg = pila.popRegistro();
            Simbolo s = new Simbolo(((RS_Identificador) top).getNombre(), ((RS_Tipo) tipoArg).getTipo(), pos);
            argumentos.add(s);
            top = pila.verTop();
        }
        
        if(top instanceof RS_Func)
            System.out.println("es funcion aqui");
        else
            System.out.println("no es funcion aqui");
        int resultado = tsimbolo.agregarFuncion(nombre, ((RS_Tipo) tipo).getTipo(), argumentos);

        if (resultado == -1) {
            generarCodigo = false;
        }else{
            codTemp += "\n\n function_" + contFunc + ":" + System.lineSeparator();
            contFunc++;
            codTemp += codigo;
            codTemp += "     ret" + System.lineSeparator() + System.lineSeparator();
            codigo = codTemp;
            codTemp = "";
        }

    }
    public void startFunction(){
        codTemp = codigo;
        codigo = "";
        
    }
    
    public void endFuncion(){
        System.out.println("end funcion");
        RS_Func f = (RS_Func) pila.popRegistro();
        System.out.println(f);
    }
    public void recordarFuncion() {
        pila.pushRegistro(new RS_Func());
    }

    public void guardarVariablesEnTSimbolos(String tipo) {
        RegistroSemantico top = pila.verTop();
        while (top instanceof RS_Identificador) {
            int resultado = tsimbolo.agregarVariable(((RS_Identificador) top).getNombre(), tipo);
            if (resultado == -1) {
                generarCodigo = false;
            }
            pila.popRegistro();
            codigo += ((RS_Identificador) top).getNombre() + "\t resb  \t";

            if (tipo.toUpperCase().equals("INT")) {
                codigo += " 4 " + System.lineSeparator();
            } else if (tipo.toUpperCase().equals("SHORTINT")) {
                codigo += " 2 " + System.lineSeparator();
            } else if (tipo.toUpperCase().equals("LONGTINT")) {
                codigo += " 6 " + System.lineSeparator();
            } else if (tipo.toUpperCase().equals("CHAR")) {
                codigo += " 1 " + System.lineSeparator();
            } else if (tipo.toUpperCase().equals("BOOLEAN")) {
                codigo += " 1 " + System.lineSeparator();
            } else if (tipo.toUpperCase().equals("REAL")) {
                codigo += " 4 " + System.lineSeparator();
            } else if (tipo.toUpperCase().equals("STRING")) {
                codigo += " 30 " + System.lineSeparator();
            }

            top = pila.verTop();
        }
    }

    public void iniciarVar() {
        codigo += ".UDATA " + System.lineSeparator();
    }

    public void iniciarCode() {
        codigo += ".CODE " + System.lineSeparator();
    }

    public void guardarConstanteEnTSimbolos(String nombre, String tipo, Object valor) {
        int resultado = tsimbolo.agregarConstante(nombre, tipo, valor);
        pila.popRegistro();
        if (resultado == -1) {
            generarCodigo = false;
        }
    }

    public void evalBinaria() {
        RS_DO operando2 = (RS_DO) pila.popRegistro();
        RS_Operacion operador = (RS_Operacion) pila.popRegistro();
        RS_DO operando1 = (RS_DO) pila.popRegistro();      

        if (!isOperacion(operador.getOperador())) {
            //si no es una operacion binaria lo devuelve a como estaba
            pila.pushRegistro(operando1);
            pila.pushRegistro(operador);
            pila.pushRegistro(operando2);
            return;
        }
        if (operando1.getNombreVariable().equals(operando2.getNombreVariable())) {
            //son del mismo tipo, o son el mismo identificador
            //se asume que son el mismo tipo
            String tipo = operando1.getNombreVariable();

            if (tipo.equals("Int") && operando1.getValor() != null) {
                int operando1Int = (int) operando1.getValor();
                int operando2Int = (int) operando2.getValor();
                int resultado = realizarOperacion(operando1Int, operando2Int, operador.getOperador());
                pila.pushRegistro(new RS_DO("Int", resultado));
                return;
            } else if (tipo.equals("Float") && operando1.getValor() != null) {
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
        if ((operando1.getNombreVariable().equals("Int") || operando1.getNombreVariable().equals("Float")) && operando1.getValor() != null) {
            //primer operador es un entero o un flotante
            codigo += operando1.getValor().toString()  + System.lineSeparator();
        } else {
            codigo += operando1.getNombreVariable()  + System.lineSeparator();
        }

        switch (operador.getOperador().toUpperCase()) {
            case "+":
                codigo += "     add ax, ";
                break;
            case "-":
                codigo += "     sub ax, ";
                break;
            case "*":
                codigo += "     mul ";
                break;
            case "/":
            case "DIV":
            case "MOD":
                codigo += "     div ";

        }

        if ((operando2.getNombreVariable().equals("Int") || operando2.getNombreVariable().equals("Float")) && operando2.getValor() != null) {
            //segunfo operador es un entero o un flotante
            codigo += operando2.getValor().toString()  + System.lineSeparator();
        } else {
            codigo += operando2.getNombreVariable() + System.lineSeparator();
        }

        if (operador.getOperador().toUpperCase().equals("MOD")) {
            recordarDO("dx", null);
            return;
        }
        //crear rs_do resultado
        //push pila
        recordarDO("ax", null);

    }

    private boolean isOperacion(String operador) {
        return operador.equals("+") || operador.equals("-") || operador.equals("*") || operador.equals("/")
                || operador.toUpperCase().equals("DIV") || operador.toUpperCase().equals("MOD");
    }

    private int realizarOperacion(int op1, int op2, String operador) {
        switch (operador) {
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

    private Float realizarOperacion(Float op1, Float op2, String operador) {
        switch (operador) {
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

    public void generarCodigoAsignacion(String tipo) {
        RS_DO valorAsignar = (RS_DO) pila.popRegistro();
        RS_Operacion operadorAsignacion = (RS_Operacion) pila.popRegistro();
        RS_DO identificador = (RS_DO) pila.popRegistro();
        
        Simbolo sim = tsimbolo.buscarSimbolo(identificador.getNombreVariable());
        
        if (sim == null) {
            System.out.println("No se ha declarado la variable " + identificador.getNombreVariable());
            generarCodigo = false;  
        } else  if (sim.getEsConstante()) {
                System.out.println("\u001B[31m La variable " + identificador.getNombreVariable() + " es una constante.");
                generarCodigo = false;
        } else  if (sim.esFuncion) {
                System.out.println("\u001B[31m La variable " + identificador.getNombreVariable() + " es una función.");
                generarCodigo = false;
        } else if (sim.getTipo() != tipo) {
            if (!((sim.getTipo().toLowerCase().equals("real") || 
                sim.getTipo().toLowerCase().equals("int") || 
                sim.getTipo().toLowerCase().equals("float") ||
                sim.getTipo().toLowerCase().equals("longint") || 
                sim.getTipo().toLowerCase().equals("shortint")) && tipo == "numero")) {
                System.out.println("\u001B[31m La asignación no corresponde al tipo de la variable " + identificador.getNombreVariable());
                generarCodigo = false;
            }
        }
        
        System.out.println(sim.toString());
        
        codigo += "     mov " + identificador.getNombreVariable() + ", ";
        if (valorAsignar.getValor() != null) {
            codigo += String.valueOf(valorAsignar.getValor()) + System.lineSeparator();
        } else {
            codigo += valorAsignar.getNombreVariable() + System.lineSeparator();
        }
    }

    public void preIncDec() {
        RS_DO operando = (RS_DO) pila.popRegistro();
        RS_Operacion operador = (RS_Operacion) pila.popRegistro();
        generarCodigoIncDec(operando, operador);
        recordarDO(operando.getNombreVariable(), null);
    }

    public void postIncDec() {
        RS_Operacion operador = (RS_Operacion) pila.popRegistro();
        RS_DO operando = (RS_DO) pila.popRegistro();
        generarCodigoIncDec(operando, operador);
        recordarDO(operando.getNombreVariable(), null);
    }

    private void generarCodigoIncDec(RS_DO operando, RS_Operacion operador) {
        switch (operador.getOperador()) {
            case "++":
                codigo += "     inc " + operando.getNombreVariable() + System.lineSeparator();
                break;
            case "--":
                codigo += "     dec " + operando.getNombreVariable() + System.lineSeparator();
        }
    }

    public void start_if() {
        // Se crea RS de If y se generan las etiquetas
        RS_If rs = new RS_If();
        pila.pushRegistro(rs);
    }

    public void else_if() {
        RegistroSemantico rs = pila.buscar("Clases.RS_If");
        // se agrega el salto
        codigo += "     jmp " + ((RS_If) rs).getExit_label() + System.lineSeparator();
        // Se agrega la etiqueta del Else
        codigo += " " + ((RS_If) rs).getElse_label() + ":"  + System.lineSeparator();
    }

    public void end_if() {
        RegistroSemantico rs = pila.popRegistro();
        while (!(rs instanceof RS_If)) {
            rs = pila.popRegistro();
        }
        codigo += " " + ((RS_If) rs).getExit_label() + ":"  + System.lineSeparator();
    }

    public void start_while() {
        RS_While rs = new RS_While();
        codigo += " " + rs.getStart_label() + ":"  + System.lineSeparator();
        pila.pushRegistro(rs);
    }

    private RS_Operacion generarCodigoCmp() {

        RS_DO operando2 = (RS_DO) pila.popRegistro();
        RS_Operacion operador = (RS_Operacion) pila.popRegistro();
        RS_DO operando1 = (RS_DO) pila.popRegistro();

        codigo += "     mov ax, ";
        if ((operando1.getNombreVariable().equals("Int") || operando1.getNombreVariable().equals("Float")) && operando1.getValor() != null) {
            //primer operando es un entero o un flotante
            codigo += operando1.getValor().toString() + System.lineSeparator();
        } else {
            codigo += operando1.getNombreVariable() + System.lineSeparator();
        }

        codigo += "     mov bx, ";

        if ((operando2.getNombreVariable().equals("Int") || operando2.getNombreVariable().equals("Float")) && operando2.getValor() != null) {
            //segundo operando es un entero o un flotante
            codigo += operando2.getValor().toString() + System.lineSeparator();
        } else {
            codigo += operando2.getNombreVariable() + System.lineSeparator();
        }

        codigo += "     cmp ax, bx"  + System.lineSeparator();

        return operador;
    }

    public void evalExp_if() {
        RS_Operacion operador = generarCodigoCmp();

        RS_If rs = (RS_If) pila.buscar("Clases.RS_If");

        generarCodigoJump(operador.getOperador(), rs.getElse_label());

    }

    private void generarCodigoJump(String operador, String label) {
        switch (operador) {
            case "=":
                codigo += "     jne " + label + System.lineSeparator();
                break;
            case ">":
                codigo += "     jng " + label + System.lineSeparator();
                break;
            case ">=":
                codigo += "     jnge " + label + System.lineSeparator();
                break;
            case "<":
                codigo += "     jnl " + label + System.lineSeparator();
                break;
            case "<=":
                codigo += "     jnle " + label + System.lineSeparator();
                break;
            case "<>":
                codigo += "     je " + label + System.lineSeparator();
                break;
        }
    }

    public void evalExp_While() {
        RS_Operacion operador = generarCodigoCmp();

        RS_While rs = (RS_While) pila.buscar("Clases.RS_While");
        generarCodigoJump(operador.getOperador(), rs.getExit_label());

    }

    public void end_while() {
        RegistroSemantico rs = pila.popRegistro();
        while (!(rs instanceof RS_While)) {
            rs = pila.popRegistro();
        }
        codigo += "     jmp " + ((RS_While) rs).getStart_label() + System.lineSeparator();
        codigo += " " + ((RS_While) rs).getExit_label() + ":"  + System.lineSeparator();
    }

    @Override
    public String toString() {
        return tsimbolo.toString();
    }

}
