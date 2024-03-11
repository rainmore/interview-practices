package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class No75SortColorsTest {

    private No75SortColors test = new No75SortColors();

    @Test
    void test1() {
        int[] data = new int[]{2,0,2,1,1,0};
        test.sortColors(data);
        assertArrayEquals(new int[]{0,0,1,1,2,2}, data);
    }

    @Test
    void test2() {
        int[] data = new int[]{2,0,1};
        test.sortColors(data);
        assertArrayEquals(new int[]{0,1,2}, data);
    }

}
