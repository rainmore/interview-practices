package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No215KthLargestElementsInAnArrayTest {

    private No215KthLargestElementsInAnArray test = new No215KthLargestElementsInAnArray();

    @Test
    void test1() {
        int[] data = new int[]{3,2,1,5,6,4};
        int r = test.findKthLargest(data, 2);
        assertEquals(5, r);
    }

    @Test
    void test2() {
        int[] data = new int[]{3,2,3,1,2,4,5,5,6};
        int r = test.findKthLargest(data, 4);
        assertEquals(4, r);
    }

}
