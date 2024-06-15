package au.com.rainmore.datastructure.arrays;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class No20ValidParenthesesTest {

    private Logger logger = LoggerFactory.getLogger(No20ValidParenthesesTest.class);

    private No20ValidParentheses test = new No20ValidParentheses();

    @Test
    void test1() {
        String t1 = "()";
        assertTrue(test.isValid(t1));
    }

    @Test
    void test2() {
        String t1 = "()[]{}";
        assertTrue(test.isValid(t1));
    }

    @Test
    void test3() {
        String t1 = "(]";
        assertFalse(test.isValid(t1));
    }

    @Test
    void test4() {
        String t1 = "{[]}";
        assertTrue(test.isValid(t1));
    }

    @Test
    void test5() {
        String t1 = "([)]";
        assertFalse(test.isValid(t1));
    }

    @Test
    void test6() {
        String t1 = "]";
        assertFalse(test.isValid(t1));
    }
}
