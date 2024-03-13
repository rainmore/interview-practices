package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class No217ContainsDuplicateTest {

    private No217ContainsDuplicate test = new No217ContainsDuplicate();

    @Test
    void test1() {
        int[] data = new int[]{1,2,3,1};
        assertTrue(test.containsDuplicate(data));
    }

    @Test
    void test2() {
        int[] data = new int[]{1,2,3,4};
        assertFalse(test.containsDuplicate(data));
    }

    @Test
    void test3() {
        int[] data = new int[]{1,1,1,3,3,4,3,2,4,2};
        assertTrue(test.containsDuplicate(data));
    }

}
