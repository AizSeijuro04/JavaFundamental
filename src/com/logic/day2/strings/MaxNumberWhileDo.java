package com.logic.day2.strings;

import java.util.Scanner;

public class MaxNumberWhileDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, max;
        System.out.print(" Enter Integer 0 for exit : ");
        number = scanner.nextInt();
        max = number;

        while (number != 0) {
            System.out.print(" Enter Integer 0 for exit : ");
            number = scanner.nextInt();
            if (number>max) {
                max = number;
            }
        }
        System.out.println("Angka max : " + max);

        scanner.close();
    }
}
