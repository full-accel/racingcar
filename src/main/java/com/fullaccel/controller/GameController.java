package com.fullaccel.controller;

import com.fullaccel.domain.*;
import com.fullaccel.util.Validator;
import com.fullaccel.view.InputView;
import com.fullaccel.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public void run() {
        Cars cars = getValidCars();
        int tryCount = getValidTryCount();

        System.out.println("\n실행 결과");
        for (int i = 0; i < tryCount; i++) {
            cars.moveAll();
            outputView.printRoundResult(cars.getCarList());
        }
        outputView.printWinners(cars.getWinners());
    }

    private Cars getValidCars() {
        try {
            return new Cars(parseCars(inputView.readCarInfo()));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getValidCars();
        }
    }

    private int getValidTryCount() {
        try {
            return inputView.readTryCount();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return getValidTryCount();
        }
    }

        private List<Car> parseCars(String input) {
            List<Car> carList = new ArrayList<>();
            String[] pairs = input.split(",");
            for (String pair : pairs) {
                String[] details = pair.trim().split(":");
                String name = details[0];
                String type = details[1];

                Validator.validCarName(name);

                if (type.equalsIgnoreCase("SportsCar")) carList.add(new SportsCar(name));
                else if (type.equalsIgnoreCase("Truck")) carList.add(new Truck(name));
                else carList.add(new BasicCar(name));
            }
            return carList;
        }
    }