package com.logic.day3.matrix;

public class MatrixInit {
    public static void main(String[] args) {
        int[][] list = new int[3][2];
        
        //init array matriks
        list[0][0]=8;
        list[0][1]=4;
        list[1][0]=3;
        list[1][1]=12;
        list[2][0]=7;
        list[2][1]=10;

        //display array
        displayArray(list);

        int[][] list2 ={
            {0,1,2},
            {3,4,5},
            {6,7,8},
        };
        System.out.println("--------------------");
        displayArray(list2);
        int[][] list3 ={
            {0,1,2},
            {3,4},
            {6}
        };
        System.out.println("----------------------");
        displayArray(list3);

    }
    static void displayArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
