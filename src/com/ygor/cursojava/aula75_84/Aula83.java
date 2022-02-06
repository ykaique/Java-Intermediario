package com.ygor.cursojava.aula75_84;

import org.w3c.dom.ls.LSOutput;

public class Aula83 {

    public static void main(String[] args) {

        String[] letras = {"B", "C", "D", "E", "F"};
        String alfabeto = "";

        StringBuffer sb = new StringBuffer();
        for (String letra :
                letras) {
            sb.append(letra);
        }
        alfabeto = sb.toString();
        System.out.println(alfabeto);
        System.out.println(sb.reverse());

        StringBuilder sbf = new StringBuilder();
        for (String letra :
                letras) {
            sbf.append(letra);
        }
        alfabeto = sbf.toString();
        System.out.println(alfabeto);

        //Um é thread safe, o outro nao, de resto os metodos sao iguais.

    }
}

