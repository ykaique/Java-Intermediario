package com.ygor.cursojava.aula85_100;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        System.out.println(locale);

        Locale[] locales = Locale.getAvailableLocales();
        for (Locale l :
                locales) {
            System.out.println("Nome: " + l.getDisplayName());
            System.out.println("Codigo da lingua: " + l.getLanguage());
            System.out.println("Lingua: " + l.getDisplayLanguage());
            System.out.println("Cod Pais: " + l.getCountry());
            System.out.println("Pais: " + l.getDisplayCountry());
            System.out.println("**************************************");
        }
        Locale br = new Locale("pt", "Brazil");
        System.out.println(br);
        Locale.setDefault(br);

        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(nf.format(50000000d));
    }

}
