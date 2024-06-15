package au.com.rainmore.datastructure.linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No287FindTheDuplicateNumberTest {

    private No287FindTheDuplicateNumber test = new No287FindTheDuplicateNumber();

    @Test
    void test1() {
        int[] nums = new int[]{1,3,4,2,2};
        int r = test.findDuplicate(nums);
       assertEquals(2, r);
    }

    @Test
    void test2() {
        int[] nums = new int[]{3,1,3,4,2};
        int r = test.findDuplicate(nums);
       assertEquals(3, r);
    }

    @Test
    void test3() {
        int[] nums = new int[]{3,3,3,3,3};
        int r = test.findDuplicate(nums);
       assertEquals(3, r);
    }

}
