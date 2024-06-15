package au.com.rainmore.datastructure.linkedLists;

import au.com.rainmore.datastructure.extra.data.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/">
 *     2130. Maximum Twin Sum of a Linked List</a>
 *
 *
 */
public class No2130MaximumTwinSumOfALinkedList {

    private Logger logger = LoggerFactory.getLogger(No21MergeTwoSortedLists.class);

    public int pairSum(ListNode head) {
        int mx = Integer.MIN_VALUE;
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = reverse(slow);

        ListNode left = head, right = prev;
        while (right != null) {
            mx = Math.max(mx , left.val + right.val);
            left = left.next;
            right = right.next;
        }

        return mx;
    }

    private ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return prev;
    }


}
