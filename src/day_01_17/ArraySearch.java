package day_01_17;

public class ArraySearch {
    public static void main(String[] args) {
        String[] students = {"홍길동", "김영희", "이철수", "박지민", "최수현"};

        String target = "이철수";
        int index = -1;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(target)) {
                index = i;
                break;
            }
        }

        System.out.println("=== 학생 검색 ===");
        if (index != -1) {
            System.out.println("✅ " + target + "은(는) " + (index + 1) + "번째입니다.");
        } else {
            System.out.println("❌ " + target + "을(를) 찾지 못했습니다.");
        }

        System.out.println("\n=== 학생 목록 ===");
        for (int i = 0; i < students.length; i++) {
            String marker = (i == index) ? " 👈" : "";
            System.out.println((i + 1) + ". " + students[i] + marker);
        }
    }
}
