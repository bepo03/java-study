package java_basic_problems.part1;

public class Problem3 {
    public static void main(String[] args) {
        int n = 5;

        // or 조건식이 사용됨
        // 앞이 true이므로 단락평가로 뒤 조건 무시
        if (n > 3 || ++n > 10) {
            System.out.println("조건 만족");
        }
        System.out.println("n = " + n); // n = 5

        int m = 5;

        // 앞이 false이므로 단락평가는 아님 m이 1 증가
        if (m < 3 || ++m > 10) {
            System.out.println("조건 만족");
        }
        System.out.println("m = " + m); // m = 5

        /*
        출력:
        조건 만족
        n = 5
        m = 6
         */
    }
}
