package au.com.rainmore.datastructure.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class No1343NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThresholdTest {

    private No1343NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold test = new No1343NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold();

    @Test
    void test1() {
        int[] data = new int[]{2,2,2,2,5,5,5,8};
        int k = 3;
        int threshold = 4;
        assertEquals(3, test.numOfSubarrays(data, k, threshold));
    }

    @Test
    void test2() {
        int[] data = new int[]{11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        int threshold = 5;
        assertEquals(6, test.numOfSubarrays(data, k, threshold));
    }

}
