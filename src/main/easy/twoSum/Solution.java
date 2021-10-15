package main.easy.twoSum;

import java.util.HashMap;
import java.util.Map;

public class Solution {
//    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//    You may assume that each input would have exactly one solution, and you may not use the same element twice.
//    You can return the answer in any order.
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            map.put(target-nums[i], i);
        }
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i]) && map.get(nums[i]) != i) {
                return new int[] {i, map.get(nums[i])};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}