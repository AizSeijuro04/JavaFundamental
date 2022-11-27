package com.logic.day3.matrix;

public class StudentExam {
    /**
     * program menampilkan jawaban yang benar dari 8 siswa
     */
    public static void main(String[] args) {
        // deklarasi variable jawaban berupa matriks untuk hold data jawaban siswa
        char[][] jawaban = {
                { 'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D' },
                { 'E', 'D', 'D', 'A', 'D', 'B', 'E', 'E', 'A', 'D' },
                { 'C', 'B', 'A', 'E', 'C', 'C', 'E', 'E', 'A', 'D' },
                { 'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D' },
                { 'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D' }
        };
        char[] kunci = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D' };

        // poin untuk nilai
        for (int i = 0; i < jawaban.length; i++) {
            // hold correct answer
            int correctCount = 0;
            for (int j = 0; j < jawaban[i].length; j++) {
                if (jawaban[i][j] == kunci[j]) {
                    correctCount++;
                }
            }
            System.out.println("Jawaban Siswa "+(i + 1)+" yang benar : " + correctCount);
        }
    }
}
