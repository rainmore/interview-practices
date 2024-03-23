package au.com.rainmore.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No424LongestRepeatingCharacterReplacementTest {

    private No424LongestRepeatingCharacterReplacement test = new No424LongestRepeatingCharacterReplacement();

    @Test
    void test1() {
        String s = "ABAB";
        int k = 2;
        int r = test.characterReplacement(s, k);
        assertEquals(4, r);
    }

    @Test
    void test2() {
        String s = "AABABBA";
        int k = 1;
        int r = test.characterReplacement(s, k);
        assertEquals(4, r);
    }

}
