package au.com.rainmore.linkedLists;

import au.com.rainmore.extra.data.ListNode;

/**
 * <a href="https://leetcode.com/problems/merge-k-sorted-lists/">
 * 23. Merge k Sorted Lists</a>
 */
public class No23MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode head = lists[0];
        for (int i = 1; i < lists.length; i++) {
            head = mergeList(head, lists[i]);
        }
        return head;
    }

    private ListNode mergeList(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode current = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if (list1 == null) {
            current.next = list2;
        } else if (list2 == null) {
            current.next = list1;
        }

        return head.next;
    }


}
