package day_01_24.zoo;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.printf("%s: 야옹~\n", getName());
    }

    public void scratch() {
        System.out.printf("%s 이(가) 긁습니다.\n", getName());
    }
}
