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
                tokens_encontrados.put(caracteres.toUpperCase(), new Token(caracteres.toUpperCase(), tipo, linea, Integer.parseInt(caracteres.substring(1))));
            }
        } else {
            token.nuevaRepetición(linea);
        }
    }

    @Override
    public String toString() {
        String resultado = "TOKEN   TIPO TOKEN  LINEA \n";

        for (String caracteres : tokens_encontrados.keySet()) {
            Token token = tokens_encontrados.get(caracteres);
            resultado += caracteres + "   " + token.getTipo() + "    ";

            boolean primero = true;
            for (Integer linea : token.getRepeticiones().keySet()) {
                Integer num = token.getRepeticiones().get(linea);

                if (!primero) {
                    resultado += ", ";
                } else {
                    primero = false;
                }

                if (num > 1) {
                    resultado += linea + "(" + num + ")";
                } else {
                    resultado += linea;
                }
            }
            resultado += "\n";
        }

        return resultado;
    }

}
