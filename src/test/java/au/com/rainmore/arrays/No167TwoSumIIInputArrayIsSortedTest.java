package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class No167TwoSumIIInputArrayIsSortedTest {

    private No167TwoSumIIInputArrayIsSorted test = new No167TwoSumIIInputArrayIsSorted();


    @Test
    void test1() {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        int[] r = test.twoSum(nums, target);

        assertArrayEquals(new int[]{1,2}, r);
    }

    @Test
    void test2() {
        int[] nums = new int[]{2,3,4};
        int target = 6;

        int[] r = test.twoSum(nums, target);

        assertArrayEquals(new int[]{1,3}, r);
    }

    @Test
    void test3() {
        int[] nums = new int[]{-1,0};
        int target = -1;

        int[] r = test.twoSum(nums, target);

        assertArrayEquals(new int[]{1,2}, r);
    }

}
