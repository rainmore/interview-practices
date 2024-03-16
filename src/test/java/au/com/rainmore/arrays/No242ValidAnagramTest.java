package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class No242ValidAnagramTest {

    private No242ValidAnagram test = new No242ValidAnagram();

    @Test
    void test1() {
        String s = "anagram";
        String t = "nagaram";

        boolean r = test.isAnagram(s, t);

        assertTrue(r);
    }

    @Test
    void test2() {
        String s = "rat";
        String t = "car";

        boolean r = test.isAnagram(s, t);

        assertFalse(r);
    }


}
