package month_01.day_01_27.student_grade;

class StudentGrade {
    private String name;
    private int[] scores = new int[3];

    public StudentGrade(String name) {
        this.name = name;
    }

    public void setScore(int index, int score) throws InvalidScoreException {
        if (index < 0 || index >= this.scores.length) {
            throw new InvalidScoreException("과목 인덱스 오류: " + index);
        }
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("점수는 0~100 사이여야 합니다: " + score);
        }
        this.scores[index] = score;
    }

    public double getAverage() {
        int sum = 0;
        for (int score : this.scores) {
            sum += score;
        }
        return (double) sum / this.scores.length;
    }

    public void printReport() {
        System.out.printf("학생: %s\n", this.name);
        System.out.printf("국어: %d, 영어: %d, 수학: %d\n", this.scores[0], this.scores[1], this.scores[2]);
        System.out.printf("평균: %.1f\n", getAverage());
    }
}
