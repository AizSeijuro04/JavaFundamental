package com.logic.day3.arrays;

public class ArrayInit {
    public static void main(String[] args) {
        int[] list  = new int[3];
        //isi kotak array
        list[0]=5;
        list[1]=10;
        list[2]=3;

        //display
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+ " ");
        }

        String[] myString = {"java","cool","best"};
        for (int i = 0; i < myString.length; i++) {
            System.out.print(myString[i] + " ");
        }
    }
}
