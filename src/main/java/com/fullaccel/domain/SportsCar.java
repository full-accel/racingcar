package com.fullaccel.domain;

import com.fullaccel.util.RandomUtils;

public class SportsCar implements Car {
    private final String name;
    private int position = 0;

    public SportsCar(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        if(RandomUtils.generateRandomNumber() >= 4) {
            this.position += 2;
        }
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