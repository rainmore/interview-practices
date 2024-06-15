package au.com.rainmore.datastructure.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No209MinimumSizeSubarraySumTest {

    private No209MinimumSizeSubarraySum test = new No209MinimumSizeSubarraySum();

    @Test
    void test1() {
        int target = 7;
        int[] nums = new int[]{2,3,1,2,4,3};
        int r = test.minSubArrayLen(target, nums);
        assertEquals(2, r);
    }

    @Test
    void test2() {
        int target = 4;
        int[] nums = new int[]{1,4,4};
        int r = test.minSubArrayLen(target, nums);
        assertEquals(1, r);
    }

}
