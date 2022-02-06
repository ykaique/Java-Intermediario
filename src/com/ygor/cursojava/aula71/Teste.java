package com.ygor.cursojava.aula71;


public class Teste {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4};
        int[] array3 = {1, 2, 3, 4, 5, 6};

        MinhaThreadSoma t1 = new MinhaThreadSoma("#1", array1);
        MinhaThreadSoma t2 = new MinhaThreadSoma("#2", array2);
        MinhaThreadSoma t3 = new MinhaThreadSoma("#3", array3);
    }

}
