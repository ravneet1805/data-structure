// 5. Given an array and a target sum, find two indices such that their values add up to the target.


import java.util.*;

class TwoSum {
    static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{-1, -1}; // No solution found
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = findTwoSum(nums, target);
        System.out.println("Indices: " + indices[0] + ", " + indices[1]);
    }
}
