package com.logic.day1;

import java.util.Scanner;

public class GuestNumberSubstract {
    public static void main(String[] args) {
        // buat program tebak hasil pengurangan angka1 - angka2

        Scanner scanner = new Scanner(System.in);
        //2 random number
        int angka1 = (int)(Math.random() * 10);
        int angka2 = (int)(Math.random() * 10);
        
        // cek kondisi 
        if (angka1<angka2) {
            int temp = angka1;
            angka1 = angka2;
            angka2 = temp;
        }
        //display output
        System.out.println("Berapa " + angka1 + "-" + angka2+ "?");
        System.out.print("jawab : ");
        int hasil = scanner.nextInt();
        //cek 
        if (angka1 - angka2 == hasil) {
            System.out.println("Anda Benar");
        }
        else{
            System.out.println("Anda Salah");
        }
        scanner.close();
    }
}
