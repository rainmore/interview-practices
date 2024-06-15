package au.com.rainmore.datastructure.arrays;


import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/combination-sum/description/">
 * 39. Combination Sum</a>
 */
public class No39CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(candidates, target, list, new ArrayList<>(), 0);
        return list;
    }

    private void backtrack(int[] candidates,
                           int target,
                           List<List<Integer>> list,
                           List<Integer> current,
                           int index) {
        if (target == 0) {
            list.add(new ArrayList<>(current));
        }
        else if (target < 0 || index >= candidates.length) {
            return;
        }
        else {
            current.add(candidates[index]);
            backtrack(candidates, target - candidates[index], list, current, index);

            current.remove(current.get(current.size() - 1));
            backtrack(candidates, target, list, current, index + 1);
        }
    }


}
