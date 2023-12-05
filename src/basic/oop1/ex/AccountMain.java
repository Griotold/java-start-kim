package basic.oop1.ex;
/**
 * 문제 2 - 객체 지향 계좌
 * */
public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000); // 잔액 부족!

        System.out.println("잔고: " + account.balance);

    }
}
