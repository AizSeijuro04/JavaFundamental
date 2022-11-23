package com.logic.day1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class SimpleLocalDateTime {
    public static void main(String[] args) {
        // use location & localdatetime

        Scanner scanner = new Scanner(System.in);
        LocalDate nowDate = LocalDate.now();
        LocalDate myDate = LocalDate.of(2020, 5, 12);

        System.out.println("current date: " + nowDate);
        System.out.println("my date : " + myDate);

        // using scanner
        System.out.print("Input Date : ");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();
        LocalDate scanDate = LocalDate.of(year, month, day);
        System.out.println("scan date: " + scanDate);

        // cari selisih between date
        LocalDate starDate = LocalDate.of(1995, 8, 6);
        LocalDate endDate = LocalDate.now();

        long years = ChronoUnit.YEARS.between(starDate, endDate);
        System.out.println("years between: " + years);

        long months = ChronoUnit.MONTHS.between(starDate, endDate);
        System.out.println("months between: " + months);

        long days = ChronoUnit.DAYS.between(starDate, endDate);
        System.out.println("days between: " + days);


        //local date time 
        LocalDateTime starTime = LocalDateTime.of(2020, 2, 28, 8, 30, 35);
        LocalDateTime endTime = LocalDateTime.of(2020, 2, 28, 12, 30,35);

        long hours = ChronoUnit.HOURS.between(starTime, endTime);
        System.out.println("hours between : "+ hours);

        long minutes = ChronoUnit.MINUTES.between(starTime, endTime);
        System.out.println("hours between : "+ minutes);

        long seconds = ChronoUnit.SECONDS.between(starTime, endTime);
        System.out.println("hours between : "+ seconds);

        long millis = ChronoUnit.MILLIS.between(starTime, endTime);
        System.out.println("hours between : "+ millis);

        long nanos = ChronoUnit.NANOS.between(starTime, endTime);
        System.out.println("hours between : "+ nanos);

        scanner.close();

    }
}
