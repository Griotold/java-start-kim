package jungsuk.stream.middle;

import java.util.stream.IntStream;
/**
 * 중간 연산 4. distinct
 * */

public class Distinct {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 1, 2, 2, 3, 3, 5, 4);
        intStream.distinct().forEach(System.out::print);
    }
}
