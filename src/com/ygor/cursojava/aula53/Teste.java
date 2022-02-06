package com.ygor.cursojava.aula53;

public class Teste {
    public static void main(String[] args) {

        usandoConstantes();
        System.out.println();
        usandoEnum();
    }

    private static void usandoConstantes() {
        int seg = DiasSemanaConstantes.SEGUNDA;
        int ter = DiasSemanaConstantes.TERCA;
        int qua = DiasSemanaConstantes.QUARTA;
        int qui = DiasSemanaConstantes.QUINTA;
        int sex = DiasSemanaConstantes.SEXTA;
        int sab = DiasSemanaConstantes.SABADO;
        int dom = DiasSemanaConstantes.DOMINGO;

        System.out.println("Usando Constantes");

        imprimeDiaSemana(seg);
        imprimeDiaSemana(ter);
        imprimeDiaSemana(qua);
        imprimeDiaSemana(qui);
        imprimeDiaSemana(sex);
        imprimeDiaSemana(sab);
        imprimeDiaSemana(dom);

    }

    private static void imprimeDiaSemana(int dia) {
        switch (dia) {
            case 1:
                System.out.println("Segunda");
                break;
            case 2:
                System.out.println("Terca");
                break;
            case 3:
                System.out.println("Quarta");
                break;
            case 4:
                System.out.println("Quinta");
                break;
            case 5:
                System.out.println("Sexta");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }

    private static void usandoEnum() {
        DiaSemana seg = DiaSemana.SEGUNDA;
        DiaSemana ter = DiaSemana.TERCA;
        DiaSemana qua = DiaSemana.QUARTA;
        DiaSemana qui = DiaSemana.QUINTA;
        DiaSemana sex = DiaSemana.SEXTA;
        DiaSemana sab = DiaSemana.SABADO;
        DiaSemana dom = DiaSemana.DOMINGO;

        System.out.println("Usando Enum");

        imprimeDiaSemana(seg);
        imprimeDiaSemana(ter);
        imprimeDiaSemana(qua);
        imprimeDiaSemana(qui);
        imprimeDiaSemana(sex);
        imprimeDiaSemana(sab);
        imprimeDiaSemana(dom);

    }

    private static void imprimeDiaSemana(DiaSemana dia) {
        switch (dia) {
            case SEGUNDA:
                System.out.println("Segunda");
                break;
            case TERCA:
                System.out.println("Terca");
                break;
            case QUARTA:
                System.out.println("Quarta");
                break;
            case QUINTA:
                System.out.println("Quinta");
                break;
            case SEXTA:
                System.out.println("Sexta");
                break;
            case SABADO:
                System.out.println("Sabado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }

}
