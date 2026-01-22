package day_01_22;

public class Employee {
    protected String name;
    protected int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public int getSalary() {
        return this.salary;
    }

    public void work() {
        System.out.printf("%s 이(가) 일합니다.\n", getName());
    }

    public void showInfo() {
        System.out.printf("이름: %s\n", getName());
        System.out.printf("급여: %s원\n", String.format("%,d", getSalary()));
    }
}
