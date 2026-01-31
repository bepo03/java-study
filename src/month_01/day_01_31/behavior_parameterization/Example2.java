package month_01.day_01_31.behavior_parameterization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

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
        return name + "(" + score + ")";
    }
}

public class Example2 {
    public static List<Student> filterStudents(
            List<Student> students,
            Predicate<Student> predicate
    ) {
        List<Student> result = new ArrayList<>();

        for (Student s : students) {
            if (predicate.test(s)) {
                result.add(s);
            }
        }

        result.sort(Comparator.comparing(Student::getName));

        return result;
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Kim", 90),
                new Student("Lee", 70),
                new Student("Park", 85),
                new Student("Choi", 60)
        );

        List<Student> highScoreStudents = filterStudents(students, s -> s.getScore() >= 80);
        List<Student> nameStartKStudents = filterStudents(students, s -> s.getName().startsWith("K"));
        List<Student> rowStudents = filterStudents(students, s -> s.getScore() <= 70);

        System.out.println("점수가 80이상인 학생들: " + highScoreStudents);
        System.out.println("이름이 K로 시작하는 학생들: " + nameStartKStudents);
        System.out.println("점수가 70이하인 학생들: " + rowStudents);
    }
}
