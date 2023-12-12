package basic.poly.ex.sender;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String msg) {
        System.out.println("이메일로 발송합니다. " + msg);
    }
}
