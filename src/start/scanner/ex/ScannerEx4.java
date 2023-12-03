package start.scanner.ex;

import java.util.Scanner;

//사용자로부터 하나의 정수 `n` 을 입력받고, 입력받은 정수 `n` 의 구구단을 출력하는 프로그램을 작성하세요.
public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 하나를 입력해주세요 : ");
        int n = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }
}
