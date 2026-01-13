package day_01_12;

public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("=== 자동 형변환 ===");
        int intNum = 100;
        long longNum = intNum;
        float floatNum = longNum;
        double doubleNum = floatNum;

        System.out.println("int: " + intNum);
        System.out.println("long: " + longNum);
        System.out.println("float: " + floatNum);
        System.out.println("double: " + doubleNum);

        System.out.println("\n=== 강제 형변환 ===");
        double pi = 3.14159;
        int intPi = (int) pi;

        System.out.println("double pi: " + pi);
        System.out.println("int pi: " + intPi);

        int bigNumber = 1000;
        byte smallNumber = (byte) bigNumber;

        System.out.println("int: " + bigNumber);
        System.out.println("byte: " + smallNumber);

        System.out.println("\n=== char와 int 변환 ===");
        char ch = 'Z';
        int ascii = ch;

        System.out.println("'Z'의 ASCII: " + ascii);

        int code = 91;
        char letter = (char) code;

        System.out.println("91의 문자: " + letter);
    }
}
