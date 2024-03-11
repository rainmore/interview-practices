package au.com.rainmore.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/subsets/description/">
 * 78. Subsets</a>
 */
public class No78Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        List<Integer> subset = new ArrayList<>();
        sub(nums, 0, results, subset);

        return results;
    }

    private void sub(int[] nums, int idx, List<List<Integer>> results, List<Integer> subset) {
        List s1 = new ArrayList<>();
        if (idx == nums.length) {
            s1.addAll(subset);
            results.add(s1);
            return;
        }

        subset.add(nums[idx]);
        sub(nums, idx + 1, results, subset);

        subset.remove(subset.size() - 1);
        sub(nums, idx + 1, results, subset);
    }
}
