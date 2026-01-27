package month_01.day_01_19;

public class Student {
    String name;
    int studentId;
    int[] scores;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.scores = new int[3];
    }

    public void setScores(int korean, int english, int math) {
        this.scores[0] = korean;
        this.scores[1] = english;
        this.scores[2] = math;
    }

    public int getTotal() {
        int sum = 0;
        for (int score : this.scores) sum += score;
        return sum;
    }

    public double getAverage() {
        return (double) getTotal() / this.scores.length;
    }

    public void printReport() {
        System.out.println("=== 성적표 ===");
        System.out.printf("학번: %6d\n", this.studentId);
        System.out.printf("이름: %s\n", this.name);
        System.out.printf("국어: %3d, 영어: %3d, 수학: %3d\n", this.scores[0], this.scores[1], this.scores[2]);
        System.out.printf("총점: %3d, 평균: %.1f\n", getTotal(), getAverage());
    }
}
