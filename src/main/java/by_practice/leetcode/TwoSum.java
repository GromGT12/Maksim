package by_practice.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

        public int[] twoSum ( int[] nums, int target){
            if (nums == null && nums.length < 2)
                return null;


            Map<Integer, Integer> indexByValue = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                int current = target - nums[i];
                if (indexByValue.get(current) != null) {
                    return new int[]{i, indexByValue.get(current)};
                }
                indexByValue.put(nums[i], i);
            }
            return null;
        }
    }

