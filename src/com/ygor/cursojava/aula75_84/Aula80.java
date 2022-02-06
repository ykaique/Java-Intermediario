package com.ygor.cursojava.aula75_84;

public class Aula80 {

    public static void main(String[] args) {

        String teste = "Isso é um teste.";
        System.out.println(teste);
        System.out.println(teste.substring(10));
        System.out.println(teste.substring(10, 15));

        String ola = "ola";
        String mundo = " mundo";
        String olaMundo = ola.concat(mundo);
        System.out.println(olaMundo);

        String espacos = " i s p a ç o";
        String semEspacos = espacos.replaceAll(" ", "").
                replace("i", "e");
        System.out.println(semEspacos);

        String nome = " meu nome é: ";
        nome = nome.trim();
        System.out.println(nome);
    }

}
