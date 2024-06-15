package au.com.rainmore.datastructure.bits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class No338CountingBitsTest {

    private No338CountingBits test = new No338CountingBits();

    @Test
    void test1() {
        int data = 2;
        int[] r = test.countBits(data);

        assertArrayEquals(new int[]{0,1,1}, r);
    }

    @Test
    void test2() {
        int data = 5;
        int[] r = test.countBits(data);

        assertArrayEquals(new int[]{0,1,1,2,1,2}, r);
    }

}
