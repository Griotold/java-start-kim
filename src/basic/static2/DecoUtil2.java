package basic.static2;
/**
 * static 메서드
 * 인스턴스 변수를 사용하지 않는다면 static 메서드를 사용하자
 * */
public class DecoUtil2 {
    public static String deco(String str) {
        String result = "*" + str + "*";
        return result;
    }
}
