package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No11ContainerWithMostWaterTest {

    private No11ContainerWithMostWater test = new No11ContainerWithMostWater();

    @Test
    void test1() {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};

        int r = test.maxArea(height);

        assertEquals(49, r);
    }

    @Test
    void test2() {
        int[] height = new int[]{1,1};

        int r = test.maxArea(height);

        assertEquals(1, r);
    }

}
