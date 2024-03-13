package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class No1TwoSumTest {

    private No1TwoSum test = new No1TwoSum();

    @Test
    void test1() {
        int[] data = new int[]{2,7,11,15};
        int target = 9;
        int[] r = test.twoSum(data, target);
        assertArrayEquals(new int[]{0,1}, r);
    }

    @Test
    void test2() {
        int[] data = new int[]{3,2,4};
        int target = 6;
        int[] r = test.twoSum(data, target);
        assertArrayEquals(new int[]{1,2}, r);
    }

    @Test
    void test3() {
        int[] data = new int[]{3,3};
        int target = 6;
        int[] r = test.twoSum(data, target);
        assertArrayEquals(new int[]{0,1}, r);
    }

}
