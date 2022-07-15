package problems.easy.twosum;

public class TwoSumWith2Loops {

    public int[] twoSum(int[] nums, int target) {
        // validation step
        if (nums.length < 2 || nums.length > Math.pow(10, 4) || target < Math.pow(10, -9) || target > Math.pow(10, 9)) {
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
}
