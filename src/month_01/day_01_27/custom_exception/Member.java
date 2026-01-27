package month_01.day_01_27.custom_exception;

class Member {
    private String name;
    private int age;

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("나이는 0~150 사이여야 합니다: " + age);
        }
        this.age = age;
    }
}
