package java_basic_problems.part1;

public class Problem1 {
    public static void main(String[] args) {
        int a = 5; // a = 5
        int b = a++; // b에 a를 넣은 후 a를 1 증가 (a = 6, b = 5)
        int c = ++a; // a를 1 증가 후 c에 넣음 (a = 7, b = 5, c = 7)

        System.out.println("a = " + a); // a = 7
        System.out.println("b = " + b); // b = 5
        System.out.println("c = " + c); // c = 7

        /*
        출력:
        a = 7
        b = 5
        c = 7
         */
    }
}
