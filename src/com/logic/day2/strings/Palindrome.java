package com.logic.day2.strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat : ");
        String s = scanner.nextLine();
        int n = s.length();
        boolean isPalindrome = true;

        for (int i = 0; i < n/2; i++) {
            if (s.toUpperCase().charAt(i) != s.toUpperCase().charAt(n-1-i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome == true) {
            System.out.println("Kalimat ini palindrome ");
        }
        else{
            System.out.println("Kalimat ini bukan palindrome ");
        }

        scanner.close();
    }
}
