package au.com.rainmore.dynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No1143LongestCommonSubsequenceTest {

    private No1143LongestCommonSubsequence test = new No1143LongestCommonSubsequence();

    @Test
    void test1() {

        String t1 = "abcde";
        String t2 = "ace";

        int r = test.longestCommonSubsequence(t1, t2);

        assertEquals(3, r);
    }

    @Test
    void test2() {

        String t1 = "abc";
        String t2 = "abc";

        int r = test.longestCommonSubsequence(t1, t2);

        assertEquals(3, r);
    }

    @Test
    void test3() {

        String t1 = "abc";
        String t2 = "def";

        int r = test.longestCommonSubsequence(t1, t2);

        assertEquals(0, r);
    }

    @Test
    void test4() {

        String t1 = "ezupkr";
        String t2 = "ubmrapg";

        int r = test.longestCommonSubsequence(t1, t2);

        assertEquals(2, r);
    }

    @Test
    void test5() {

        String t1 = "bsbininm";
        String t2 = "jmjkbkjkv";

        int r = test.longestCommonSubsequence(t1, t2);

        assertEquals(1, r);
    }

    @Test
    void test6() {

        String t1 = "oxcpqrsvwf";
        String t2 = "shmtulqrypy";

        int r = test.longestCommonSubsequence(t1, t2);

        assertEquals(2, r);
    }



}
