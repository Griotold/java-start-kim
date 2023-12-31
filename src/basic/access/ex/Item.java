package basic.access.ex;

public class Item {
    private String name;
    private int price;
    private int quantity;
    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
//        return "Item{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                ", quantity=" + quantity +
//                '}';
        return "상품명: " + name + ", 합계: " + price * quantity;
    }
}
