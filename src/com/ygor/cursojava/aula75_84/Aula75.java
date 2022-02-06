package com.ygor.cursojava.aula75_84;

public class Aula75 {

    public static void main(String[] args) {
        String vazio = new String();
        System.out.println(vazio);

        String java = new String("Java");
        System.out.println(java);

        String java1 = new String(java);
        System.out.println(java1);

        char[] charsJava = {'J', 'A', 'V', 'A'};
        String java2 = new String(charsJava);
        System.out.println(java2);

        char[] abcdef = {'A', 'B', 'C', 'D', 'E', 'F'};
        String abc = new String(abcdef, 5, 1);
        System.out.println(abc);

        byte[] ascii = {65, 66, 67, 68, 69};
        String abcde = new String(ascii);
        System.out.println(abcde);

    }

}
