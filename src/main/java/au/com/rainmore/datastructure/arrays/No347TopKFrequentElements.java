package au.com.rainmore.datastructure.arrays;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/top-k-frequent-elements/description/">
 * 347. Top K Frequent Elements</a>
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class No347TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        int[] r = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        @SuppressWarnings("unchecked")
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for (int i: nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            int freq = e.getValue();
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(e.getKey());
        }

        int index = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            if (bucket[i] != null) {
               for(int v : bucket[i]) {
                   r[index] = v;
                   index++;
                   if (index == k) return r;
               }
            }
        }
        return r;
    }

}
