package start.condition.ex;
// 두 수 중 더 큰 수 찾기
public class CondOpEX {
    public static void main(String[] args) {
        int a = 30, b = 20;
        int bigger = (a > b) ? a : b;
        System.out.printf("더 큰 수는 %d입니다.", bigger);
    }
}
