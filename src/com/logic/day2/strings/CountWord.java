package com.logic.day2.strings;

import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1.deklarasi variable
        int countWord = 0;
        String kata;

        System.out.print("Masukan kalimat : ");
        kata = scanner.nextLine();

        // 2.loop sepanjang kalimat aku suka java
        for (int i = 0; i < kata.length(); i++) {
            // 2.1 check spasi antar kata gunakan object Character.isSpaceChar
            if (Character.isSpaceChar(kata.charAt(i)) || i ==kata.length() - 1) {
                countWord++;
            }
        }
        System.out.println("Total kata : " + countWord);

        scanner.close();
    }
}
