package au.com.rainmore;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class No169MajorityElementTest {

    private Logger logger = LoggerFactory.getLogger(No169MajorityElementTest.class);

    private No169MajorityElement test = new No169MajorityElement();

    @Test
    void testMajorityElement1() {
        int[] n1 = new int[]{3,2,3};
        logger.info("Given n1: {}", n1);
        int r = test.majorityElement(n1);

        assertEquals(3, r);
    }

    @Test
    void testMajorityElement2() {
        int[] n1 = new int[]{2,2,1,1,1,2,2};
        logger.info("Given n1: {}", n1);
        int r = test.majorityElement(n1);

        assertEquals(2, r);
    }
}
