package com.ygor.cursojava.aula85_100;

import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;

public class Aula93DatasJava8 {

    public static void main(String[] args) {

        //Data
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        System.out.println(LocalDate.of(2020, 2, 3));

        System.out.println(LocalDate.parse("2019-03-04"));

        System.out.println(agora.plusDays(30));
        System.out.println(agora.minusMonths(1));

        System.out.println(agora.getDayOfWeek());
        System.out.println(agora.isLeapYear());

        //Hora
        LocalTime hAgora = LocalTime.now();
        System.out.println(hAgora);
        System.out.println(LocalTime.of(20, 18));
        System.out.println(LocalTime.parse("20:18"));

        System.out.println(hAgora.plusMinutes(50));
        System.out.println(hAgora.minusHours(100));

        //Data e hora
        LocalDateTime agoraCompleto = LocalDateTime.now();
        System.out.println(agoraCompleto);

        System.out.println(agoraCompleto.plusYears(20));
        System.out.println(LocalDateTime.of(2015, 2, 13, 10, 11, 10));

        System.out.println(LocalDateTime.parse("2019-02-15T10:13:13"));

        ZoneId fuso = ZoneId.systemDefault();
        System.out.println(fuso);

        Set<String> fusos = ZoneId.getAvailableZoneIds();
//        for (String f :
//                fusos) {
//            System.out.println(f);
//        }
        ZoneId sp = ZoneId.of("America/Sao_Paulo");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.parse("2019-02-15T10:13:13"), sp);
        System.out.println(sp);

        ZoneOffset offset = ZoneOffset.of("+02:00");
        OffsetDateTime offsetdt = OffsetDateTime.of(agoraCompleto, offset);
        System.out.println(offsetdt);

        Date date = new Date();
        Calendar c = Calendar.getInstance();

        LocalDateTime ldtDate = LocalDateTime.ofInstant(date.toInstant(),sp);
        System.out.println(ldtDate);

    }

}
