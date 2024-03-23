package au.com.rainmore.linkedLists;

import au.com.rainmore.extra.data.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No876MiddleOfTheLinkedListTest {

    private No876MiddleOfTheLinkedList test = new No876MiddleOfTheLinkedList();

    @Test
    void test1() {
        ListNode listNode1 = new ListNode(1
                , new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode r = test.middleNode(listNode1);
        ListNode expected = new ListNode(3, new ListNode(4, new ListNode(5)));
        assertEquals(expected.val, r.val);
        assertEquals(expected.next.val, r.next.val);
        assertEquals(expected.next.next.val, r.next.next.val);
    }

    @Test
    void test2() {
        ListNode listNode1 = new ListNode(1
                , new ListNode(2, new ListNode(3,
                new ListNode(4, new ListNode(5, new ListNode(6))))));
        ListNode r = test.middleNode(listNode1);
        ListNode expected = new ListNode(4, new ListNode(5, new ListNode(6)));
        assertEquals(expected.val, r.val);
        assertEquals(expected.next.val, r.next.val);
        assertEquals(expected.next.next.val, r.next.next.val);
    }

    @Test
    void test3() {
        ListNode listNode1 = new ListNode(1);
        ListNode r = test.middleNode(listNode1);
        ListNode expected = new ListNode(1);
        assertEquals(expected.val, r.val);
    }

}
