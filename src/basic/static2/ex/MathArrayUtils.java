package basic.static2.ex;
/**
 * 다음 기능을 제공하는 배열용 수학 유틸리티 클래스( `MathArrayUtils` )를 만드세요.
 * `sum(int[] array)` : 배열의 모든 요소를 더하여 합계를 반환합니다.
 * `average(int[] array)` : 배열의 모든 요소의 평균값을 계산합니다.
 * `min(int[] array)` : 배열에서 최소값을 찾습니다.
 * `max(int[] array)` : 배열에서 최대값을 찾습니다.
 * */
public class MathArrayUtils {

    private MathArrayUtils() {
        // private : 인스턴스 생성을 막는다.
    }

    // `sum(int[] array)` : 배열의 모든 요소를 더하여 합계를 반환합니다.
    public static int sum(int[] arr) {
        int result = 0;
        for (int x : arr) {
            result += x;
        }
        return result;
    }

    // `average(int[] array)` : 배열의 모든 요소의 평균값을 계산합니다.
    public static double average(int[] arr) {
        double result = 0;
        int n = arr.length;
        result = (double) (sum(arr)) / n;
        return result;
    }

    // min(int[] array)` : 배열에서 최소값을 찾습니다.
    public static int min(int[] arr) {
        int result = Integer.MAX_VALUE;
        for (int x : arr) {
            if (x < result) {
                result = x;
            }
        }
        return  result;
    }

    // max(int[] array) : 배열에서 최댓값을 찾습니다.
    public static int max(int[] arr) {
        int result = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > result) {
                result = i;
            }
        }
        return result;
    }
}
