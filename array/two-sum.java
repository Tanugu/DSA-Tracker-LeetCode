// Problem: Two Sum
// Link: https://leetcode.com/problems/two-sum/
// Approach: Brute Force
// Time Complexity: O(n^2)
// Space Complexity: O(1)

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}



// Problem: Two Sum (Optimal Approach)
// Link: https://leetcode.com/problems/two-sum/
// Approach: HashMap to store complement
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;

public class TwoSumOptimal {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        return new int[] {};
    }
}

