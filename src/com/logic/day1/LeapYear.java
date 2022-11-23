package com.logic.day1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // masukkan bilangan integer tahun, lalu cek apakah tahun kabisat atau bukan 

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a year : ");
        int year = scanner.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Tahun " + year + " adalah kabisat" );
        }
        else{
            System.out.println("Tahun " + year + " bukan kabisat");
        }

        scanner.close();
    }
}
