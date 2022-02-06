package com.ygor.cursojava.aula62;

public class ExemploVarags {


    public static void main(String[] args) {

        System.out.println(soma(1, 2));

        System.out.println(soma(5, 7, 9, 10, 12, 567));
    }

    static int soma(int a, int b) {
        return a + b;
    }

    static int soma(Integer... valor) {
       int tot = 0;

        for (Integer val :
                valor) {
            tot += val;
        }
        return tot;
    }

}
