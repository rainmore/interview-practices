package au.com.rainmore.datastructure.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class No53MaximumSubarrayTest {

    private No53MaximumSubarray test = new No53MaximumSubarray();

    @Test
    void test1() {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int r = test.maxSubArray(nums);
        assertEquals(6, r);
    }

    @Test
    void test2() {
        int[] nums = new int[]{1};
        int r = test.maxSubArray(nums);
        assertEquals(1, r);
    }

    @Test
    void test3() {
        int[] nums = new int[]{5,4,-1,7,8};
        int r = test.maxSubArray(nums);
        assertEquals(23, r);
    }


}
