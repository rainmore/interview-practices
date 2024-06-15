package au.com.rainmore.datastructure.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No875KokoEatingBananasTest {

    private No875KokoEatingBananas test = new No875KokoEatingBananas();

    @Test
    void test1() {
        int[] data = new int[]{3,6,7,11};
        int h = 8;

        int r = test.minEatingSpeed(data, h);
        assertEquals(4, r);
    }

    @Test
    void test2() {
        int[] data = new int[]{30,11,23,4,20};
        int h = 5;

        int r = test.minEatingSpeed(data, h);
        assertEquals(30, r);
    }

    @Test
    void test3() {
        int[] data = new int[]{30,11,23,4,20};
        int h = 6;

        int r = test.minEatingSpeed(data, h);
        assertEquals(23, r);
    }

    @Test
    void test4() {
        int[] data = new int[]{805306368,805306368,805306368};
        int h = 1000000000;

        int r = test.minEatingSpeed(data, h);
        assertEquals(3, r);
    }

}
