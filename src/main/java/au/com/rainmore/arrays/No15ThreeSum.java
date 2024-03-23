package au.com.rainmore.arrays;


import java.util.*;

/**
 * <a href="https://leetcode.com/problems/3sum/description/">
 * 15. 3Sum</a>
 */
public class No15ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int target = -nums[i];
                int left = i + 1;
                int right = nums.length - 1;

                while(left < right) {
                    if (nums[left] + nums[right] == target) {
                        List<Integer> tmp = new ArrayList<>();
                        tmp.add(nums[i]);
                        tmp.add(nums[left]);
                        tmp.add(nums[right]);

                        res.add(tmp);

                        while(left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        while(left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;
                    }
                    else if (nums[left] + nums[right] > target) {
                        right--;
                    }
                    else {
                        left++;
                    }
                }
            }
        }

        return res;
    }
}
