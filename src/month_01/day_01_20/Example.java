package month_01.day_01_20;

public class Example {
    public static class Student {
        String name; // 이름
        String grade; // 학년
        // String class; // ❌ 예약어
        String classNum; // ✅ 반 번호
        int[] scores;

        // 1. 기본 생성자는 어떠한 생성자도 정의 하지 않으면,
        // 자바가 자동으로 생성 해준다.
        // 2. 만약 파라미터가 있는 생성자를 하나라도 선언하면,
        // 자바는 자동으로 '기본 생성자'를 생성 해주지 않는다.
        public Student() {
        }

        // 3. 생성자 오버로딩
        // 4. this 키워드 -> 유진호, 나는, 제가,
        public Student(String n, String g, String c, int[] s) {
            this.name = n;
            this.grade = g;
            this.classNum = c;
            this.scores = s;
        }

        // 5. 메서드
        // public 리턴타입 메서드명() {}
        // public 리턴타입 메서드명(파라미터 타입 변수명, ...) {}
        public void sayToHello() {
            System.out.println("안녕하세요. 저는 " + this.name + " 입니다.");
        }

        public int sumScore() {
            int sum = 0;
            for (int score : this.scores) {
                sum += score;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        // 1.
        Student s1 = new Student();
        s1.name = "박선우";
        s1.grade = "2학년";
        s1.classNum = "1반";

        // 2.
        Student s2 = new Student("유진호", "3학년", "7반", new int[]{10, 20, 30, 40});

        // 3.
        String userName = "jack";
        String grade = "4학년";
        String classNum = "1학년";
        int[] scores = {10, 20, 30, 40};

        Student s3 = new Student(userName, grade, classNum, scores);
    }
}
