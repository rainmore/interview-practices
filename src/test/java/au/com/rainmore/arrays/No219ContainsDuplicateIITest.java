package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class No219ContainsDuplicateIITest {

    private No219ContainsDuplicateII test = new No219ContainsDuplicateII();

    @Test
    void test1() {
        int[] data = new int[]{1,2,3,1};
        int k = 3;
        assertTrue(test.containsNearbyDuplicate(data, k));
    }

    @Test
    void test2() {
        int[] data = new int[]{1,0,1,1};
        int k = 1;
        assertTrue(test.containsNearbyDuplicate(data, k));
    }

    @Test
    void test3() {
        int[] data = new int[]{1,2,3,1,2,3};
        int k = 2;
        assertFalse(test.containsNearbyDuplicate(data, k));
    }

}
