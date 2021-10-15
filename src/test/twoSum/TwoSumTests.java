package test.twoSum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import main.easy.twoSum.Solution;

class TwoSumTests {

    private final Solution solution = new Solution();

    @Test
    void twoSum1() {
//        Input: nums = [2,7,11,15], target = 9
//        [0,1]
        int[] nums = new int[]{2,7,11,15};
        int[] rtn = solution.twoSum(nums, 9);
        assertEquals(0, rtn[0]);
        assertEquals(1, rtn[1]);
    }

    @Test
    void twoSum2() {
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
        int[] nums = new int[]{3,2,4};
        int[] rtn = solution.twoSum(nums, 6);
        assertEquals(1, rtn[0]);
        assertEquals(2, rtn[1]);
    }

    @Test
    void twoSum3() {
//        Input: nums = [3,3], target = 6
//        Output: [0,1]
        int[] nums = new int[]{3,3};
        int[] rtn = solution.twoSum(nums, 6);
        assertEquals(0, rtn[0]);
        assertEquals(1, rtn[1]);
    }

}