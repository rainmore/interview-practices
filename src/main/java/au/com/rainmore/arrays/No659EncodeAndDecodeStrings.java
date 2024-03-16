package au.com.rainmore.arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/encode-and-decode-strings/description/">
 * 659. Encode And Decode Strings</a>
 *
 * Time O(n)
 * Space 0 (n)
 */

public class No659EncodeAndDecodeStrings {

    private static Character CODE = '#';

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length());
            sb.append(CODE);
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String strs) {
        List<String> result = new ArrayList<>();
        int idx = 0;
        while (idx < strs.length()) {
            int j = idx;
            while (strs.charAt(j) != CODE) j++;
            int length = Integer.parseInt(strs.substring(idx, j));
            idx = j + 1 + length;
            result.add(strs.substring(j + 1, idx));
        }
        return result;
    }
}
