package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No42TrappingRainWaterTest {

    private No42TrappingRainWater test = new No42TrappingRainWater();

    @Test
    void test1() {
        int[] height = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        int r = test.trap(height);

        assertEquals(6, r);
    }

    @Test
    void test2() {
        int[] height = new int[]{4,2,0,3,2,5};

        int r = test.trap(height);

        assertEquals(9, r);
    }

}
