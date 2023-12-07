package basic.access.a;
/**
 * 1. 클래스 레벨에서는 public과 default만 사용가능하다.
 * 2. public class는 파일명과 일치해야 하며 하나만 만들 수 있다.
 * 3. default class는 무한정으로 만들 수 있다.
 * */
public class PublicClass {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 defaultClass1 = new DefaultClass1();
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}

class DefaultClass1 {}

class DefaultClass2 {}
