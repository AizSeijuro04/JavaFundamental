package com.logic.day2.method;

/*
 input : aku suka java
 output : a*u s**a j**a 
 */

/**
 * StarBetweenChar
 */
public class StarBetweenChar {

    public static void main(String[] args) {
        String out = convertToStar("aku suka java goreng");
        System.out.println(out);
    }

    public static String convertToStar(String s) {
        String joinCutWord = "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isSpaceChar(s.charAt(i)) || i == s.length() - 1) {
                if (i == s.length() - 1)
                    end = i + 1;
                else
                    end = i;

                String cutWord = s.substring(start, end);
                start = end + 1;

                String word = "";
                char ch;
                for (int j = 0; j < cutWord.length(); j++) {
                    ch = cutWord.charAt(j);
                    if (j == 0 || j == cutWord.length() - 1) {
                        word = word + ch;
                    } else if (j > 0 && j < cutWord.length() - 1) {
                        word = word + "*";
                    }
                }
                joinCutWord = joinCutWord + " " + word;
            }
        }

        return joinCutWord;
    }

}