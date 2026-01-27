package month_01.day_01_12;

public class DateTypes {
    public static void main(String[] args) {
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2147483647;
        long longVar = 9223372036854775807L;

        System.out.println("=== 정수형 ===");
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);

        float floatVar = 3.14f;
        double doubleVar = 3.141592653589793;

        System.out.println("\n=== 실수형 ===");
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);

        char charVar = 'Z';
        char koreanChar = '하';

        System.out.println("\n=== 문자형 ===");
        System.out.println("char: " + charVar);
        System.out.println("한글: " + koreanChar);

        boolean isJavaFun = true;
        boolean isHard = false;

        System.out.println("\n=== 논리형 ===");
        System.out.println("isJavaFun: " + isJavaFun);
        System.out.println("isHard: " + isHard);
    }
}
