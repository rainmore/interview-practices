package au.com.rainmore.datastructure.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No128LongestConsecutiveSequenceTest {

    private No128LongestConsecutiveSequence test = new No128LongestConsecutiveSequence();

    @Test
    void test1() {
        int[] nums = {100,4,200,1,3,2};
        int expected = 4;
        int r = test.longestConsecutive(nums);

        assertEquals(expected, r);
    }

    @Test
    void test2() {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int expected = 9;
        int r = test.longestConsecutive(nums);

        assertEquals(expected, r);
    }

}
