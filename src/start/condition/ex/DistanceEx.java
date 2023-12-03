package start.condition.ex;
//        거리가 1km 이하이면: "도보"
//        거리가 10km 이하이면: "자전거"
//        거리가 100km 이하이면: "자동차"
//        거리가 100km 초과이면: "비행기"
//        거리는
public class DistanceEx {

    public static void main(String[] args) {
        int distance = 5;

        if (distance <= 1) {
            System.out.println("도보로 이동하세요");
        } else if (distance <= 10) {
            System.out.println("자전거로 이동하세요");
        } else if (distance <= 100) {
            System.out.println("자동차로 이동하세요");
        } else {
            System.out.println("비행기로 이동하세요");
        }
    }
}
