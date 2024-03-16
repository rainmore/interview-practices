package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class No347TopKFrequentElementsTest {

    private No347TopKFrequentElements test = new No347TopKFrequentElements();

    @Test
    void test1() {
        int[] s = {1,1,1,2,2,3};
        int k = 2;

        int[] r = test.topKFrequent(s, k);

        assertArrayEquals(new int[]{1,2}, r);
    }

    @Test
    void test2() {
        int[] s = {1};
        int k = 1;

        int[] r = test.topKFrequent(s, k);

        assertArrayEquals(new int[]{1}, r);
    }

}
