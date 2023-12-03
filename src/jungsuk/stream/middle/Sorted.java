package jungsuk.stream.middle;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * 중간 연산 5. sorted
 * */
public class Sorted {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("이자바", 3, 300),
                new Student("김자바", 1, 200),
                new Student("박자바", 1, 150),
                new Student("조자바", 2, 300),
                new Student("윤자바", 1, 180),
                new Student("황자바", 3, 230),
                new Student("정자바", 3, 170)
        );

        // 만약 역순을 하고 싶다면 .reversed()
        studentStream.sorted(Comparator.comparing(Student::getBan) // 1. 반으로 정렬
                .thenComparing(Comparator.naturalOrder())) // 2. 기본 정렬인 총점의 내림차순 정렬
                .forEach(System.out::println);
    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    public Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", ban=" + ban +
                ", totalScore=" + totalScore +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getBan() {
        return ban;
    }

    public int getTotalScore() {
        return totalScore;
    }

    // 총점 내림차순을 기본 정렬로 한다.
    @Override
    public int compareTo(Student o) {
        return o.totalScore - this.totalScore;
    }
}
