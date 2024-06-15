package au.com.rainmore.datastructure.linkedLists;

import au.com.rainmore.datastructure.extra.data.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No2130MaximumTwinSumOfALinkedListTest {

    private No2130MaximumTwinSumOfALinkedList test = new No2130MaximumTwinSumOfALinkedList();

    @Test
    void test1() {
        ListNode listNode1 = new ListNode(5
                , new ListNode(4, new ListNode(2, new ListNode(1))));
        int r = test.pairSum(listNode1);

       assertEquals(6, r);
    }

    @Test
    void test2() {
        ListNode listNode1 = new ListNode(4
                , new ListNode(2, new ListNode(2, new ListNode(3))));
        int r = test.pairSum(listNode1);

       assertEquals(7, r);
    }

    @Test
    void test3() {
        ListNode listNode1 = new ListNode(1
                , new ListNode(100000));
        int r = test.pairSum(listNode1);

       assertEquals(100001, r);
    }

}
