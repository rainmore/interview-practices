package au.com.rainmore.datastructure.heep;


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/kth-largest-element-in-a-stream/">
 * 703. Kth Largest Element in a Stream</a>
 */
public class No703KthLargestElementInAStream {

    private PriorityQueue<Integer> queue;
    private int k;

    public No703KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        List<Integer> l = new ArrayList<>();
        for (int i: nums) {
            l.add(i);
        }

        queue = new PriorityQueue<>();
        queue.addAll(l);

        if (k < nums.length) {
            int tmp = nums.length;
            while (tmp > k) {
                queue.poll();
                tmp--;
            }
        }
    }

    public int add(int val) {
        queue.add(val);
        if (queue.size() > k) {
            queue.poll();
        }
        return queue.peek();
    }


}
