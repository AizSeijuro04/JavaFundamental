package com.logic.day3.arrays;

public class CopyArray {
    /**
     3 ways to copy array
     */
    public static void main(String[] args) {
        //1. ubah refference variable
        int[] list1 = {1,2,3,4,5};
        int[] list2 = {5,4,3,2,1};
        //list2 = list1;
        //displayArray(list2);

        //2. gunakan iterasi
        int[] list3 = new int [list1.length];
        for (int i = 0; i < list1.length; i++) {
            list3[i]=list1[i];
        }
        //displayArray(list3);

        //3. system array copy
        int[] list4 = new int [list2.length];
        System.arraycopy(list2, 0, list4, 0, 3);
        displayArray(list4);
    }

    static void displayArray(int[] list){
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] +" ");
        }
    }
}
