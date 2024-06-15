package au.com.rainmore.datastructure.arrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class No78SubsetsTest {

    private No78Subsets test = new No78Subsets();

    @Test
    void test1() {
        int[] data = new int[]{1,2,3};

        List<List<Integer>> r = test.subsets(data);

        assertFalse(r.isEmpty());
        assertEquals(8, r.size());

    }

    @Test
    void test2() {
        int[] data = new int[]{0};

        List<List<Integer>> r = test.subsets(data);

        assertFalse(r.isEmpty());
        assertEquals(2, r.size());
    }

}
