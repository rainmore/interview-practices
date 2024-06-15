package au.com.rainmore.datastructure.linkedLists;

import au.com.rainmore.datastructure.extra.data.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class No142LinkedListCycleIITest {

    private No142LinkedListCycleII test = new No142LinkedListCycleII();

    @Test
    void test1() {
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0, new ListNode(-4, listNode2));
        listNode2.next = listNode3;
        ListNode listNode1 = new ListNode(3, listNode2);
        ListNode r = test.detectCycle(listNode1);
       assertEquals(listNode2, r);
    }

    @Test
    void test2() {
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1, listNode2);
        listNode2.next = listNode1;
        ListNode r = test.detectCycle(listNode1);
       assertEquals(listNode1, r);
    }

    @Test
    void test3() {
        ListNode listNode1 = new ListNode(1);
        ListNode r = test.detectCycle(listNode1);
       assertNull(r);
    }

    @Test
    void test4() {
        ListNode listNode1 = null;
        ListNode r = test.detectCycle(listNode1);
       assertNull(r);
    }

    @Test
    void test5() {
        ListNode listNode1 = new ListNode(1, new ListNode(2));
        ListNode r = test.detectCycle(listNode1);
       assertNull(r);
    }
}
