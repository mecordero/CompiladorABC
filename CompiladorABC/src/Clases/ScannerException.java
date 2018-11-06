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
public class ScannerException extends Exception {

    /**
     * Creates a new instance of <code>ScannerException</code> without detail
     * message.
     */
    String caracteres;
    int linea;

    public String getCaracteres() {
        return caracteres;
    }

    public int getLinea() {
        return linea;
    }
    
    public ScannerException() {
        caracteres = null;
        linea = 0;
    }

    /**
     * Constructs an instance of <code>ScannerException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ScannerException(String msg) {
        super(msg);
    }
    public ScannerException(String msg, String caracteres, int linea) {
        super(msg);
        this.caracteres = caracteres ;
        this.linea = linea;
    }
}
