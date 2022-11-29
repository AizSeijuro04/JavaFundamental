package com.logic.day4.intro;

public class Car {
    String licensePlate;
    int rpm;
    int speed;
    int gear;
    int fuelLevel;
    double engineTemperature0;

    static int totalCar=0;

    //static method
    public static void countCar(){
        totalCar++;
        
        System.out.println("Total Car : "+totalCar);
    }

    //instance method
    public void totalCar(){
        totalCar++;
        speed = 200;
        System.out.println("Total Car : "+totalCar);
        System.out.println("Speed of car = "+speed);
    }

    //overloading method
    public void totalCar(int x,int s){
        totalCar+=x;
        speed = s;
        System.out.println("Total Car : "+totalCar);
        System.out.println("Speed of car = "+speed);
    }

    //varags method
    public void listMerk(String...merks){
        for (int i = 0; i < merks.length; i++) {
            System.out.println("Merks "+merks[i]);
        }
    }
}


