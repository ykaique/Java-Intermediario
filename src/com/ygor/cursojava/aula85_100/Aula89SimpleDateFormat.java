package com.ygor.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Aula89SimpleDateFormat {

    private static Date minhaDataEmDate;

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Calendar hoje = Calendar.getInstance();
        System.out.println(sdf.format(hoje.getTime()));

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
        String minhaData = "20/02/2000";
        try {
            minhaDataEmDate = sdf2.parse(minhaData);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(sdf2.format(minhaDataEmDate));
    }

}
