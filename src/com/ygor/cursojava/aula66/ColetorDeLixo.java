package com.ygor.cursojava.aula66;

import com.ygor.cursojava.aula61.Contato;

public class ColetorDeLixo {

    public static void obterMemoriaUsada() {

        final int MB = 1024 * 1024;

        Runtime runtime = Runtime.getRuntime();
        System.out.println((runtime.totalMemory() - runtime.freeMemory()) / MB);
    }

    public static void main(String[] args) {

        Contato[] contatos = new Contato[100000];

        for (int i = 0; i < contatos.length; i++) {
            Contato contato = new Contato("Contato" + i,
                    "1234-567" + i, "contato" + i + "@email.com");
            contatos[i] = contato;
        }

        System.out.println("Contatos criados");
        obterMemoriaUsada();
        contatos = null;
        Runtime.getRuntime().runFinalization();
        Runtime.getRuntime().gc();
        System.out.println("Contatos removidos da memoria");
        obterMemoriaUsada();
    }

}


