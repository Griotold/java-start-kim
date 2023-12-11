package basic.poly.ex5;
/**
 * 인터페이스는 앞서 설명한 순수 추상 클래스와 같다. 여기에 약간의 편의 기능이 추가된다.
 * 인터페이스의 메서드는 모두 `public` , `abstract` 이다.
 * 메서드에 `public abstract` 를 생략할 수 있다. 참고로 생략이 권장된다.
 * 인터페이스는 다중 구현(다중 상속)을 지원한다.
 * */
public interface InterfaceAnimal {
    void sound();
    void move();
}
