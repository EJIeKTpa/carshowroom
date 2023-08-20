package ru.kk.carshowroom._main;

import ru.kk.carshowroom.entity.Car;
import ru.kk.carshowroom.service.CarService;
import ru.kk.carshowroom.service.ResultWriter;

public class _Main {
    public static void main(String[] args) {

        Car lambo = CarService.addcar("Yellow", "Lamborghini Urus");
        Car ferrari = CarService.addcar("Blue", "Ferrari Purosangue");
        Car porsche = CarService.addcar("Black", "Porsche Cayenne");
        ResultWriter.printResult(lambo);
        ResultWriter.printResult(ferrari);
        ResultWriter.printResult(porsche);
    }
}
