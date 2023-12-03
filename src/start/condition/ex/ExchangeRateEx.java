package start.condition.ex;
//        달러가 0미만이면: "잘못된 금액입니다."
//        달러가 0일 때: "환전할 금액이 없습니다."
//        달러가 0 초과일 때: "환전 금액은 (계산된 원화 금액)원입니다."
public class ExchangeRateEx {
    public static void main(String[] args) {
        int dollor = 4;
        int won = 0;

        if (dollor < 0) {
            System.out.println("잘못된 금액입니다");
        } else if (dollor == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            won = dollor * 1300;
            System.out.printf("환전 금액은 %d입니다.", won);
        }
    }
}
