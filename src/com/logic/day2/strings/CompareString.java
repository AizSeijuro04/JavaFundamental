package com.logic.day2.strings;

import java.util.Scanner;

public class CompareString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompt the user to enter 2 city
        System.out.print("Enter first city : ");
        String city1 = scanner.nextLine();
        System.out.print("Enter second city : ");
        String city2 = scanner.nextLine();

        if (city1.compareTo(city2)<0) {
            System.out.println("The cities in alphabetical order are "+ city1 +" "+city2);
        }
        else{
            System.out.println("The cities in alphabetical order are "+ city2 +" "+city1);
        }

        String s1 = "Welcome to Java";
        String s2 = "Welcome to Java";
        String s3 = "Welcome to C++";

        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//false

        scanner.close();
        
    }
}
