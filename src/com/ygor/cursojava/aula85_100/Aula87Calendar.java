package com.ygor.cursojava.aula85_100;

import java.util.Calendar;

public class Aula87Calendar {

    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance();
        System.out.println(hoje.getTime());

        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH) + 1;
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR);
        int hora2 = hoje.get(Calendar.HOUR_OF_DAY);
        System.out.println(hora);
        System.out.println(hora2);

        System.out.println(dia + "/" + mes + "/" + ano);

        hoje.add(Calendar.DAY_OF_MONTH, -10);
        System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
    }

}
