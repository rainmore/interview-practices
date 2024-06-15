package au.com.rainmore.datastructure.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/valid-palindrome/description/">
 * 125. Valid Palindrome</a>
 */
public class No125ValidPalindrome {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char start = s.charAt(left);
            char end = s.charAt(right);
            if (!Character.isLetterOrDigit(start)) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(end)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }


    public boolean isPalindrome1(String s) {
        s = s.toLowerCase();
        List<Character> chars = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                chars.add(s.charAt(i));
            }
        }

        int left = 0;
        int right = chars.size() - 1;
        for (int i = 0; i < chars.size(); i++) {
            if (chars.get(left) != chars.get(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
