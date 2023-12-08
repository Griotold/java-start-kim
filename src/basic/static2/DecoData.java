package basic.static2;
/**
 * static 메서드는 static이 붙은 정적 메서드나 정적 변수만 사용할 수 있다.
 * 반대로 모든 곳에서 static을 호출할 수 있다.
 * */
public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // instanceValue++; // 인스턴스 변수에 접근할 수 없다.
        // instanceMethod(); // 인스턴스 메서드에 접근할 수 없다.

        staticValue++; // 정적 변수 접근 가능
        staticMethod(); // 정적 메서드 접근가능
    }

    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }


}
