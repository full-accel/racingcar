package com.fullaccel.util;

import java.util.Random;

public class RandomUtils {
    private static final Random random = new Random();
    public static int generateRandomNumber() {
            return random.nextInt(10);
        }
}