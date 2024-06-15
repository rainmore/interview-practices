package au.com.rainmore.datastructure.extra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FactorialTest {

    private Factorial test = new Factorial();

    @Test
    void test1() {
        int n = 5;
        assertEquals(120, test.factorial(n));
    }

    @Test
    void test2() {
        int n = 5;
        assertEquals(120, test.factorial1(n));
    }

}
