package basic.poly.ex3;
/**
 * 추상 클래스는 직접 생성하지 못하도록 막고
 * 자식 클래스가 꼭 메서드 오버라이딩하도록 제약을 준다.
 * */
public abstract class AbstractAnimal {
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
