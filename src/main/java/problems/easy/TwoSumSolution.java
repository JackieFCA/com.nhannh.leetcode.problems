package problems.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSumSolution {

    public int[] twoSumOnePassHashMapTable(int[] nums, int target) {
        if (this.validate(nums, target)) {
            return new int[]{};
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < Math.pow(10, -9) || nums[i] > Math.pow(10, 9)) {
                return new int[]{};
            }

            int a = target - nums[i];
            if (map.containsKey(a)) {
                return new int[]{map.get(a), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public int[] twoSumWith2Loops(int[] nums, int target) {
        if (this.validate(nums, target)) {
            return new int[]{};
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < Math.pow(10, -9) || nums[i] > Math.pow(10, 9)) {
                    return new int[]{};
                }

                if (nums[j] == target - nums[i]) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[]{};
    }

    private boolean validate(int[] nums, int target) {
        return (nums.length < 2 || nums.length > Math.pow(10, 4)
                || target < Math.pow(10, -9) || target > Math.pow(10, 9)) ? true : false;
    }
}