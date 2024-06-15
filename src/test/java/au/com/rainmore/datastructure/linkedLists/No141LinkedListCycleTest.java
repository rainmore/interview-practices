package au.com.rainmore.datastructure.linkedLists;

import au.com.rainmore.datastructure.extra.data.ListNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class No141LinkedListCycleTest {

    private No141LinkedListCycle test = new No141LinkedListCycle();

    @Test
    void test1() {
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0, new ListNode(-4, listNode2));
        listNode2.next = listNode3;
        ListNode listNode1 = new ListNode(1, listNode2);
        boolean r = test.hasCycle(listNode1);
       assertTrue(r);
    }

    @Test
    void test2() {
        ListNode listNode2 = new ListNode(2);
        ListNode listNode1 = new ListNode(1, listNode2);
        listNode2.next = listNode1;
        boolean r = test.hasCycle(listNode1);
       assertTrue(r);
    }

    @Test
    void test3() {
        ListNode listNode1 = new ListNode(1);
        boolean r = test.hasCycle(listNode1);
       assertFalse(r);
    }

}
