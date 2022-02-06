package com.ygor.cursojava.aula56.exerc;

import com.ygor.cursojava.aula55.Operacoes;

public class TesteExerc {

    public static void main(String[] args) {
        Double x = 4d;
        Double y = 2d;

        for (Operacoes operacao :
                Operacoes.values()) {
            System.out.println(operacao.executarOperacao(x , y));
        }

    }

}
