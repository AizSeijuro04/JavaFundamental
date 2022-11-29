package com.logic.day4.studyCase.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.logic.day4.studyCase.Car;
import com.logic.day4.studyCase.CarType;

public class CarInterfaceImp implements CarInterface{

    @Override
    public List<Car> initListCar(Car... cars) {
        List<Car> listOfCar = new ArrayList<>();

        listOfCar = Arrays.asList(cars);

        return listOfCar;
    }

    @Override
    public void printListCar(List<Car> listOfCar) {
        for (Car car : listOfCar) {
            System.out.println(car.toString());
        }
    }

    @Override
    public List<Car> findCarByType(List<Car> listOfCar, String carType) {
        List<Car> listCar = new ArrayList<>();
        for (Car car : listOfCar) {
            if (car.getType().equals(carType)) {
                listCar.add(car);
            }
        }
        return listCar;
    }

    @Override
    public Optional<Car> findCarByNomor(List<Car> listOfCar, String noPolisi) {
        Optional<Car> carResult= Optional.empty(); 
        for (Car car : listOfCar) {
            if (car.getNoPolisi().equals(noPolisi)) {
                carResult = Optional.of(car);
            }
        }
        return carResult;
    }

    @Override
    public double totalPendapatan(List<Car> listOfCar, CarType carType) {
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
