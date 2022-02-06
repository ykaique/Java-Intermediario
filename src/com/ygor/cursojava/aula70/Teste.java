package com.ygor.cursojava.aula70;

import com.ygor.cursojava.Aula69.MinhaThreadRunnable;

public class Teste {

    public static void main(String[] args) {

        MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 500);
        MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 500);
        MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#3", 500);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        Thread t3 = new Thread(thread3);

        t1.setPriority(1);
        t2.setPriority(2);
        t3.setPriority(3);

        t1.start();
        t2.start();
        t3.start();
    }

}
