package com.ygor.cursojava.aula75_84;

import java.util.Arrays;

public class Aula77 {

    public static void main(String[] args) {

        String java = "JAVA";

        for (int i = 0; i < java.length(); i++) {
            System.out.println(java.charAt(i));
        }

        char[] jav = new char[java.length()-1];
        java.getChars(0,java.length()-1, jav, 0);
        System.out.println(jav);

        byte[] javBytes = new byte[java.length()-1];
        java.getBytes(0, java.length()-1, javBytes, 0);
        System.out.println(Arrays.toString(javBytes));

        char[] javaChars = java.toCharArray();
        System.out.println(javaChars);
    }

}
