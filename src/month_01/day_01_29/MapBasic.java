package month_01.day_01_29;

import java.util.HashMap;
import java.util.Map;

public class MapBasic {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();


        scores.put("홍길동", 85);
        scores.put("김영희", 92);
        scores.put("이철수", 78);
        scores.put("박지민", 95);

        System.out.println("=== 성적표 ===");
        System.out.println(scores);

        System.out.printf("\n홍길동 점수: %d\n", scores.get("홍길동"));
        System.out.printf("없는 학생: %d\n", scores.get("없음"));

        System.out.printf("기본값: %d\n", scores.getOrDefault("없음", 0));

        scores.put("홍길동", 90);
        System.out.printf("\n수정 후 홍길동: %d\n", scores.get("홍길동"));

        scores.remove("이철수");

        System.out.printf("\n김영희 존재? %b\n", scores.containsKey("김영희"));
        System.out.printf("95점 존재? %b\n", scores.containsValue(95));

        System.out.println("\n=== 순회 방법 ===");

        System.out.println("keySet:");
        for (String key : scores.keySet()) {
            System.out.printf("%s = %d\n", key, scores.get(key));
        }

        System.out.println("\nentrySet:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.printf("%s = %d\n", entry.getKey(), entry.getValue());
        }

        System.out.println("\nforEach:");
        scores.forEach((k, v) -> System.out.printf("%s = %d\n", k, v));
    }
}
