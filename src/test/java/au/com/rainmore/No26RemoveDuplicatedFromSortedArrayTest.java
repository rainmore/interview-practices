package au.com.rainmore;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class No26RemoveDuplicatedFromSortedArrayTest {

    private Logger logger = LoggerFactory.getLogger(No26RemoveDuplicatedFromSortedArrayTest.class);


    private No26RemoveDuplicatedFromSortedArray test = new No26RemoveDuplicatedFromSortedArray();

    @Test
    void test1() {

        int[] nums = new int[]{1,1,2};
        int r = test.removeDuplicates(nums);

        assertEquals(2, r);
        assertArrayEquals(new int[]{1,2,2}, nums);
    }

    @Test
    void test2() {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int r = test.removeDuplicates(nums);

        assertEquals(5, r);
        assertArrayEquals(new int[]{0,1,2,3,4,2,2,3,3,4}, nums);
    }

}
