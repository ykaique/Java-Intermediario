package com.ygor.cursojava.aula57_58;

public class TesteWrapperAutoboxing {

    public static void main(String[] args) {

        Integer num = Integer.valueOf(52);
        num = Integer.parseInt("51");
        //AutoBoxing
        Integer n1 = 1;
        //Unboxing
        int n2 = n1;


        //Mau uso
        Double a, b, c;
        a = 10d;
        b = 1.1d;
        c = 13.3d;

        Double media = (a + b + c) / 3;
        System.out.println(media);

    }

}
