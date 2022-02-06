package com.ygor.cursojava.aula85_100;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class Aula96NumberFormat {

    public static void main(String[] args) throws ParseException {

        Locale en = new Locale("en", "United States");
        NumberFormat nf = NumberFormat.getInstance(en);
        String num = nf.format(10.99);
        System.out.println(num);


        Locale pt = new Locale("pt", "Brazil");
        nf = NumberFormat.getInstance(pt);
        num = nf.format(10.99);
        System.out.println(num);

        //Moeda
        NumberFormat moeda = NumberFormat.getCurrencyInstance(Locale.getDefault());
        String valor = moeda.format(100.99);
        System.out.println(valor);

        Currency currency = moeda.getCurrency();
        System.out.println(currency);

        //Porcentagem
        NumberFormat porcent = NumberFormat.getPercentInstance();
        String pct = porcent.format(99.98);
        System.out.println(pct);

        porcent.setMaximumIntegerDigits(7);
        porcent.setMinimumIntegerDigits(5);

        porcent.setMaximumFractionDigits(2);
        porcent.setMinimumFractionDigits(1);


        pct = porcent.format(99.98);
        System.out.println(pct);

        //Arredondamento
        nf = NumberFormat.getInstance();
        nf.setRoundingMode(RoundingMode.DOWN);

        nf.setMinimumFractionDigits(0);
        nf.setMinimumFractionDigits(0);

        System.out.println(nf.format(99.50000));

        Number n3 = nf.parse("100,00");
        System.out.println(n3.intValue());
    }

}
