package month_01.day_01_31.behavior_parameterization;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Example1 {
    public static List<Integer> filterNumbers(
            List<Integer> numbers,
            Predicate<Integer> predicate
    ) {
        List<Integer> result = new ArrayList<>();

        for (Integer n : numbers) {
            if (predicate.test(n)) {
                result.add(n);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int ranNum = random.nextInt(100) + 1;
            numbers.add(ranNum);
        }

        List<Integer> evens = filterNumbers(numbers, n -> n % 2 == 0);
        List<Integer> multipleOf3s = filterNumbers(numbers, n -> n % 3 == 0);

        System.out.println("데이터: " + numbers);
        System.out.println("짝수: " + evens);
        System.out.println("3배수: " + multipleOf3s);
    }
}
