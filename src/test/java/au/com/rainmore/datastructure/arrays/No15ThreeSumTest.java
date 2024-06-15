package au.com.rainmore.datastructure.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class No15ThreeSumTest {

    private No15ThreeSum test = new No15ThreeSum();

    @Test
    void test1() {
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> r = test.threeSum(nums);
        assertEquals(2, r.size());

        assertIterableEquals(List.of(-1,-1,2), r.get(0));
        assertIterableEquals(List.of(-1,0,1), r.get(1));
    }

    @Test
    void test2() {
        int[] nums = {0,1,1};
        List<List<Integer>> r = test.threeSum(nums);
        assertIterableEquals(List.of(), r);
    }

    @Test
    void test3() {
        int[] nums = {0,0,0};
        List<List<Integer>> r = test.threeSum(nums);
        assertIterableEquals(List.of(List.of(0,0,0)), r);
    }


}
