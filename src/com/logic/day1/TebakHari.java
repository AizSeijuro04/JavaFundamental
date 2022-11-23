package com.logic.day1;

import java.util.Scanner;

public class TebakHari {
    public static void main(String[] args) {
        // tebak hari with switc case

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number between 1-7 : ");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Minggu");
                break;
            case 2:
                System.out.println("Senin");
                break;
            case 3:
                System.out.println("Selasa");
                break;
            case 4:
                System.out.println("Rabu");
                break;
            case 5:
                System.out.println("Kamis");
                break;
            case 6:
                System.out.println("Jumat");
                break;
            case 7:
                System.out.println("Sabtu");
                break;
            default:
            System.out.println("invalid Day");
                break;
        }
        scanner.close();
    }
}
