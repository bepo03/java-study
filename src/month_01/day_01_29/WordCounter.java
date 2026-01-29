package month_01.day_01_29;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String text = "Java is great Java is powerful Java is everywhere";

        String[] words = text.toLowerCase().split(" ");

        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("=== 단어 빈도수 ===");
        wordCount.forEach((word, count) ->
                System.out.printf("%s: %d회\n", word, count));

        String maxWord = "";
        int maxCount = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
        }

        System.out.printf("\n가장 많이 나온 단어: %s (%d회)\n", maxWord, maxCount);
    }
}
