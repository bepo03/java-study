package day_01_22;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void work() {
        System.out.printf("%s 이(가) %d명의 팀을 관리합니다.\n", getName(), getTeamSize());
        super.work();
    }

    @Override
    public int getSalary() {
        return this.salary + (this.teamSize * 100_000);
    }

    public int getTeamSize() {
        return this.teamSize;
    }
}
