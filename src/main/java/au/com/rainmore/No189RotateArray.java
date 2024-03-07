package au.com.rainmore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/rotate-array/?envType=study-plan-v2&envId=top-interview-150">
 *     189. Rotate Array</a>
 *
 *
 *
 */
public class No189RotateArray {

    private Logger logger = LoggerFactory.getLogger(No189RotateArray.class);

    private int c = 0;

    /**
     * Divide the array into two parts,
     * one ranging from 0 to n-k-1 and the other ranging from n-k to n-1.
     * Afterward, reverse the first and second parts of the array and
     * finally reverse the entire array to obtain the result
     *
     *
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public void rotate(int[] nums, int k) {
        c = 0;
        // find reminder of k divided by nums.length because k is more than `nums.length`
        // not need to repeat the same steps
        k %= nums.length;
        logger.info("Reverse entire array {}", k);
        reverse(nums, 0, nums.length - 1);
        logger.info("Counter: {}", c);
        logger.info("Reverse first k elements");
        reverse(nums, 0, k - 1);
        logger.info("Counter: {}", c);
        logger.info("Reverse remaining elements");
        reverse(nums, k, nums.length - 1);
        logger.info("Counter: {}", c);
    }

    /**
     *
     * Time complexity: O(n * k)
     * Space complexity: O(1)
     */
    public void rotateRight(int[] nums, int k) {
        c = 0;
        // find reminder of k divided by nums.length because k is more than `nums.length`
        // not need to repeat the same steps
        k %= nums.length;

        int numIndex = nums.length - 1;

        for(int i = 0; i < k; i++) {
            int last = nums[numIndex];

            for (int j = numIndex; j > 0; j--) {
                nums[j] = nums[j - 1];
                c++;
            }
            nums[0] = last;
        }

        logger.info("Counter: {}", c);
    }

    /**
     *
     * Time complexity: O(n * k)
     * Space complexity: O(1)
     */
    public void rotateLeft(int[] nums, int k) {
        c = 0;
        // find reminder of k divided by nums.length because k is more than `nums.length`
        // not need to repeat the same steps
        k %= nums.length;

        int numIndex = nums.length - 1;
        // [1,2,3,4,5,6,7]
        // [2,3,4,5,6,7,1]

        for(int i = 0; i < k; i++) {
            int first = nums[0];

            for (int j = 0; j > numIndex; j++) {
                nums[j] = nums[j + 1];
                c++;
            }
            nums[0] = first;
        }

        logger.info("Counter: {}", c);
    }

    private void reverse(int[] nums, int from, int to) {
        logger.info("Start = from: {}, to: {}, nums: {}", from, to, nums);
        while(from < to) {
            swap(nums, from, to);
//            logger.info("from: {}, to: {}, nums: {}", from, to, nums);
            from++;
            to--;
        }
        logger.info("Result = from: {}, to: {}, nums: {}", from, to, nums);
    }

    private void swap(int[] nums, int from, int to) {
        int tmp = nums[from];
        nums[from] = nums[to];
        nums[to] = tmp;
        c++;
    }

}
