package java_basic_problems.part1;

public class Problem2 {
    public static void main(String[] args) {
        int x = 7;
        int y = 2;

        int result1 = x / y; // x를 y로 나눈 후 소수점 버림 (result1 = 3)
        double result2 = x / y; // 둘다 int형 이므로 소수점 버림 (result2 = 3.0)
        double result3 = (double) x / y; // x를 실수로 형변환해서 소수점 남음 (result3 = 3.5)

        System.out.println("result1 = " + result1); // result1 = 3
        System.out.println("result2 = " + result2); // result2 = 3.0
        System.out.println("result3 = " + result3); // result3 = 3.5

        /*
        출력:
        result1 = 3
        result2 = 3.0
        result3 = 3.5
         */
    }
}
