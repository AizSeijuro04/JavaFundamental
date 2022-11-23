package com.logic.day1;

public class ComputeCircleArea {
    public static void main(String[] args) {
        // kasus hitung luas lingkaran, luas lingkaran = radius^2 * pi
        final double pi = 3.1459;
        // 1. declare variable radius & area
        double radius = 10, area;
        // 2. find circle area and save to variable area
        area = radius * radius * pi;
        // 3. display area
        System.out.println("Luas lingkaran = " + area);
        System.out.printf("Luas lingkaran = %.2f", area);
    }

}
