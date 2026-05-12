package com.fullaccel.util;

public class Validator {
    private static final int MAX_NAME_LENGTH = 5;

    public static void validCarName(String names) {
            if(names.length() > MAX_NAME_LENGTH) {
                throw new IllegalArgumentException("플레이어 이름은 5자 이하만 가능합니다." + names);
            }
            if (names.isBlank()) {
                throw new IllegalArgumentException("플레이어 이름은 공백일 수 없습니다.");
            }
    }
    public static void validTryCount(String input) {
        try{
            int count = Integer.parseInt(input);
            if(count <= 0) {
                throw new IllegalArgumentException("시도 횟수는 1회 이상이어야 합니다.");
            }
        }catch(NumberFormatException e) {
            throw new IllegalArgumentException("시도 횟수는 숫자여야 합니다.");
        }
    }
}
