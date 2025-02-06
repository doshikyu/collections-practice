package tasks;

import java.util.ArrayList;
import java.util.List;

public class TaskOne {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

        List<Integer> oddNums = new ArrayList<>();
        for (int num : nums) {
            if (num % 2 == 1) {
                oddNums.add(num);
            }
        }
        System.out.println("nums: " + nums);
        System.out.println("odd nums: " + oddNums);
    }
}
