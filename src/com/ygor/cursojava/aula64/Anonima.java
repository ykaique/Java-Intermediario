package com.ygor.cursojava.aula64;

public class Anonima {

    public void imprimeTexto() {
        System.out.println("Texto qualquer");
    }

    public static void main(String[] args) {
        Anonima anonima = new Anonima() {
            @Override
            public void imprimeTexto() {
                System.out.println("Outro texto");
            }
        };
        anonima.imprimeTexto();


        Texto texto = new Texto() {
            @Override
            public void imprimeTexto() {
                System.out.println("Interface");
            }
        };
        texto.imprimeTexto();
    }

}
