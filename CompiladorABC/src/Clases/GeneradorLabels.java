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
public class GeneradorLabels {
    private static int contador = 0;
    
    public static String getLabel(){
        contador++;
        return "label_" + contador;
    }
}
