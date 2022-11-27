package com.logic.day3.arrays;

public class ParameterMethod {
    public static void main(String[] args) {
        int[] myList = {1,2,3,4,5,6};

        displayArray(myList);

        }

    static void displayArray(int[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] +" ");
        }
    }
}
