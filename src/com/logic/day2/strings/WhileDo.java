package com.logic.day2.strings;

public class WhileDo {
    public static void main(String[] args) {
        int count= 0;
        while (count < 10) {
            System.out.println(count + " Welcome to Java");
            count++;
        }

        do {
            System.out.println(count + " Welcome To C++");
            count++;
        } while (count <20);
    }
}
