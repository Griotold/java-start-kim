package jungsuk.stream.middle;

import java.io.File;
import java.util.stream.Stream;

/**
 * 중간 연산 6. map
 * 중간 연산 7. peek -> 중간 확인, 디버깅 용도
 * */
public class Map2 {
    public static void main(String[] args) {
        File[] fileArr = {new File("Ex1.java"),
                new File("Ex1.bak"), new File("Ex1"), new File("Ex1.txt")
        };

        Stream<File> fileStream = Stream.of(fileArr);

        // 1. 모든 파일의 이름을 출력
        Stream<String> fileNameStream = fileStream.map(File::getName);
        fileNameStream.forEach(System.out::println);

        System.out.println("=========");

        // 2. 확장자만 대문자로 변환해서 출력
        Stream<File> fileStream2 = Stream.of(fileArr);
        fileStream2.map(File::getName)
                .filter(s -> s.indexOf('.') != -1) // 확장자가 없는 것 제외
                .peek(s -> System.out.printf("filename=%s%n", s))
                .map(s -> s.substring(s.indexOf('.') + 1)) // 확장자만 추출
                .peek(s -> System.out.printf("extension=%s%n", s))
                .map(String::toUpperCase) // 확장자를 대문자로
                .distinct() // 중복 제거
                .forEach(System.out::println);
    }
}
