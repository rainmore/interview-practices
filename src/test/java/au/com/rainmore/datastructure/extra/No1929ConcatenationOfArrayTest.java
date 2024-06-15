package au.com.rainmore.datastructure.extra;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class No1929ConcatenationOfArrayTest {

    private Logger logger = LoggerFactory.getLogger(No1929ConcatenationOfArrayTest.class);

    private No1929ConcatenationOfArray test = new No1929ConcatenationOfArray();

    @Test
    void test1() {
        int[] t1 = new int[]{1,2,1};
        int[] r = test.getConcatenation(t1);
        assertArrayEquals(new int[]{1,2,1,1,2,1}, r);
    }

    @Test
    void test2() {
        int[] t1 = new int[]{1,3,2,1};
        int[] r = test.getConcatenation(t1);
        assertArrayEquals(new int[]{1,3,2,1,1,3,2,1}, r);
    }

}
