package tasks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TaskTwo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(7, 2, 2, 8, 5, 3, 6, 1, 2, 4, 1, 4, 5, 7, 8));

        Collections.sort(nums);
        System.out.println(nums);

        int prevNum = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;
            }
        }
    }
}
