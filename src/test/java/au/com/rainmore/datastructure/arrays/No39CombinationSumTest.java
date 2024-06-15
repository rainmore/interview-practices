package au.com.rainmore.datastructure.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class No39CombinationSumTest {

    private No39CombinationSum test = new No39CombinationSum();

    @Test
    void test1() {
        int[] data = new int[]{2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> r = test.combinationSum(data, target);
        assertIterableEquals(List.of(2,2,3), r.get(0));
        assertIterableEquals(List.of(7), r.get(1));
    }

    @Test
    void test2() {
        int[] data = new int[]{2, 3, 5};
        int target = 8;
        List<List<Integer>> r = test.combinationSum(data, target);
        assertIterableEquals(List.of(2,2,2,2), r.get(0));
        assertIterableEquals(List.of(2,3,3), r.get(1));
        assertIterableEquals(List.of(3,5), r.get(2));
    }

    @Test
    void test3() {
        int[] data = new int[]{2};
        int target = 1;
        List<List<Integer>> r = test.combinationSum(data, target);
        assertTrue(r.isEmpty());
    }

    @Test
    void test4() {
        int[] data = new int[]{2};
        int target = 0;
        List<List<Integer>> r = test.combinationSum(data, target);
        assertEquals(1, r.size());
        assertTrue(r.get(0).isEmpty());
    }

}
