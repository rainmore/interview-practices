package au.com.rainmore.datastructure.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class No978LongestTurbulentSubarrayTest {

    private No978LongestTurbulentSubarray test = new No978LongestTurbulentSubarray();

    @Test
    void test1() {
        int[] data = new int[]{9,4,2,10,7,8,8,1,9};
        int r = test.maxTurbulenceSize(data);

        assertEquals(5, r);
    }

    @Test
    void test2() {
        int[] data = new int[]{4,8,12,16};
        int r = test.maxTurbulenceSize(data);

        assertEquals(2, r);
    }

    @Test
    void test3() {
        int[] data = new int[]{100};
        int r = test.maxTurbulenceSize(data);

        assertEquals(1, r);
    }

    @Test
    void test4() {
        int[] data = new int[]{9, 9};
        int r = test.maxTurbulenceSize(data);

        assertEquals(1, r);
    }

}
