package com.logic.day2.strings;

public class ForLoopTriangel {
    public static void main(String[] args) {
        int n = 5;

        // buat kotak
        for (int i = 0; i < n; i++) {
            // cetak colom
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // segitiga ◺
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("* ");
        }

        // segitiga ◿
        for (int i = 0; i < n; i++) {
            // cetak baris spasi ke kanan
            for (int j = 0; j < n-i; j++) {
                System.out.print("  ");
            }
            // cetak bintang index i
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        //segitiga ◸

        //segitiga ◹
    }
}
