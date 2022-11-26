package com.logic.day2.strings;

import java.util.Scanner;

public class MaxNumberDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, max = 0;
        do {
            System.out.print(" Enter Integer 0 for exit : ");
            number = scanner.nextInt();
            if (number > max) {
                max = number;
            }
        } while (number != 0);
        System.out.println("Angka max : " + max);

        scanner.close();
    }
}
