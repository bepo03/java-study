package day_01_22;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void eat() {
        System.out.printf("%s 이(가) 먹습니다.\n", getName());
    }

    public void sleep() {
        System.out.printf("%s 이(가) 잠을 잡니다.\n", getName());
    }

    public void speak() {
        System.out.printf("%s 이(가) 소리를 냅니다.\n", getName());
    }

    public void showInfo() {
        System.out.printf("이름: %s, 나이: %d살\n", getName(), getAge());
    }
}
