package basic.ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int n = sc.nextInt();
        // 엔터 제거(입력 버퍼 제거)

        ProductOrder[] orders = new ProductOrder[n];
        for (int i = 1; i <= n; i++) {
            System.out.println(i + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String productName = sc.nextLine();
            System.out.print("가격: ");
            int price = sc.nextInt();
            sc.nextLine(); // 엔터 제거(입력 버퍼 제거)

            System.out.print("수량: ");
            int quantity = sc.nextInt();
            sc.nextLine(); // 엔터 제거(입력 버퍼 제거)

            orders[i - 1] = createOrder(productName, price, quantity);
        }

        printOrders(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);

    }

    public static ProductOrder createOrder(String productName, int price, int quantity) {
        // ProductOrder` 를 생성하고 매개변수로 초기값을 설정합니다. 마지막으로 생성한 `ProductOrder` 를
        // 반환합니다.

        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    public static void printOrders(ProductOrder[] orders) {
        // 배열을 받아서 배열에 들어있는 전체 `ProductOrder` 의 상품명, 가격, 수량을 출력합니다.
        for (ProductOrder order : orders) {
            System.out.printf("상품명: %s, 가격: %d, 수량: %d ", order.productName, order.price, order.quantity);
            System.out.println();
        }
    }

    public static int getTotalAmount(ProductOrder[] orders) {
        // 배열을 받아서 배열에 들어있는 전체 `ProductOrder` 의 총 결제 금액을 계산하고, 계산 결과를 반환합니다.
        int total = 0;
        for (ProductOrder order : orders) {
            total += order.price * order.quantity;
        }
        return total;
    }
}
