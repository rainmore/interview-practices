package au.com.rainmore.linkedLists;

import au.com.rainmore.extra.data.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="https://leetcode.com/problems/middle-of-the-linked-list/description/">
 *     876. Middle of the Linked List</a>
 *
 *
 */
public class No876MiddleOfTheLinkedList {

    private Logger logger = LoggerFactory.getLogger(No21MergeTwoSortedLists.class);

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == null || fast.next == null) {
                return slow;
            }
        }
        return slow;
    }


}
