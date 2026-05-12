package com.fullaccel;

import com.fullaccel.controller.GameController;
import com.fullaccel.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        GameController gameController = new GameController();
        gameController.run();
    }
}