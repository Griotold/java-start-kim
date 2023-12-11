package basic.poly.ex2;
// 배열과 반복문으로 중복 제거
public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal caw = new Caw();
        Animal dog = new Dog();
        Animal[] arr = {cat, caw, dog};

        // 변하지 않는 부분
        for (Animal animal : arr) {
            System.out.println("동물 울음 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 울음 소리 테스트 종료");
        }

        System.out.println("=======조금 더 개선=====");
        // 조금 더 개선
        Animal[] animalArr = {new Dog(), new Cat(), new Caw()};
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 울음소리 테스트 시작");
        animal.sound();
        System.out.println("동물 울음소리 테스트 종료");
    }
}
