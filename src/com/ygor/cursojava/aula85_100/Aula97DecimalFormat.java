package com.ygor.cursojava.aula85_100;

import java.text.DateFormatSymbols;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Aula97DecimalFormat {

    public static void main(String[] args) {

        String padrao = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao);
        System.out.println(df.format(31212321.21));

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.getDefault());

        String padrao2 = "###,###.##";


        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');

        df = new DecimalFormat(padrao2, dfs);
        System.out.println(df.format(12312342.123));

    }

}
