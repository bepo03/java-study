package day_01_22;

public class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    public boolean isIndoor() {
        return this.isIndoor;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void speak() {
        System.out.printf("%s: 야옹~\n", getName());
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("실내 고양이: %s\n", (isIndoor() ? "예" : "아니요"));
    }

    public void scratch() {
        System.out.printf("%s 이(가) 스크래처를 긁습니다.\n", getName());
    }
}
