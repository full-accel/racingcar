package com.fullaccel.view;

import com.fullaccel.util.Validator;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);
    public String readCarInfo() {
        System.out.println("자동차 이름과 차종을 입력하세요 (예: pobi:SportsCar, woni:Truck, jun:Basic)");
        return scanner.nextLine();
    }

    public int readTryCount() {
        System.out.println("시도할 횟수는 몇 회인가요?");
        String input = scanner.nextLine();
        Validator.validTryCount(input);
        return Integer.parseInt(input);
    }
}