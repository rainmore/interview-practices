package au.com.rainmore.extra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No509FibonacciNumberTest {

    private No509FibonacciNumber test = new No509FibonacciNumber();

    @Test
    void test1() {
        int r = test.fibonacci(1);
        assertEquals(1, r);
    }

    @Test
    void test0() {
        int r = test.fibonacci(0);
        assertEquals(0, r);
    }

    @Test
    void test2() {
        int r = test.fibonacci(2);
        assertEquals(1, r);
    }

    @Test
    void test3() {
        int r = test.fibonacci(3);
        // f(2) (f(1) + f(0)) + f(1)
        assertEquals(2, r);
    }

    @Test
    void test4() {
        int r = test.fibonacci(4);
        assertEquals(3, r);
    }

    @Test
    void test5() {
        int r = test.fibonacci(5);
        assertEquals(5, r);
    }

    @Test
    void test6() {
        int r = test.fibonacci(6);
        assertEquals(8, r);
    }
}
