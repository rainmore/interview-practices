package au.com.rainmore.arrays;


import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/description/">
 * 3. Longest Substring Without Repeating Characters</a>
 */
public class No3LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        List<Character> window = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            while (window.contains(s.charAt(i))) {
                int index = window.indexOf(s.charAt(i));
                window.remove(index);
                if(index > 0)
                    window.subList(0, index).clear();
            }
            window.add(s.charAt(i));
            length = Math.max(length, window.size());
        }

        return length;
    }
}
