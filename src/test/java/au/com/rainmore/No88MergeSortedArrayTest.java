package au.com.rainmore;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class No88MergeSortedArrayTest {

    private Logger logger = LoggerFactory.getLogger(No88MergeSortedArrayTest.class);

    private No88MergeSortedArray test = new No88MergeSortedArray();

    @Test
    void testMerge1() {

        int[] n1 = new int[]{1,2,3,0,0,0};
        int[] n2 = new int[]{2,5,6};
        logger.info("Before merging n1: {}, n2: {}", n1, n2);

        test.merge(n1, 3, n2, 3);
        logger.info("After merging n1: {}", n1);

        int[] expected = new int[]{1,2,2,3,5,6};
        assertArrayEquals(expected, n1);
    }

    @Test
    void testMerge2() {

        int[] n1 = new int[]{1};
        int[] n2 = new int[]{};
        logger.info("Before merging n1: {}, n2: {}", n1, n2);
        test.merge(n1, 1, n2, 0);
        logger.info("After merging n1: {}", n1);

        int[] expected = new int[]{1};
        assertArrayEquals(expected, n1);

    }

    @Test
    void testMerge3() {

        int[] n1 = new int[]{0};
        int[] n2 = new int[]{1};
        logger.info("Before merging n1: {}, n2: {}", n1, n2);
        test.merge(n1, 0, n2, 1);
        logger.info("After merging n1: {}", n1);

        int[] expected = new int[]{1};
        assertArrayEquals(expected, n1);
    }

}
