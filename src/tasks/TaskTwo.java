package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskTwo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(7, 8, 5, 3, 6, 1, 2, 4, 1, 4, 5, 7, 8));
        List<Integer> sortedEvenNums = new ArrayList<>();

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0 && !sortedEvenNums.contains(nums.get(i))) {
                sortedEvenNums.add(nums.get(i));
            }
        }
        Collections.sort(sortedEvenNums);

        System.out.println("nums: " + nums);
        System.out.println("sorted even nums: " + sortedEvenNums);
    }
}
