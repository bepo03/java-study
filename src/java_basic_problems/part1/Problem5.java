package java_basic_problems.part1;

public class Problem5 {
    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = original; // 얕은 복사, 주소값을 복사함

        copy[0] = 100; // original[0], copy[0] 둘 다 값을 100으로 변경

        int[] another = new int[original.length];
        // 깊은 복사, original의 모든 값이 another에 복사됨
        for (int i = 0; i < original.length; i++) {
            another[i] = original[i];
        }

        another[1] = 200; // 깊은 복사이므로 another[1]만 200으로 변경

        System.out.println("original[0] = " + original[0]); // original[0] = 100
        System.out.println("original[1] = " + original[1]); // original[1] = 2
        System.out.println("copy[0] = " + copy[0]); // copy[0] = 100
        System.out.println("anther[1] = " + another[1]); // another[1] = 200

        System.out.println("original == copy: " + (original == copy)); // original == copy: true
        System.out.println("original == another: " + (original == another)); // original == another: false

        /*
        출력:
        original[0] = 100
        original[1] = 2
        copy[0] = 100
        another[1] = 200
        original == copy: true
        original == another: false
         */
    }
}
