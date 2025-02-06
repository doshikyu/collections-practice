package tasks;

import java.util.*;

public class TaskThree {
    public static void main(String[] args) {
        String sentence = "I felt happy because I saw the others were happy and because I knew I should feel happy but I wasn’t really happy";
        List<String> wordsList = new ArrayList<>(List.of(sentence.split(" ")));

        HashSet<String> uniqueWords = new HashSet<>(wordsList);

        System.out.println("Words List: " + wordsList);
        System.out.println("Unique Words: " + uniqueWords);
    }
}
