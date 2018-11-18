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
public class RS_If extends RegistroSemantico{
    private String else_label;
    private String exit_label;

    public RS_If() {
        else_label = GeneradorLabels.getLabel();
        exit_label = GeneradorLabels.getLabel();
    }

    public String getElse_label() {
        return else_label;
    }

    public String getExit_label() {
        return exit_label;
    }
    
}
