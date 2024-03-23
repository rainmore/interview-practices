package au.com.rainmore.arrays;


import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/contains-duplicate-ii/description/">
 * 219. Contains Duplicate II</a>
 *
 * Time: O(n)
 * Space: O(k)
 */
public class No219ContainsDuplicateII {


    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i - l > k) {
                window.remove(nums[l]);
                l++;
            }
            if (window.contains(nums[i])) {
                return true;
            }
            window.add(nums[i]);
        }

        return false;
    }

}
