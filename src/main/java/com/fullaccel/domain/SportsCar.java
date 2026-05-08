package com.fullaccel.domain;

public class SportsCar implements Car {
    private final String name;
    private int position = 0;

    public SportsCar(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        // TODO: RandomUtils를 사용해 난수 생성
        // TODO: 난수가 4 이상일 때 position을 2 증가시키는 로직 구현
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