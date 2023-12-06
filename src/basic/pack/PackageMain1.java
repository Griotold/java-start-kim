package basic.pack;


public class PackageMain1 {

    public static void main(String[] args) {
        // 사용자와 같은 위치?
        // 패키지 경로를 생략해도 된다.
        Data data = new Data();

        // 사용자와 다른 위치?
        // 패키지 전체 경로(풀 네임)를 포함해서 클래스를 적어줘야 한다.
        basic.pack.a.User user = new basic.pack.a.User();
    }
}
