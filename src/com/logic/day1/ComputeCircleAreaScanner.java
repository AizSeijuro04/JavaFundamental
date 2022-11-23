package com.logic.day1;

import java.util.Scanner;

public class ComputeCircleAreaScanner {

    public static void main(String[] args) {
        final double pi = 3.1459;
        // 1. declare scanner object
        Scanner scanner = new Scanner(System.in);
        // define using input
        System.out.print("Enter radius : ");
        double radius = scanner.nextDouble();
        // find circle area

        double area = radius * radius * pi;
        // display luas lingkaran
        System.out.printf("Luas lingkaran dengan radius %.0f = %.2f", radius, area);

        scanner.close();
    }
}
