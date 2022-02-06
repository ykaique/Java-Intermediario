package com.ygor.cursojava.aula85_100;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {

    public static void main(String[] args) {

        Calendar calendar = Calendar.getInstance();
        TimeZone timeZone = calendar.getTimeZone();
        System.out.println(timeZone);

//        String[] fusos = TimeZone.getAvailableIDs();
//        for (String fuso :
//                fusos) {
//            System.out.println(fuso);
//        }

        TimeZone timeZoneSP = TimeZone.getTimeZone("America/Sao_Paulo");
        System.out.println(timeZoneSP.getDisplayName());
        System.out.println(timeZoneSP.getID());

        Calendar agora = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss a z");
        System.out.println(sdf.format(agora.getTime()));

        Calendar agoraSP = Calendar.getInstance(timeZoneSP);
        System.out.println(sdf.format(agoraSP.getTime()));

        agoraSP.add(Calendar.HOUR_OF_DAY, timeZoneSP.getOffset(System.currentTimeMillis()) / 1000 / 60 / 60 *-1);
        System.out.println(sdf.format(agoraSP.getTime()));
    }

}
