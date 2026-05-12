package com.fullaccel.view;

import com.fullaccel.domain.Car;
import java.util.List;

public class OutputView {
    public void printRoundResult(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.println();
    }

    public void printWinners(List<String> winners) {
        String result = String.join(", ", winners);
        System.out.println("최종 우승자: " + result);
    }
}