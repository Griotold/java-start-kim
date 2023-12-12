package basic.poly.ex.sender;

public class SendMain {
    public static void main(String[] args) {
        Sender[] arr = {new EmailSender(), new SmsSender(), new FaceBookSender()};

        for (Sender sender : arr) {
            sender.sendMessage("환영합니다!");
        }
    }
}
