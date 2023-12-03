package start.scanner.ex;

import java.util.Scanner;

//사용자로부터 이름과 나이를 반복해서 입력받고, 입력받은 이름과 나이를 출력하는 프로그램을 작성하세요. 사용
//        자가 "종료"를 입력하면 프로그램이 종료되어야 합니다.
//        다음 실행 결과 예시를 참고해주세요.
public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine();
            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt(); // 10\n 에서 10만 가져감
            input.nextLine(); // 남아 있는 \n 처리
            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
