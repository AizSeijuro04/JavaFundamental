package com.logic.day4.studyCase.interfaces;

import java.util.List;
import java.util.Optional;

import com.logic.day4.studyCase.Car;
import com.logic.day4.studyCase.CarType;

public interface CarInterface {
    public List<Car> initListCar(Car... cars); 

    public void printListCar(List<Car> listOfCar);

    public List<Car> findCarByType(List<Car> listOfCar, String carType);

    public Optional<Car> findCarByNomor(List<Car> listOfCar,String noPolisi);

    public double totalPendapatan(List<Car> listOfCar,CarType carType);
}
