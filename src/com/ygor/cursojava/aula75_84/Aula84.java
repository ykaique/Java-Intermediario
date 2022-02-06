package com.ygor.cursojava.aula75_84;

import java.util.StringTokenizer;

public class Aula84 {

    public static void main(String[] args) {

        String arq = "1;Antonio;30;";
        StringTokenizer st = new StringTokenizer(arq, ";");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

}
