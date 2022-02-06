package com.ygor.cursojava.aula74_exerc;

public class Farol {

    private boolean verde;


    synchronized void ficarVermelho(boolean estaExecutando, int tempo) throws InterruptedException {
        if (!estaExecutando) {
            verde = false;
            notify();
            return;
        }
        ficarAmarelo();
        System.out.print("Vermelho ");
        Thread.sleep(tempo);
        verde = false;

        notify();

        try {
            while (!verde) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    synchronized void ficarVerde(boolean estaExecutando, int tempo) throws InterruptedException {
        if (!estaExecutando) {
            verde = true;
            notify();
            return;
        }

        ficarAmarelo();
        System.out.println("Verde ");
        Thread.sleep(tempo);
        verde = true;
        notify();

        try {
            while (verde) {
                wait();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    synchronized void ficarAmarelo() throws InterruptedException {

        System.out.print("Amarelo ");
        Thread.sleep(500);


    }
}
