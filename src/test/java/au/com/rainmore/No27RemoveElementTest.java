package au.com.rainmore;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class No27RemoveElementTest {

    private Logger logger = LoggerFactory.getLogger(No27RemoveElementTest.class);


    private No27RemoveElement test = new No27RemoveElement();

    @Test
    void test1() {

        int[] nums = new int[]{3,2,2,3};
        int val = 3;

        int r = test.removeElement(nums, val);

        assertEquals(2, r);
        assertArrayEquals(new int[]{2, 2, 2, 3}, nums);
    }

    @Test
    void test2() {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;

        int r = test.removeElement(nums, val);

        assertEquals(5, r);
        assertArrayEquals(new int[]{0,1,3,0,4,0,4,2}, nums);
    }

}
