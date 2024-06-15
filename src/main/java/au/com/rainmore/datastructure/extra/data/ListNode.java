package au.com.rainmore.datastructure.extra.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    public int[] toArray() {
        ListNode head = this;
        ListNode current = this;
        List<Integer> list = new ArrayList<>();
        list.add(current.val);

        while(current.next != null && current.next != head) {
            current = current.next;
            list.add(current.val);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
