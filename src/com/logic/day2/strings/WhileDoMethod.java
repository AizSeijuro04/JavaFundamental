package com.logic.day2.strings;

public class WhileDoMethod {
    public static void main(String[] args) {
        sayHello(3, "Wellcome To Java Programming Language");

        System.out.println(countWord("Aku suka java"));

        int total = countWord("saya cinta java dan oop");
        System.out.println("Total Kata : " + total);
    }

    
    public static void sayHello(int loop,String s){
        int count = 0;
        while (count<loop) {
            System.out.println(s);
            count++;
        }
    }

    public static int countWord(String s){
        int countWord = 0;
        for (int i = 0; i < s.length(); i++) {
            // 2.1 check spasi antar kata gunakan object Character.isSpaceChar
            if (Character.isSpaceChar(s.charAt(i)) || i ==s.length() - 1) {
                countWord++;
            }
        }
        return countWord;
    }
}
