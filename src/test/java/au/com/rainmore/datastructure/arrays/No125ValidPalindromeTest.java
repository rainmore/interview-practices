package au.com.rainmore.datastructure.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class No125ValidPalindromeTest {

    private No125ValidPalindrome test = new No125ValidPalindrome();


    @Test
    void test1() {
        String s = "A man, a plan, a canal: Panama";

        boolean r = test.isPalindrome(s);

        assertTrue(r);
    }

    @Test
    void test2() {
        String s = "race a car";

        boolean r = test.isPalindrome(s);

        assertFalse(r);
    }

    @Test
    void test3() {
        String s = " ";

        boolean r = test.isPalindrome(s);

        assertTrue(r);
    }

}
