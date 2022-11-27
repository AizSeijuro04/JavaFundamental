package com.logic.day3.arrays;

public class SearchArray {
    public static void main(String[] args) {
        int[] myList = {1,5,3,4,5,5,10,10,12,8};
        int max = displayMax(myList);
        System.out.println("Element max : " + max);

        int indexMax = displayIndexMax(myList);
        System.out.println("IndexMax : " + indexMax);

        
        System.out.print("Sebelum di-shifting : ");
        displayArray(myList);
        System.out.println();
        System.out.print("Setelah di-shifting : ");
        displayArray(shifting(myList));
    }
    //shiftimg element
    static int[] shifting(int[] list){
        int temp = list[0];
        for (int i = 1; i < list.length; i++) {
            list[i-1] = list[i];
        }
        list[list.length-1]= temp;
        return list;
    }

    //display smalles index of the largest element
    static int displayIndexMax(int[] list){
        int indexMax=0;
        int max=list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i]>max) {
                max = list[i];
                indexMax=i;
            }
        }
        return indexMax ;
    }

    //search largest element
    static int displayMax(int[] list){
        int max = list[0];
        for (int i = 0; i < list.length; i++) {
            if (list[i]>max) {
                max = list[i];
            }
        }
        return max;
    }

    //display array
    static void displayArray(int[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] +" ");
        }
    }
}
