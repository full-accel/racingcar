package com.fullaccel.domain;

public class BasicCar implements Car {
    private final String name;
    private int position = 0;

    public BasicCar(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        // TODO: RandomUtils를 사용해 0~9 사이 난수 생성
        // TODO: 난수가 4 이상일 때 position을 1 증가시키는 로직 구현
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPosition() {
        return this.position;
    }
}