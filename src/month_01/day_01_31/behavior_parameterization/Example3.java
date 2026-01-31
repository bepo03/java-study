package month_01.day_01_31.behavior_parameterization;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Example3 {
    public static <T> void process(
            List<T> list,
            Consumer<T> consumer
    ) {
        for (T element : list) {
            consumer.accept(element);
        }
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Java", "Spring", "Lambda");

        System.out.println("=== 데이터 출력 ===");
        process(words, System.out::println);

        System.out.println("\n=== 대문자 변환 ===");
        process(words, s -> System.out.println(s.toUpperCase()));

        System.out.println("\n=== 길이 출력 ===");
        process(words, s -> System.out.println(s.length()));
    }
}
