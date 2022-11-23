package com.logic.day1;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        // find grade if 90>=A,80>=B,70>=C,60>=D,

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        int score = scanner.nextInt();

        if (score >= 90) {
            System.out.println("Nilai A");
        } else if (score >= 80) {
            System.out.println("Nilai B");
        } else if (score >= 70) {
            System.out.println("Nilai C");
        } else if (score >= 60) {
            System.out.println("Nilai D");
        } else {
            System.out.println("Nilai F");
        }

        scanner.close();
    }
}
