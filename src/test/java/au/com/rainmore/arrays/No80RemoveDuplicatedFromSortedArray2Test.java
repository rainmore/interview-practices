package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class No80RemoveDuplicatedFromSortedArray2Test {

    private Logger logger = LoggerFactory.getLogger(No80RemoveDuplicatedFromSortedArray2Test.class);


    private No80RemoveDuplicatedFromSortedArray2 test = new No80RemoveDuplicatedFromSortedArray2();

    @Test
    void test1() {

        int[] nums = new int[]{1,1,1,2,2,3};
        int r = test.removeDuplicates(nums);

        assertArrayEquals(new int[]{1,1,2,2,3,3}, nums);
        assertEquals(5, r);
    }

    @Test
    void test2() {
        int[] nums = new int[]{0,0,1,1,1,1,2,3,3};
        int r = test.removeDuplicates(nums);

        assertArrayEquals(new int[]{0,0,1,1,2,3,3,3,3}, nums);
        assertEquals(7, r);
    }

}
