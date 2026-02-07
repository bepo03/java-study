package month_02.day_02_07;

import java.util.Optional;

public class OptionalPractice1 {
    public static String process(String input) {
        return Optional.ofNullable(input)
                .filter(s -> s.length() >= 5)
                .map(String::toUpperCase)
                .orElse(input == null ? "NULL" : "SHORT");
    }

    public static void main(String[] args) {
        System.out.println(process("hello"));
        System.out.println(process("hi"));
        System.out.println(process(null));
    }
}
