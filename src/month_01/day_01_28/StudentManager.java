package month_01.day_01_28;

import java.util.ArrayList;

class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return this.score;
    }

    @Override
    public String toString() {
        return this.name + "(" + this.score + "점)";
    }
}

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, int score) {
        this.students.add(new Student(name, score));
        System.out.printf("%s 학생 추가됨\n", name);
    }

    public void removeStudent(String name) {
        for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getName().equals(name)) {
                this.students.remove(i);
                System.out.printf("%s 학생 삭제됨\n", name);
                return;
            }
        }
        System.out.printf("%s 학생을 찾을 수 없습니다.\n", name);
    }

    public Student findStudent(String name) {
        for (Student s : this.students) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }

    public void printAll() {
        System.out.printf("=== 학생 목록 (%d명) ===\n", this.students.size());
        for (Student s : this.students) {
            System.out.println("- " + s);
        }
    }

    public double getAverage() {
        if (this.students.isEmpty()) return 0;

        int sum = 0;
        for (Student s : this.students) {
            sum += s.getScore();
        }
        return (double) sum / this.students.size();
    }

    public Student getTopStudent() {
        if (this.students.isEmpty()) return null;

        Student top = this.students.get(0);
        for (Student s : this.students) {
            if (s.getScore() > top.getScore()) {
                top = s;
            }
        }
        return top;
    }

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent("홍길동", 85);
        manager.addStudent("김영희", 92);
        manager.addStudent("이철수", 78);
        manager.addStudent("박지민", 95);

        manager.printAll();

        System.out.printf("\n평균 점수: %s\n", String.format("%.1f", manager.getAverage()));
        System.out.printf("1등: %s\n", manager.getTopStudent());

        System.out.println("\n=== 검색 ===");
        Student found = manager.findStudent("김영희");
        if (found != null) {
            System.out.printf("찾음: %s\n", found);
        }

        manager.removeStudent("이철수");
        manager.printAll();
    }
}
