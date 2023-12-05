package basic.oop1;
/*
 * 메소드 추출!
 * 각각의 기능들은 이후에 재사용 될 가능성이 높다.
        음악 플레이어 켜기, 끄기
        볼륨 증가, 감소
        음악 플레이어 상태 출력*/
public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        // 음악 플레이어 켜기
        on(data);

        // 볼륨 증가
        volumeUp(data);

        // 볼륨 감소
        volumeDown(data);

        // 음악 플레이어 상태
        showStatus(data);

        // 음악 플레이어 끄기
        off(data);
    }

    private static void on(MusicPlayerData data) {
        System.out.println("음악 플레이어를 시작합니다.");
        data.isOn = true;
    }

    private static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }

    private static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨:" + data.volume);
    }

    private static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }

    private static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
