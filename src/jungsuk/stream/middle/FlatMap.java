package jungsuk.stream.middle;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * 중간 연산 8. flatMap : 스트림의 스트림 -> 스트림
 * */
public class FlatMap {

    public static void main(String[] args) {
        Stream<String[]> strArrStream = Stream.of(
                new String[]{"abc", "def", "jkl"},
                new String[]{"ABC", "GHI", "JKL"}
        );

        Stream<String> strStream = strArrStream.flatMap(Arrays::stream);

        strStream.map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("========");

        String[] lineArr = {
                "Believe or not It is true",
                "Do or do not There is no try"
        };

        Stream<String> lineStream = Arrays.stream(lineArr);
        lineStream.flatMap(line -> Stream.of(line.split(" +")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .forEach(System.out::println);


    }
}
