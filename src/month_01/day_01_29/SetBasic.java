package month_01.day_01_29;

import java.util.*;

public class SetBasic {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("바나나");
        hashSet.add("사과");
        hashSet.add("오렌지");
        hashSet.add("사과");

        System.out.println("=== HashSet ===");
        System.out.println(hashSet);
        System.out.printf("크기: %d\n", hashSet.size());

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("바나나");
        treeSet.add("사과");
        treeSet.add("오렌지");

        System.out.println("\n=== TreeSet (정렬) ===");
        System.out.println(treeSet);

        System.out.println("\n=== 중복 제거 ===");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 1, 4, 5, 4);
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.printf("원본: %s\n", numbers);
        System.out.printf("중복 제거: %s\n", uniqueNumbers);

        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C"));
        Set<String> set2 = new HashSet<>(Arrays.asList("B", "C", "D"));

        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.printf("\n합집합: %s\n", union);

        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.printf("교집합: %s\n", intersection);

        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.printf("차집합: %s\n", difference);
    }
}


