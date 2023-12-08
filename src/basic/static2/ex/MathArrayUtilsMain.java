package basic.static2.ex;
/**
 * MathArrayUtils` 은 객체를 생성하지 않고 사용해야 합니다. 누군가 실수로 `MathArrayUtils` 의 인스턴스
 * 를 생성하지 못하게 막으세요.
 * 실행 코드에 `static import` 를 사용해도 됩니다.
 * */
public class MathArrayUtilsMain {
    public static void main(String[] args) {
        // 생성자를 private 으로 해두면 인스턴스를 생성하지말고
        // 사용자에게 static 변수와 메서드를 사용하라고 메시지를 전달하는 것이다.

        int[] values = {1, 2, 3, 4, 5};
        System.out.println("sum=" + MathArrayUtils.sum(values));
        System.out.println("average=" + MathArrayUtils.average(values));
        System.out.println("min=" + MathArrayUtils.min(values));
        System.out.println("max=" + MathArrayUtils.max(values));
    }
}
