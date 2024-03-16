package au.com.rainmore.arrays;


import java.util.*;

/**
 * <a href="https://leetcode.com/problems/valid-anagram/description/">
 * 242. Valid Anagram</a>
 */
public class No242ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] store = new int[26];

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int i : store) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }

}
