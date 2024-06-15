package au.com.rainmore.datastructure.arrays;


import java.util.*;

/**
 * <a href="https://leetcode.com/problems/product-of-array-except-self/description/">
 * 238. Product of Array Except Self</a>
 * Time O (n)
 * Space O (n)
 */
public class No238GroupAnagrams {

    public int[] productExceptSelf(int[] nums) {

        int[] pre = new int[nums.length];
        int left = 1;
        int right = 1;

        for (int i = 0 ; i < nums.length ; i++) {
            pre[i] = left;
            left *= nums[i];
        }

        for (int i = nums.length -1; i >=0 ; i--) {
            pre[i] *= right;
            right *= nums[i];
        }

        return pre;
    }

}
