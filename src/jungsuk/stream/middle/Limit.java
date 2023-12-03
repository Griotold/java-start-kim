package jungsuk.stream.middle;

import java.util.stream.IntStream;

/**
 * 중간 연산 2. limit
 * */
public class Limit {
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10); // 1 ~ 10
        intStream.skip(3).limit(5).forEach(System.out::print); // 123 건너뛰고, 5개만 출력
    }
}
