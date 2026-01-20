package day_01_20;

public class StringUtils {
    public static void main(String[] args) {
        String text = "Learning Java is fun and useful.";

        System.out.println("=== 문자열 유틸리티 ===");
        System.out.printf("원본: %s\n", text);
        System.out.printf("대문자: %s\n", toUpperCase(text));
        System.out.printf("소문자: %s\n", toLowerCase(text));
        System.out.printf("길이: %d\n", length(text));
        System.out.printf("뒤집기: %s\n", reverse(text));
        System.out.printf("공백 개수: %d\n", countSpaces(text));
        System.out.printf("'o' 개수: %d\n", countChar(text, 'a'));

    }

    public static String toUpperCase(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                c -= 32;
                result.append(c);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static String toLowerCase(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                c += 32;
                result.append(c);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static int length(String s) {
        int result = 0;
        for (char c: s.toCharArray()) {
            result++;
        }
        return result;
    }

    public static String reverse(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

    public static int countSpaces(String s) {
        int count = 0;
        for (char c: s.toCharArray()) {
            if (c == ' ') count++;
        }
        return count;
    }

    public static int countChar(String s, char target) {
        int count = 0;
        for (char c: s.toCharArray()) {
            if (c == target) count++;
        }
        return count;
    }
}
