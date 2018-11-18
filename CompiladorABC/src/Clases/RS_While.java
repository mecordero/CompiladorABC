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
public class RS_While extends RegistroSemantico{
    private String start_label;
    private String exit_label;

    public RS_While() {
        start_label = GeneradorLabels.getLabel();
        exit_label = GeneradorLabels.getLabel();
    }

    public String getStart_label() {
        return start_label;
    }

    public String getExit_label() {
        return exit_label;
    }
    
    
}
