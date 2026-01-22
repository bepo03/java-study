package day_01_22;

public class Developer extends Employee {
    private String language;

    public Developer(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public String getLanguage() {
        return this.language;
    }

    @Override
    public void work() {
        System.out.printf("%s 이(가) %s로 코딩합니다.\n", getName(), getLanguage());
    }

    public void debug() {
        System.out.printf("%s 이(가) 디버깅합니다.\n", getName());
    }
}
