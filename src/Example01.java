public class Example01 {
    public static void main(String[] args) {
//        int x = 0;
//        int y = 10;
//
//        System.out.println("x % y = " + (x % y));
//        System.out.println("x / y = " + (x / y));
//
//        int num = 12345;
//        System.out.println("1의자리: " + (num % 10));
//        System.out.println("10의자리: " + ((num / 10) % 10));
//        System.out.println("100의자리: " + ((num / 100) % 10));
//        System.out.println("1000의자리: " + ((num / 1000) % 10));
//        System.out.println("10000의자리: " + ((num / 10000) % 10));
//
//        String age = "20";
//        System.out.println("Happy New year :: " + (age + 1));
//        System.out.println(x + y + " = x + y");
//
//        int x1 = 0;
//        int max = Integer.MAX_VALUE;
//        System.out.println(max);
//        System.out.println(max + 1);

        int a = 10;
        int b = 0;
//        System.out.println(a / b);  // ❌ ArithmeticException: / by zero
//        System.out.println(a % b);  // ❌ ArithmeticException: / by zero

        double x = 10.0;
        double y = 0.0;
        System.out.println(x / y);   // Infinity (무한대)
        System.out.println(-x / y);  // -Infinity (음의 무한대)
        System.out.println(0.0 / 0.0);  // NaN (Not a Number)
    }
}
