package com.ygor.cursojava.aula64;

public class Externa {

    private String text = "texto externo";

    public class Interna{

        private String text = "texto interno";

        public void imprimeTexto(){

            System.out.println(text);
            System.out.println(Externa.this.text);
        }
    }


    public static void main(String[] args) {

        Externa externa = new Externa();
        Interna interna = externa.new Interna();

        interna.imprimeTexto();

    }
}
