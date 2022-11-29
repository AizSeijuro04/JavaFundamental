package com.logic.day4.encapsulation;

public class CarClient {
    public static void main(String[] args) {
        //default constructor
        Car car = new Car();
        car.setLicensePlate("D 0006 AH");
        System.out.println(car.getLicensePlate());
        car.setSpeed(250);
        System.out.println(car.getSpeed());
        System.out.println();

        Car car1 = new Car("D 1002", 250);

        Car car2 = new Car("D 1003", 150, 3);

        System.out.println("Total Car = "+Car.getTotalCar());

        
    }
}
