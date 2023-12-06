package basic.pack;


import basic.pack.a.User;
/**
 * 클래스 이름이 중복되는 경우 풀네임을 적어줌으로써
 * 중복을 해소해야 한다.
 * */
public class PackageMain3 {

    public static void main(String[] args) {
        Data data = new Data();

        // 보통 자주 쓰는 클래스를 import해주고
        // 덜 쓰는 클래스를 풀네임을 사용한다.
        User userA = new User();
        basic.pack.b.User userB = new basic.pack.b.User();
    }
}
