package start.scanner.ex;

import java.util.Scanner;

//사용자로부터 음식의 이름( `foodName` ), 가격( `foodPrice` ), 그리고 수량( `foodQuantity` )을 입력받아,
//      주문한 음식의 총 가격을 계산하고 출력하는 프로그램을 작성하세요.
//      음식의 총 가격을 계산하세요. 총 가격은 각 음식의 가격( `foodPrice` )과 수량( `foodQuantity` )을 곱한 값이
//      며, 이를 `totalPrice` 라는 이름의 변수에 저장하세요.
//      주문 정보와 총 가격을 출력하세요. 출력 형태는 "[음식 이름] [수량]개를 주문하셨습니다. 총 가격은 [총 가격]원
//      입니다." 이어야 합니다.
public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("주문할 음식을 입력해주세요: ");
        String foodName = sc.nextLine();

        System.out.print("가격을 입력해주세요: ");
        int price = sc.nextInt();

        System.out.print("수량을 입력해주세요: ");
        int quantity = sc.nextInt();

        int totalPrice = price * quantity;

        System.out.print(foodName + " " + quantity + "개를 주문하셨습니다. ");
        System.out.println("총 가격은 " + totalPrice + "입니다.");
    }
}
