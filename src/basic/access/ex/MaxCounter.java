package basic.access.ex;
/**
 * 이 클래스는 최대값을 지정하고 최대값 까지만 값이 증가하는 기능을 제공합니다.
 * `int count` : 내부에서 사용하는 숫자 입니다. 초기값은 0입니다.
 * `int max` : 최대값 입니다. 생성자를 통해 입력합니다.
 * `increment()` 숫자를 하나 증가합니다.
 * `getCount()` 지금까지 증가한 값을 반환합니다.
 * **요구사항**
 * **접근 제어자를 사용해서 데이터를 캡슐화 하세요.***/
public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }
    public void increment() {
        if (!isMax()){
            count++;
        } else {
            System.out.println("현재 최대 카운트입니다!");
        }
    }

    public void increment2() {
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        count++;
    }

    public int getCount() {
        return count;
    }

    private boolean isMax() {
        return count == max;
    }
}
