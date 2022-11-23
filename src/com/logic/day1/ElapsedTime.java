package com.logic.day1;

import java.util.Scanner;

public class ElapsedTime {
    public static void main(String[] args) {
        // konversi jumlah bilangan integer ke hari, jam, menit dan second
        // dimana inputan integer harus lebih dari 1.000.000
        // contoh : input : 1.000.000, output =>11 hari 13 jam 46 menit dan 40 detik
        // tips : use/(pembagi) & %(sisa hasil bagi)

        Scanner scanner = new Scanner(System.in);
        // 1.deklarasikan variable
        int number, sisa;
        int hari, jam, menit, detik;
        // 2.simpan inputan detik di varible number
        System.out.print("Enter number: ");
        number = scanner.nextInt();

        // 3.hitung jumlah hari,1 hari = 24 jam,1 jam= 60menit, 1menit = 60detik
        // simpan sisa
        hari = number / 86400;
        sisa = number % 86400;

        // 4.hitung jumlah jam,dihitung dari sisa hasil bagi step3 dibagi 3600
        jam = sisa / 3600;
        sisa = sisa % 600;

        // 5.hitung jumlah menit, dihitung dari sisa hasil bagi step4 dibagi 60
        menit = sisa / 60;

        // 6.hitung jumlah detik, dihitung dari sisa hasil bagi step 5
        detik = sisa % 60;

        // 7.display output
        System.out.println(hari + " hari" + jam + " jam " + menit + " menit" + detik + "detik");

        scanner.close();
    }
}
