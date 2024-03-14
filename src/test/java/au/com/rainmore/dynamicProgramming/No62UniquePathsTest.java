package au.com.rainmore.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No62UniquePathsTest {

    private No62UniquePaths test = new No62UniquePaths();

    @Test
    void test1() {
        int m = 3;
        int n = 7;
        int r = test.uniquePaths(m, n);

        assertEquals(28, r);
    }

    @Test
    void test2() {
        int m = 3;
        int n = 2;
        int r = test.uniquePaths(m, n);

        assertEquals(3, r);
    }

    @Test
    void test3() {
        int m = 1;
        int n = 2;
        int r = test.uniquePaths(m, n);

        assertEquals(1, r);
    }

    @Test
    void test4() {
        int m = 2;
        int n = 1;
        int r = test.uniquePaths(m, n);

        assertEquals(1, r);
    }

}
