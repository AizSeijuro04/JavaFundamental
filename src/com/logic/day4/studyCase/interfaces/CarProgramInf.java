package com.logic.day4.studyCase.interfaces;

import java.util.List;
import java.util.Scanner;

import com.logic.day4.studyCase.Car;
import com.logic.day4.studyCase.CarType;
import com.logic.day4.studyCase.Suv;

public class CarProgramInf {
    public static void main(String[] args) {
        // create object cuv
        Suv suv1 = new Suv("D 1001 AA", 2022, 500000d, 100000d);
        Suv suv2 = new Suv("D 1002 BB", 2017, 500000d, 100000d);
        Suv suv3 = new Suv("D 1003 CC", 2021, 500000d, 100000d);

        // call interface
        CarInterface carInterface = new CarInterfaceImp();
        List<Car> listOfCar = carInterface.initListCar(suv1, suv2, suv3);
        carInterface.printListCar(listOfCar);

        // create menu program
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Enter menu number : ");
            System.out.println("1. Print list car ");
            System.out.println("2. Find Car by Type ");
            System.out.println("3. Total Pembayaran");

            int menu = scanner.nextInt();

            switch (menu) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    carInterface.printListCar(listOfCar);
                    break;
                case 2:
                    System.out.println("Enter Car Type : ");
                    String carType = scanner.next();
                    List<Car> listCarByType = carInterface.findCarByType(listOfCar, carType);
                    carInterface.printListCar(listCarByType);
                    break;
                case 3:
                    double total = carInterface.totalPendapatan(listOfCar, CarType.ALL_CAR);
                    System.out.println("Total Pendapatan : " + total);
                    break;
                default:
                    System.out.println("Wrong Number");
                    break;
            }
        }
        scanner.close();

    }
}
