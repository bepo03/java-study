package day_01_24.zoo;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("%s: 짹짹!\n", getName());
    }

    public void fly() {
        System.out.printf("%s 이(가) 날아갑니다.\n", getName());
    }
}
