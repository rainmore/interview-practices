package au.com.rainmore.datastructure.arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.PriorityQueue;
import java.util.Random;

/**
 * <a href="https://leetcode.com/problems/kth-largest-element-in-an-array/">
 * 215. Kth Largest Element in an Array</a>
 */
public class No215KthLargestElementsInAnArray {

    private Logger logger = LoggerFactory.getLogger(No215KthLargestElementsInAnArray.class);


    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> data = new PriorityQueue<>(k + 1);
        for (int i : nums) {
            data.add(i);
            if (data.size() > k) data.poll();
        }
        return data.poll();
    }

    public int findKthLargest2(int[] nums, int k) {
        int left = 0, right = nums.length - 1;
        Random rand = new Random();
        while (true) {
            int pivot_index = left + rand.nextInt(right - left + 1);
            int new_pivot_index = partition(nums, left, right, pivot_index);
            if (new_pivot_index == nums.length - k) {
                return nums[new_pivot_index];
            } else if (new_pivot_index > nums.length - k) {
                right = new_pivot_index - 1;
            } else {
                left = new_pivot_index + 1;
            }
        }
    }

    private int partition(int[] nums, int left, int right, int pivot_index) {
        int pivot = nums[pivot_index];
        swap(nums, pivot_index, right);
        int stored_index = left;
        for (int i = left; i < right; i++) {
            if (nums[i] < pivot) {
                swap(nums, i, stored_index);
                stored_index++;
            }
        }
        swap(nums, right, stored_index);
        return stored_index;
    }

    public int findKthLargest1(int[] nums, int k) {
        int idx = nums.length - k;
        return quickSearch(nums, idx, 0, nums.length - 1);
    }

    private int quickSearch(int[] nums, int idx, int l, int r) {
        int p = l;
        int pivot = nums[r];

        for (int i = l; i <= r; i++) {
            if (nums[i] < pivot) {
                swap(nums, i, p);
                p++;
            }
        }

        swap(nums, r, p);

        if (p > idx) return quickSearch(nums, idx, l, p - 1);
        else if (p < idx) return quickSearch(nums, idx, p + 1, r);
        else return nums[p];
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
