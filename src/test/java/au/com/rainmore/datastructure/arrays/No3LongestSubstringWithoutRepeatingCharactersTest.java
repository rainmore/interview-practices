package au.com.rainmore.datastructure.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class No3LongestSubstringWithoutRepeatingCharactersTest {

    private No3LongestSubstringWithoutRepeatingCharacters test = new No3LongestSubstringWithoutRepeatingCharacters();

    @Test
    void test1() {
        String s = "abcabcbb";
        int r = test.lengthOfLongestSubstring(s);
        assertEquals(3, r);
    }

    @Test
    void test2() {
        String s = "bbbbb";
        int r = test.lengthOfLongestSubstring(s);
        assertEquals(1, r);
    }

    @Test
    void test3() {
        String s = "pwwkew";
        int r = test.lengthOfLongestSubstring(s);
        assertEquals(3, r);
    }

}
