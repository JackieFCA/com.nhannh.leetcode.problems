package problems.easy.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // validation step
        if (nums.length < 2 || nums.length > Math.pow(10, 4) || target < Math.pow(10, -9) || target > Math.pow(10, 9)) {
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // validation element
            if (nums[i] < Math.pow(10, -9) || nums[i] > Math.pow(10, 9)) {
                return null;
            }

            int a = target - nums[i];
            if (map.containsKey(a)) {
                return new int[] {map.get(a), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}