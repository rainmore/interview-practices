package au.com.rainmore.datastructure.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class No918MaximumSumCircularSubarrayTest {

    private No918MaximumSumCircularSubarray test = new No918MaximumSumCircularSubarray();

    @Test
    void test1() {
        int[] t = new int[]{1,-2,3,-2};
        int r = test.maxSubarraySumCircular(t);
        assertEquals(3, r);
    }

    @Test
    void test2() {
        int[] t = new int[]{5,-3,5};
        int r = test.maxSubarraySumCircular(t);
        assertEquals(10, r);
    }

    @Test
    void test3() {
        int[] t = new int[]{-3,-2,-3};
        int r = test.maxSubarraySumCircular(t);
        assertEquals(-2, r);
    }

}
