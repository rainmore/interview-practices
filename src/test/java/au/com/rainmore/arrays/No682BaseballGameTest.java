package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No682BaseballGameTest {

    private Logger logger = LoggerFactory.getLogger(No682BaseballGameTest.class);

    private No682BaseballGame test = new No682BaseballGame();

    @Test
    void test1() {
        String[] t1 = new String[]{"5", "2", "C", "D", "+"};
        int r = test.calPoints(t1);
        assertEquals(30, r);
    }

    @Test
    void test2() {
        String[] t1 = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};
        int r = test.calPoints(t1);
        assertEquals(27, r);
    }

    @Test
    void test3() {
        String[] t1 = new String[]{"1", "C"};
        int r = test.calPoints(t1);
        assertEquals(0, r);
    }


}
