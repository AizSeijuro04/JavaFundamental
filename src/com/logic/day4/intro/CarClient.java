package com.logic.day4.intro;

public class CarClient {
    public static void main(String[] args) {
        Car.totalCar=4;
        System.out.println(Car.totalCar);
        System.out.println();

        Car.countCar();

        //intstance object car
        Car car = new Car();
        car.licensePlate = "D 1003 IZ";
        car.totalCar();
        
        car.totalCar(4, 250); //overloading method adalah method yg memiliki nama sama tapi beda argumen, hanya bisa dipanggil oleh object instance

        car.listMerk("Honda","CRV","HRV");
        car.listMerk("Honda");
        car.listMerk("Suzuki","Honda");

        /* Car car1= new Car();
        car1.licensePlate="D 1001 UH";
        car1.rpm=2;
        car1.speed=40;
        car1.gear=2;
        car1.fuelLevel=3;
        car1.engineTemperature=6.8;

        Car car2= new Car();
        car2.licensePlate="D 1002 UJ";
        car2.rpm=1;
        car2.speed=30;
        car2.gear=2;
        car2.fuelLevel=2;
        car2.engineTemperature=35.8;

        Car car3 = new Car();
        car3=car2;
        System.out.println(car3); */
    }
}
