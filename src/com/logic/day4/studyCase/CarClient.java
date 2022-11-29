package com.logic.day4.studyCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CarClient {
    // 1. inisialisasi object car kedalam listCar>
    public List<Car> initListCar(Car... cars) {
        List<Car> listOfCar = new ArrayList<>();

        listOfCar = Arrays.asList(cars);

        return listOfCar;
    }

    // 2. cetak object car
    public void printListCar(List<Car> listOfCar) {
        for (Car car : listOfCar) {
            System.out.println(car.toString());
        }
        /*
         * for (int i = 0; i < listOfCar.size(); i++) {
         * Car car = listOfCar.get(i);
         * System.out.println(car.toString());
         * }
         */
    }

    // 3. search list of car with type car
    public List<Car> findCarByType(List<Car> listOfCar, String carType) {
        List<Car> listCar = new ArrayList<>();
        for (Car car : listOfCar) {
            if (car.getType().equals(carType)) {
                listCar.add(car);
            }
        }
        return listCar;
    }

    // 4. Search object car and return with java util optional
    public Optional<Car> findCarByNomor(List<Car> listOfCar,String noPolisi){
        Optional<Car> carResult= Optional.empty(); 
        for (Car car : listOfCar) {
            if (car.getNoPolisi().equals(noPolisi)) {
                carResult = Optional.of(car);
            }
        }
        return carResult;        
    }

    // 5. getTotal pendapatan dari mobil juragan yg beroperasi
    public double totalPendapatan(List<Car> listOfCar,CarType carType){
        double total = 0;
        for (Car car : listOfCar) {
            if (carType == CarType.ALL_CAR) {
                total += car.getTotalPendapatan();
            }
            else{
                if (car.getType().equals(carType.toString())) {
                    total += car.getTotalPendapatan();
                }
            }
        }
        return total;
    }
}
