package basic.poly.ex2;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }

    /**
     * 동물이 추가되어도 변하지 않는 코드
     * "다형적 참조" 덕분에 `animal` 변수는 자식인 `Dog` , `Cat` , `Caw` 의 인스턴스를 참조할 수 있다.
     *      부모는 자식을 담을 수 있다)
     * "메서드 오버라이딩" 덕분에 `animal.sound()` 를 호출해도 `Dog.sound()` , `Cat.sound()` ,
     * `Caw.sound()` 와 같이 각 인스턴스의 메서드를 호출할 수 있다.
     * */
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 울음 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 울음 소리 테스트 종료");
    }
}
