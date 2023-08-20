package ru.kk.carshowroom.service;

import ru.kk.carshowroom.entity.Car;

public class CarService {
    public static Car addcar(String color, String model) {
        Car newcar = new Car(color, model);
        return newcar;
    }
}