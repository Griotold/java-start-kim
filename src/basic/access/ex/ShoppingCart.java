package basic.access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int index = 0;
    public void addItem(Item item) {
        if (index == 10) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items[index++] = item;
    }

    public void displayItems() {
        for (int i = 0; i < index; i++) {
            Item item = items[i];
            System.out.println(item.toString());
        }

        System.out.println("전체 가격 합: " + getTotalPrice());
    }

    private int getTotalPrice() {
        int total = 0;
        for (int i = 0; i < index; i++) {
            Item item = items[i];
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }
}
