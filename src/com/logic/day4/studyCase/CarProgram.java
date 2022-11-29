package com.logic.day4.studyCase;

import java.util.List;
import java.util.Optional;

public class CarProgram {
    public static void main(String[] args) {
        // create object suv
        Suv suv1 = new Suv("D 1001 AA", 2022, 500000d, 100000d);
        Suv suv2 = new Suv("D 1002 BB", 2017, 500000d, 100000d);
        Suv suv3 = new Suv("D 1003 CC", 2021, 500000d, 100000d);

        // create object taxi
        Taxi taxi1 = new Taxi("D 88 UK", 2018, 5, 45000d, 40, 10000);
        Taxi taxi2 = new Taxi("D 87 UK", 2018, 10, 45000d, 100, 10000);

        // create object Angkot
        Angkot angkot1 = new Angkot("D 55 UJ", 2016, 4500d, 35);
        Angkot angkot2 = new Angkot("D 55 UJ", 2015, 4500d, 40);

        // create object carClient
        CarClient carClient = new CarClient();

        // contoh polymorphisn dimana object suv/taxi/angkot diubah tipe objectnya
        List<Car> listOfCar = carClient.initListCar(suv1, suv2, suv3,
                taxi1, taxi2, angkot1, angkot2);

        // call method printListCar
        carClient.printListCar(listOfCar);

        // call method findCarByType
        List<Car> listCarByType = carClient.findCarByType(listOfCar, "SUV");
        /* carClient.printListCar(listCarByType); */

        // call method total pendapatan
        /*
         * double totalAllCar = carClient.totalPendapatan(listOfCar, CarType.ALL_CAR);
         * System.out.println("Total Pendapatan = "+totalAllCar);
         * 
         * double totalSuv = carClient.totalPendapatan(listOfCar, CarType.SUV);
         * System.out.println("Total Pendapan SUV = "+totalSuv);
         * 
         * double totalAngkot = carClient.totalPendapatan(listOfCar, CarType.ANGKOT);
         * System.out.println("Total Pendapan ANGKOT = "+totalAngkot);
         * 
         * double totalTaxi = carClient.totalPendapatan(listOfCar, CarType.TAXI);
         * System.out.println("Total Pendapan TAXI = "+totalTaxi);
         */

         // call method findCarByNUmber
        Optional<Car> suvCar = carClient.findCarByNomor(listOfCar, "D 88 UK");
        /* System.out.println(suvCar.get().toString()); */

        // 1. poltmorphism downcast
        Suv suvDC = (Suv)(suvCar.get());
        suvDC.getBiayaSupir();

        // 2. poltmorphism upcast
        Car carUC =suvDC;

        System.out.println();
    }
}
