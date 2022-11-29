package com.logic.day4.encapsulation;

public class Car {
    private String licensePlate;
    private int rpm;
    private int speed;
    private int gear;
    private int fuelLevel;
    private double engineTemperature0;

    private final int totalWheel = 4;
    private static int totalCar=0;
    
    //default constructor
    public Car() {
    }

    //argumen contructor
    public Car(String licensePlate, int speed, int fuelLevel) {
        this.licensePlate = licensePlate;
        this.speed = speed;
        this.fuelLevel = fuelLevel;
        totalCar++;
    }

    public Car(String licensePlate, int speed) {
        this.licensePlate = licensePlate;
        this.speed = speed;
        totalCar++;
    }
    
    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getEngineTemperature0() {
        return engineTemperature0;
    }

    public void setEngineTemperature0(double engineTemperature0) {
        this.engineTemperature0 = engineTemperature0;
    }

    public int getTotalWheel() {
        return totalWheel;
    }

    public static int getTotalCar() {
        return totalCar;
    }

    public static void setTotalCar(int totalCar) {
        Car.totalCar = totalCar;
    }
    

    
}


