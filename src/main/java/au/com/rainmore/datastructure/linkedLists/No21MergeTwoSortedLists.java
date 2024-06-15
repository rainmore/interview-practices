package au.com.rainmore.datastructure.linkedLists;

import au.com.rainmore.datastructure.extra.data.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="https://leetcode.com/problems/merge-two-sorted-lists/">
 *     21. Merge Two Sorted Lists</a>
 *
 *
 */
public class No21MergeTwoSortedLists {

    private Logger logger = LoggerFactory.getLogger(No21MergeTwoSortedLists.class);

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode current = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            }
            else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 == null) {
            current.next = list2;
        }
        else if (list2 == null) {
            current.next = list1;
        }

        return head.next;
    }


}
