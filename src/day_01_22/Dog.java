package day_01_22;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void speak() {
        System.out.printf("%s: 멍멍!\n", getName());
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("견종: %s\n", getBreed());
    }

    public void fetch() {
        System.out.printf("%s 이(가) 공을 물어옵니다.\n", getName());
    }
}
