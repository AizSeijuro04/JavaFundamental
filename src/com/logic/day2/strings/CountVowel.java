package com.logic.day2.strings;

import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //deklasrasi variabel
        int countVow=0,countCon =0;
        String s;
        System.out.print("Enter a string : ");
        s = scanner.nextLine();
        //loop
        for (int i = 0; i < s.length(); i++) {
            char ch = s.toUpperCase().charAt(i);
            if (ch =='A'|| ch=='I' || ch=='E' ||ch=='U' ||ch == 'O') {
                countVow++;                
            }
            else if(ch>='A' && ch<='Z'){
                countCon++;
            } 
        }

        System.out.println("Total Vowel : " + countVow);
        System.out.print("Total Konsonan : " + countCon);

        scanner.close();

    }
}
