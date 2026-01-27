package month_01.day_01_17;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        /*
        // 1. 배열 선언
        int[] array;
        // 2. 배열 생성
        array = new int[5];
        System.out.println(array);

        // 3. 배열 초기화
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;
//        array[3] = 4;
//        array[4] = 5;
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
        */

        String[] array = new String[3];
        for (String s : array) {
            System.out.println(s);
        }

        int[] grade = {90, 85, 75};
        int[] copyGrade = new int[grade.length];


        for (int i = 0; i < grade.length; i++) {
            copyGrade[i] = grade[i];
        }

        copyGrade[0] = 60;
        System.out.println("garde array: " + grade[0]);
        System.out.println("copyGarde array: " + copyGrade[0]);

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int[] row : matrix) {
            for (int column : row) {
                System.out.println(column);
            }
        }

        String[] prevStudents = {"가나다", "라마바", "사아자"};
        String[] newStudents = Arrays.copyOf(prevStudents, prevStudents.length + 2);
        System.out.println(Arrays.toString(newStudents));
        newStudents[3] = "차카타";
        newStudents[4] = "파하";
        System.out.println(Arrays.toString(newStudents));
    }
}
