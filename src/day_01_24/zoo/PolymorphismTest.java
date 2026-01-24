package day_01_24.zoo;

public class PolymorphismTest {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("바둑이"),
                new Cat("나비"),
                new Bird("짹짹이"),
                new Dog("멍멍이")
        };

        System.out.println("=== 모든 동물 소리 내기 ===");
        for (Animal animal : animals) {
            animal.speak();
        }

        System.out.println("\n=== 타입별 특수 동장 ===");
        for (Animal animal : animals) {
            animal.showInfo();

            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.fetch();
            } else if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.scratch();
            } else if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.fly();
            }
            System.out.println("---");
        }
    }
}
