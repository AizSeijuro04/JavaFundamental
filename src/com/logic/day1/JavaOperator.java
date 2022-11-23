package com.logic.day1;

public class JavaOperator {
    public static void main(String[] args) {
        // arithmatic operator
        int x = 5, y = 3, z = 2;
        double a = (x + y) / z;
        double b = x + y / z;
        double c = x + (y * 2) / z;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // asignment operator
        x += 5;// x= x+5;
        System.out.println("x+= " + x);

        y -= 1;
        System.out.println("y-= " + y);

        z *= 5;
        System.out.println("z*= " + z);

        z /= 5;
        System.out.println("z/= " + z);

        z %= 5;
        System.out.println("z%= " + z);

        // increment document
        int d = 1;
        d++;
        System.out.println("d++= " + d);
        d--;
        System.out.println("d--= " + d);

    }

}
