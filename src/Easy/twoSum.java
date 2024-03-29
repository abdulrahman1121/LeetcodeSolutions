package Easy;

import java.util.HashMap;

public class twoSum {

    // This is brute force solution, quadratic time complexity(n^2).
    int[] ans(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }

    // Optimized solution using hashmap
    int[] ans2(int[] nums, int target) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }
        return nums;
    }

    //  nums = [2,7,11,15], target = 9
    //Output: [0,1]
    // we want to put the elements in array as the keys and their values == their indices.
    // first key will be 2 -> 0
}
