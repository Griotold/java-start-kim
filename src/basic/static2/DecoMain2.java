package basic.static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String str = " Hello Java";
        String deco = DecoUtil2.deco(str);

        System.out.println("before: " + str);
        System.out.println("after: " + deco);
    }
}
