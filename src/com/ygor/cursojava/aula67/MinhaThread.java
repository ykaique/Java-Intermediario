package com.ygor.cursojava.aula67;

public class MinhaThread extends Thread {

    private int tempo;
    private String nome;

    public MinhaThread(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 6; i++) {
                System.out.println(this.nome + " contador " + i);
                Thread.sleep(this.tempo);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.nome + " terminou a execucao");
    }
}
