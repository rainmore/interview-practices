package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class No238GroupAnagramsTest {

    private No238GroupAnagrams test = new No238GroupAnagrams();

    @Test
    void test1() {
        int[] nums = {1,2,3,4};

        int[] r = test.productExceptSelf(nums);

        assertArrayEquals(new int[]{24,12,8,6}, r);
    }

    @Test
    void test2() {
        int[] nums = {-1,1,0,-3,3};

        int[] r = test.productExceptSelf(nums);

        assertArrayEquals(new int[]{0,0,9,0,0}, r);
    }

}
