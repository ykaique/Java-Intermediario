package com.ygor.cursojava.aula85_100;

import java.util.Locale;
import java.util.ResourceBundle;

public class Aula95ResourceBundle {

    public static void main(String[] args) {

        System.out.println("Locale atual "+ Locale.getDefault());
        ResourceBundle rb = ResourceBundle.getBundle("meu-texto");
        System.out.println("Ola: " + rb.getString("hello"));
        System.out.println("Mundo: " + rb.getString("world"));
    }

}
