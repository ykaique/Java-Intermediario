package com.ygor.cursojava.Aula69;

public class Teste {

    public static void main(String[] args) throws InterruptedException {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 700);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 100);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.start();
        t2.start();
        t3.start();
//        Teste 1
//        while (t1.isAlive() || t2.isAlive() || t3.isAlive()){
//            Thread.sleep(200);
//        }
        t1.join();
        t2.join();
        t3.join();

        System.out.println("Programa finalizado");

    }
}
