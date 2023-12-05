package basic.oop1;
/**
 * 객체 지향 음악 플레이어
 * 음악 플레이어를 만들어서 제공하는 개발자와
 * 음악 플레이어를 사용하는 개발자가 분리되어 있다고 생각하자
 * */
public class MusicPlayer {
    int volume;
    boolean isOn;

    public void on() {
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    public void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    public void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    public void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    public void showStatus() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
