package tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskThree {
    public static void main(String[] args) {
        String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy but I wasn’t really happy";
        List<String> wordsList = new ArrayList<>(List.of(sentence.split(" ")));

        Map<String, Integer> wordsCountMap = new HashMap<>();
        for (String word : wordsList) {
            wordsCountMap.put(word, wordsCountMap.getOrDefault(word, 0) + 1);
        }

        List<String> uniqueWords = new ArrayList<>();
        for (String word : wordsList) {
            if (wordsCountMap.get(word) == 1) {
                uniqueWords.add(word);
            }
        }

        System.out.println("Words List: " + wordsList);
        System.out.println("Words Map: " + wordsCountMap);
        System.out.println("Unique Words: " + uniqueWords);
    }
}
