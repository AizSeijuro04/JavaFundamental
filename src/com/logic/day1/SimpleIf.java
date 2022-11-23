package com.logic.day1;

import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args) {
        //odd and even number
        Scanner scanner= new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Bilangan Genap");
        }else{
            System.out.println("Bilangan Ganjil");
        }

        scanner.close();
    }
    
}
