package au.com.rainmore.arrays;

import au.com.rainmore.arrays.No303RangeSumQueryImmutable.NumArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No303RangeSumQueryImmutableTest {

    @Test
    void test1() {
        NumArray test = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        int r1 = test.sumRange(0, 2);
        assertEquals(1, r1);
        int r2 = test.sumRange(2, 5);
        assertEquals(-1, r2);
        int r3 = test.sumRange(0, 5);
        assertEquals(-3, r3);
    }

}
