public class Example01 {
    public static void main(String[] args) {
        byte b = 127;
        short s = 32767;
        int i = 2147483647;
        long l = 9223372036854775807L;  // L 접미사 필수
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        char c = 'A';
        char unicode = '\u0041';
        System.out.println(c);
        System.out.println(unicode);

        int[] array = {1, 2, 3, 4};
        System.out.println(array);

        double fi = 3.141596579843249863;
        int f = (int) fi;
        System.out.printf("fi: %f\nf: %d", fi, f);
    }
}
