package basic.poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        // 다형적 참조
        Parent poly = new Child();

        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();
    }
}
