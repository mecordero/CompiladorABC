/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import static Clases.Tipo_token.CHAR;
import java.util.HashMap;

/**
 *
 * @author Meli
 */
public class Tabla_símbolos {

    private HashMap<String, Token> tokens_encontrados;

    public Tabla_símbolos() {
        tokens_encontrados = new HashMap<>();
    }

    public void agregarToken(String caracteres, Tipo_token tipo, int linea) {
        Token token = tokens_encontrados.get(caracteres.toUpperCase());

        if (token == null) {
            if (tipo != CHAR) {
                tokens_encontrados.put(caracteres.toUpperCase(), new Token(caracteres.toUpperCase(), tipo, linea));
            } else {
                if (caracteres.startsWith("#")) {
                    tokens_encontrados.put(caracteres.toUpperCase(), new Token(caracteres.toUpperCase(), tipo, linea, Integer.parseInt(caracteres.substring(1))));
                } else {
                    tokens_encontrados.put(caracteres.toUpperCase(), new Token(caracteres.toUpperCase(), tipo, linea));

                }

            }
        } else {
            token.nuevaRepetición(linea);
        }
    }

    public void print() {
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------+");
        System.out.println(String.format("|  %-30s|  %-30s|  %-60s|", "TOKEN", "Tipo del Token", "Repeticiones"));
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------+");
        for (String caracteres : tokens_encontrados.keySet()) {
            Token token = tokens_encontrados.get(caracteres);

            String repeticiones = "";
            boolean primero = true;
            for (Integer linea : token.getRepeticiones().keySet()) {
                Integer num = token.getRepeticiones().get(linea);

                if (!primero) {
                    repeticiones += ", ";
                } else {
                    primero = false;
                }

                if (num > 1) {
                    repeticiones += linea + "(" + num + ")";
                } else {
                    repeticiones += linea;
                }
            }

            System.out.println(String.format("|  %-30s|  %-30s|  %-60s|", caracteres, token.getTipo(), repeticiones));

        }
        System.out.println("+--------------------------------------------------------------------------------------------------------------------------------+");
    }

}
