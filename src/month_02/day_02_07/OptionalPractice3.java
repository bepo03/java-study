package month_02.day_02_07;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalPractice3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 8, 10, 12);

        // Stream API와 Optional결합
        Optional<Integer> maxEven = numbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo);

        System.out.println("최대 짝수: " + maxEven);    // Optional[12]

        // 값 추출
        int result = maxEven.orElse(0);
        System.out.println("결과: " + result);    // 12

        // 짝수가 없는 경우
        List<Integer> oddNumbers = Arrays.asList(1, 3, 5, 7);
        Optional<Integer> maxEven2 = oddNumbers.stream()
                .filter(n -> n % 2 == 0)
                .max(Integer::compareTo);

        System.out.println("최대 짝수: " + maxEven2);   // Optional.empty
        System.out.println("결과: " + maxEven2.orElse(0));    // 0
    }
}
