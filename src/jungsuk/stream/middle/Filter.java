package jungsuk.stream.middle;

import java.util.stream.IntStream;

/**
 * 중간 연산 3. Filter
 * */
public class Filter {

    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10); // 1 ~ 10
        intStream.filter(i -> i % 2 == 0).forEach(System.out::print); // 2의 배수만 거르기

        System.out.println();
        System.out.println("============");

        // filter를 여러 번 사용하기 - 2의 배수이면서 3의 배수를 거르기
        IntStream intStream2 = IntStream.rangeClosed(1, 10);
        intStream2.filter(i -> i % 2 == 0).filter(i -> i % 3 == 0).forEach(System.out::print);

        System.out.println();
        System.out.println("============");

        // filter 안에 논리 연산자로 묶어도 된다. - 2의 배수 또는 3의 배수 거르기
        IntStream intStream3 = IntStream.rangeClosed(1, 10);
        intStream3.filter(i -> i % 2 == 0 || i % 3 == 0).forEach(System.out::print);
    }
}
