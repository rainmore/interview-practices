package au.com.rainmore.datastructure.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class No912SortAnArrayTest {

    private No912SortAnArray test = new No912SortAnArray();

    @Test
    void test1() {
        int[] t = new int[]{1,3,4,6};
        int[] r = test.sortArray(t);
        assertArrayEquals(new int[]{1,3,4,6}, r);
    }

}
