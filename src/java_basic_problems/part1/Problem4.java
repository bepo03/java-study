package java_basic_problems.part1;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int sum = 0;

        // for (int i = 1; i <= arr.length; i++)
        // 초기식: 배열에 인덱스값은 0부터 실행이므로 오류 생길 수 있음
        // 조건식: arr.length 값은 5인대 배열에 마지막 인덱스 값은 4이므로 확실한 오류
        // 증감식: 오류 없음

        for (int i = 0; i < arr.length; i++) {
            // 인덱스 값이 2배수인 숫자 넘김 (0포함)
            // 즉 1번째(index = 0), 3번째(index = 2), 5번째(index = 4) 값을 무시
            if (i % 2 == 0) continue;
            // sum에 조건에 무시된 숫자를 제외하고 더함
            // 4(index = 1), 8(index = 3)을 sum에 더함
            sum += arr[i];
        }

        System.out.println("sum = " + sum); // sum = 12

        /*
        출력:
        sum = 12
         */
    }
}
