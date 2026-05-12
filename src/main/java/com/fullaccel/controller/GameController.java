package com.fullaccel.controller;

import com.fullaccel.domain.*;
import com.fullaccel.view.InputView;
import com.fullaccel.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class GameController {
    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    public void run() {
        String input = inputView.readCarInfo();
        int tryCount = inputView.readTryCount();

        Cars cars = new Cars(parseCars(input));
        System.out.println("\n실행 결과");
        for (int i = 0; i < tryCount; i++) {
            cars.moveAll();
            outputView.printRoundResult(cars.getCarList());
        }
        outputView.printWinners(cars.getWinners());
    }

        private List<Car> parseCars(String input) {
            List<Car> carList = new ArrayList<>();
            String[] pairs = input.split(",");
            for (String pair : pairs) {
                String[] details = pair.trim().split(":");
                String name = details[0];
                String type = details[1];

                if (type.equalsIgnoreCase("SportsCar")) carList.add(new SportsCar(name));
                else if (type.equalsIgnoreCase("Truck")) carList.add(new Truck(name));
                else carList.add(new BasicCar(name));
            }
            return carList;
        }
    }