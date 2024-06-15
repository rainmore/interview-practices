package au.com.rainmore.datastructure.arrays;


/**
 * <a href="https://leetcode.com/problems/sort-colors/">
 * 75. Sort Colors</a>
 */
public class No75SortColors {

    public void sortColors(int[] nums) {
        int[] bucket = new int[]{0, 0, 0};

        for (int i : nums) {
            bucket[i] += 1;
        }

        int c = 0;
        for (int i = 0; i < bucket.length; i++) {
            for (int j = 0; j < bucket[i]; j++) {
                nums[c] = i;
                c++;
            }
        }
    }

}
