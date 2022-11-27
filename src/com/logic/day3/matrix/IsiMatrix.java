package com.logic.day3.matrix;

public class IsiMatrix {
    public static void main(String[] args) {
        //declare variable 
        int[][] matrix = new int[5][5];
        int counter = 1;
        int sum = 0;

        //matrix with sum
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i==j) {
                    sum = sum+counter;
                    matrix[i][j]=counter++;
                }
                if (j>i) {
                    matrix[i][j]=10;
                }
                if (j<i) {
                    matrix[i][j]=20;
                }
            }
        }
        System.out.println("Total Sum : "+ sum);
        
        //matrix diagonal
        /* for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i==j) {
                    matrix[i][j]=counter++;
                }
                if (j>i) {
                    matrix[i][j]=10;
                }
                if (j<i) {
                    matrix[i][j]=20;
                }
            }
        } */

        //matrix diagonal2
        /* for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i==j) {
                    matrix[i][j]=counter--;
                }
                if (j>i) {
                    matrix[i][j]=20;
                }
                if (j<i) {
                    matrix[i][j]=10;
                }
            }
        } */
        
        /* for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = i+j;
            }
        } */
        
        //fill with counter
        /* for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = counter++;
            }
        } */

        //call method displayArray
        displayArray(matrix);
    }

    //method display matrix
    static void displayArray(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
