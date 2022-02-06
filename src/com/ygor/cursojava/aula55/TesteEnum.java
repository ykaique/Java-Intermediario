package com.ygor.cursojava.aula55;

import com.ygor.cursojava.aula54.DiaSemana;

public class TesteEnum {

    public static void main(String[] args) {

        DiaSemana[] dias = DiaSemana.values();

        for (DiaSemana dia : dias) {
            System.out.println(dia.toString());
        }

        DiaSemana dia = Enum.valueOf(DiaSemana.class, "SEGUNDA");
        System.out.println(dia);

    }

}
