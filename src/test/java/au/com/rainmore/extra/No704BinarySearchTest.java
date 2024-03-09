package au.com.rainmore.extra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No704BinarySearchTest {

    private No704BinarySearch test = new No704BinarySearch();


    @Test
    void test1() {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 9;

        int r = test.search(nums, target);
        assertEquals(4, r);
    }

    @Test
    void test2() {
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 2;

        int r = test.search(nums, target);
        assertEquals(-1, r);
    }

}
