package com.ygor.cursojava.aula74.exerc;

import com.ygor.cursojava.aula74_exerc.Farol;
import com.ygor.cursojava.aula74_exerc.FarolThread;

public class FarolTeste  {

    public static void main(String[] args) {

        Farol farol = new Farol();
        FarolThread vermelho = new FarolThread("Vermelho", farol,1000);
        FarolThread verde = new FarolThread("Verde", farol,2000);

        try {
            verde.t.join();
            vermelho.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
