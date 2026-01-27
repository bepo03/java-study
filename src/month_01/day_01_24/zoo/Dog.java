package month_01.day_01_24.zoo;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("%s: 멍멍!\n", getName());

    }

    public void fetch() {
        System.out.printf("%s 이(가) 공을 가져옵니다.\n", getName());
    }
}
