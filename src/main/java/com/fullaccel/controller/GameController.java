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
        // TODO: 1. InputView로 자동차 정보 입력받기
        String input = inputView.readCarInfo();
        int tryCount = inputView.readTryCount();

        // TODO: 2. 입력받은 문자열을 파싱하여 차종에 맞는 객체(BasicCar, SportsCar 등) 생성 후 Cars에 리스트로 담기
        Cars cars = new Cars(parseCars(input));
        // TODO: 3. InputView로 시도 횟수 입력받기
        System.out.println("\n실행 결과");
        for (int i = 0; i < tryCount; i++) {
            cars.moveAll();
            outputView.printRoundResult(cars.getCarList());
        }
        // TODO: 4. 시도 횟수만큼 반복하며 Cars.moveAll() 호출 및 OutputView.printRoundResult() 호출
        outputView.printWinners(cars.getWinners());
    }
        // TODO: 5. 루프 종료 후 Cars.getWinners() 호출하여 결과 리스트 받기

        // TODO: 6. OutputView.printWinners()로 최종 우승자 출력
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