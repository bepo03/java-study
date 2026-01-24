package day_01_24.zoo;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void eat() {
        System.out.printf("%s 이(가) 먹습니다.\n", getName());
    }

    public abstract void speak();

    public void showInfo() {
        System.out.printf("이름: %s\n", getName());
    }
}
