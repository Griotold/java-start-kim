package basic.access;
/**
 * 스피커의 볼륨이 100을 넘기면 망가진다.
 * */
public class Speaker {
    private int volume; // private 사용

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVoluem() {
        System.out.println("현재 음량: " + volume);
    }
}
