package au.com.rainmore.linkedLists;

import au.com.rainmore.extra.data.ListNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <a href="https://leetcode.com/problems/design-linked-list/">
 * 707. Design Linked List</a>
 */
public class No707DesignLinkedList {

    private Logger logger = LoggerFactory.getLogger(No707DesignLinkedList.class);

    class Node {
        int val = 0;
        Node previous;
        Node next;

        public Node(int val, Node previous, Node next) {
            this.val = val;
            this.previous = previous;
            this.next = next;
        }

        public Node(int val) {
            this.val = val;
        }
    }


    class MyLinkedList {

        private Node left;
        private Node right;

        public MyLinkedList() {
            left =  new Node(0);
            right =  new Node(0);
            left.next = right;
            right.previous = left;
        }

        public int get(int index) {
            Node current = left.next;
            while (current != null && index > 0) {
                current = current.next;
                index -= 1;
            }

            if (current != null && current != right && index == 0) {
                return current.val;
            }

            return -1;
        }

        public void addAtHead(int val) {
            Node node = new Node(val);
            Node next = left.next;
            Node prev = left;
            prev.next = node;
            next.previous = node;
            node.next = next;
            node.previous = prev;

        }

        public void addAtTail(int val) {
            Node node = new Node(val);
            Node next = right;
            Node prev = right.previous;

            prev.next = node;
            next.previous = node;
            node.next = next;
            node.previous = prev;
        }

        public void addAtIndex(int index, int val) {
            Node current = left.next;
            while (current != null && index > 0) {
                current = current.next;
                index -= 1;
            }

            if (current != null && index == 0) {
                Node node = new Node(val);
                Node next = current;
                Node prev = current.previous;

                prev.next = node;
                next.previous = node;
                node.next = next;
                node.previous = prev;
            }
        }

        public void deleteAtIndex(int index) {
            Node current = left.next;
            while (current != null && index > 0) {
                current = current.next;
                index -= 1;
            }

            if (current != null) {
                Node next = current.next;
                Node prev = current.previous;
                next.previous = prev;
                prev.next = next;
            }
        }
    }

}
