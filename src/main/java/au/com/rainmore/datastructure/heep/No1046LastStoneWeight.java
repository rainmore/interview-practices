package au.com.rainmore.datastructure.heep;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/last-stone-weight/">
 * 1046. Last Stone Weight</a>
 */
public class No1046LastStoneWeight {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) {
            maxHeap.add(i);
        }
        int l = 0;
        int r = 0;

        while (maxHeap.size() > 1) {
            l = maxHeap.poll();
            r = maxHeap.poll();

            if (l > r) {
                maxHeap.offer(l - r);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }

}
