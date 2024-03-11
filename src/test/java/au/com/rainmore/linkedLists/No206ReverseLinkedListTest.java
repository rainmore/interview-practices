package au.com.rainmore.linkedLists;

import au.com.rainmore.extra.data.ListNode;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No206ReverseLinkedListTest {

    private Logger logger = LoggerFactory.getLogger(No206ReverseLinkedListTest.class);

    private No206ReverseLinkedList test = new No206ReverseLinkedList();

    @Test
    void test1() {
        ListNode ln5 = new ListNode(5);
        ListNode ln4 = new ListNode(4, ln5);
        ListNode ln3 = new ListNode(3, ln4);
        ListNode ln2 = new ListNode(2, ln3);
        ListNode ln1 = new ListNode(1, ln2);

        ListNode r = test.reverseList(ln1);
        assertEquals("[5, 4, 3, 2, 1]", r.toString());
    }

    @Test
    void test2() {
        ListNode list1 = new ListNode(1,
                new ListNode(2)
        );

        ListNode r = test.reverseList(list1);
        assertEquals("[2, 1]", r.toString());
    }

}
