package au.com.rainmore.linkedLists;

import au.com.rainmore.extra.data.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="https://leetcode.com/problems/linked-list-cycle/description/">
 *     141. Linked List Cycle</a>
 *
 *
 */
public class No141LinkedListCycle {

    private Logger logger = LoggerFactory.getLogger(No21MergeTwoSortedLists.class);

    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }


}
