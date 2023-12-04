package basic.ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        // printOrders()를 사용해서 상품 주문 정보 출력
        // getTotalAmount()를 사용해서 총 결제 금액 계산
        // 총 결제 금액 출력
        ProductOrder po1 = createOrder("학생1", 2000, 3);
        ProductOrder po2 = createOrder("학생2", 3000, 5);
        ProductOrder[] orders = {po1, po2};

        int total = getTotalAmount(orders);

        printOrders(orders);
        System.out.println("총 결제금액: " + total);
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
