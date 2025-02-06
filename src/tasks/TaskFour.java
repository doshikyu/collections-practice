package tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskFour {
    public static void main(String[] args) {
        List<String> wordsList = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        Map<String, Integer> wordsCountMap = new HashMap<>();
        for (String word : wordsList) {
            wordsCountMap.put(word, wordsCountMap.getOrDefault(word, 0) + 1);
        }

        System.out.println(wordsCountMap.values());
    }
}
