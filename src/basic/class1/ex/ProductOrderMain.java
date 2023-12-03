package basic.class1.ex;
// 상품명: 두부, 가격: 2000, 수량: 2
// 상품명: 김치, 가격: 5000, 수량: 1
// 상품명: 콜라, 가격: 1500, 수량: 2
// 총 결제 금액: 12000
public class ProductOrderMain {
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder tofu = createPO("두부", 2000, 2);
        ProductOrder kimchi = createPO("김치", 5000, 1);
        ProductOrder coke = createPO("콜라", 1500, 2);

        ProductOrder[] productOrders = {tofu, kimchi, coke};

        // 상품 주문 정보를 `ProductOrder` 타입의 변수로 받아 저장
        // 상품 주문 정보와 최종 금액 출력

        int totalPrice = calTotalPrice(productOrders);

        for (ProductOrder po : productOrders) {
            System.out.printf("상품명: %s, 가격: %d, 수량: %d", po.productName, po.price, po.quantity);
            System.out.println();
        }

        System.out.println("총 결제 금액: " + totalPrice);


    }

    private static int calTotalPrice(ProductOrder[] productOrders) {
        int total = 0;
        for (ProductOrder po : productOrders) {
            int cost = po.price * po.quantity;
            total += cost;
        }
        return total;
    }

    private static ProductOrder createPO(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }
}
