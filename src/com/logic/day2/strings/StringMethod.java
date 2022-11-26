package com.logic.day2.strings;

public class StringMethod {
    public static void main(String[] args) {
        String s = "aku suka java";
        System.out.println("Length s : " + s.length());


        //chartArt
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(5));

        //substring
        String scut = s.substring(4, 8);
        System.out.println(scut);

        String concat = s + "One Piece";
        System.out.println("concat : "+concat);

        //upperCase and lowerCase
        String upperCase = s.toUpperCase();
        System.out.println(upperCase);

        String lowerCase = s.toLowerCase();
        System.out.println(lowerCase);

        //format 
        String str = "18";
        String str2 = String.format("%4s", str).replace(' ', '0');
        System.out.println(str2);

        //replace
        String d,e;
        d="i am newbie in C++. C++ rocks!";
        e=d.replace("C++", "Java");
        System.out.println(e);
    }
}
