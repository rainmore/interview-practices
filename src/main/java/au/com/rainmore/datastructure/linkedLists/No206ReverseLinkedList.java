package au.com.rainmore.datastructure.linkedLists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import au.com.rainmore.datastructure.extra.data.ListNode;

/**
 * <a href="https://leetcode.com/problems/reverse-linked-list/description/">
 * 206. Reverse Linked List</a>
 */
public class No206ReverseLinkedList {

    private Logger logger = LoggerFactory.getLogger(No206ReverseLinkedList.class);


    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        //       t = c.next
        //       c.next = p
        //       p = c
        //       c = t
        //

        // p -> (1) -> (2) -> (3) -> (4) -> (5)
        // p -> null, c -> (1)
        // n -> (2) c.next = null, p = c, c = n


        while(current != null) {
            // must have a new variable to hold the `current.next`;
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public ListNode reverseList1(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode current = head;
        if (head.next != null) {
            current = this.reverseList(head.next);
            head.next.next = head;
        }
        head.next = null;
        return current;
    }

}
