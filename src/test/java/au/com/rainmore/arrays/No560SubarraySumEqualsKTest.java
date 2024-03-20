package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No560SubarraySumEqualsKTest {

    private No560SubarraySumEqualsK test = new No560SubarraySumEqualsK();

    @Test
    void test1() {
        int[] nums = new int[]{1,1,1};
        int k = 2;

        int r = test.subarraySum(nums, k);

        assertEquals(2, r);
    }

    @Test
    void test2() {
        int[] nums = new int[]{1,2,3};
        int k = 3;

        int r = test.subarraySum(nums, k);

        assertEquals(2, r);
    }

    @Test
    void test3() {
        int[] nums = new int[]{1,2,1,2,1};
        int k = 3;

        int r = test.subarraySum(nums, k);

        assertEquals(4, r);
    }

}
