package month_01.day_01_28;

import java.util.ArrayList;

public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("사과");
        fruits.add("바나나");
        fruits.add("오렌지");
        fruits.add(1, "포도");

        System.out.println("=== 과일 목록 ===");
        System.out.println(fruits);
        System.out.printf("크기: %d\n", fruits.size());

        System.out.printf("\n첫 번째: %s\n", fruits.get(0));
        System.out.printf("마지막: %s\n", fruits.get(fruits.size() - 1));

        fruits.set(0, "청사과");
        System.out.printf("\n수정 후: %s\n", fruits);

        System.out.printf("\n바나나 포함? %b\n", fruits.contains("바나나"));
        System.out.printf("\n바나나 위치: %d\n", fruits.indexOf("바나나"));

        fruits.remove("포도");
        fruits.remove(0);
        System.out.printf("\n삭제 후: %s\n", fruits);

        System.out.println("\n=== 순회 ===");
        for (String fruit : fruits) {
            System.out.printf("- %s\n", fruit);
        }
    }
}
