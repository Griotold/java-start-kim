package jungsuk.stream.middle;

import java.util.stream.IntStream;

/**
 * 중간 연산 1. Skip 연산
 * */
public class Skip {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10); // 1 ~ 10
        intStream.skip(3).forEach(System.out::print); // 123 건너 뛰고 나머지 출력
    }
}
