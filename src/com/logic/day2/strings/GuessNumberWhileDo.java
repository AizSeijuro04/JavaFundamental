package com.logic.day2.strings;

import java.util.Scanner;

public class GuessNumberWhileDo {
    public static void main(String[] args) {
        int number = (int) (Math.random() * 21);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess number between 0 - 20 : ");

        int guess = -1;

        while (guess != number) {
            System.out.print("Enter ur guess : ");
            guess = scanner.nextInt();

            // cek kondisi
            if (guess == number) {
                System.out.println("You Rigth. your number is " + guess);
            } else if (guess > number) {
                System.out.println("Too hight");
            } else {
                System.out.println("Too Low");
            }

        }
        scanner.close();

    }
}
