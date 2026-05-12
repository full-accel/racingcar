package com.fullaccel.domain;

import com.fullaccel.util.RandomUtils;

public class Truck implements Car {
    private final String name;
    private int position = 0;

    public Truck(String name) {
        this.name = name;
    }

    @Override
    public void move() {
        if (RandomUtils.generateRandomNumber() >= 5) {
            this.position ++;
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