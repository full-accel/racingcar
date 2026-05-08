package com.fullaccel.domain;

import java.util.List;

public class Cars {
    private final List<Car> carList;

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public void moveAll() {
        // TODO: carList를 순회하며 모든 Car 객체의 move() 호출
    }

    public List<String> getWinners() {
        // TODO: carList에서 position이 가장 높은 자동차의 이름을 찾아 리스트로 반환
        return null;
    }

    public List<Car> getCarList() {
        return carList;
    }
}