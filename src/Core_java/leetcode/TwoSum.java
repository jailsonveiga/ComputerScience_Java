package Core_java.leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] result = twoSum(new int[]{5, 3, 4, 1}, 5);
        System.out.println(Arrays.toString(result));

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        throw new IllegalArgumentException("Nothing found");
    }
}
