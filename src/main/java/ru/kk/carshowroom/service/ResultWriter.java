package ru.kk.carshowroom.service;

import ru.kk.carshowroom.entity.Car;

public class ResultWriter {
    public static void printResult(Car car) {
        System.out.println(car.color + " " + car.model + " drive.");
        System.out.println(car.color + " " + car.model + " stop.");
    }
}
