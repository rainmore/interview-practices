package au.com.rainmore.arrays;


import java.util.*;

/**
 * <a href="https://leetcode.com/problems/contains-duplicate/description/">
 * 217. Contains Duplicate</a>
 */
public class No217ContainsDuplicate {


    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i) && map.get(i) >= 1) {
                return true;
            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) return true;
        }
        return false;
    }

    public boolean containsDuplicate1(int[] nums) {
        Set<Integer> hash = new HashSet<>();
        for (int i: nums) {
            if (hash.contains(i)) return true;
            hash.add(i);
        }

        return false;
    }

}
