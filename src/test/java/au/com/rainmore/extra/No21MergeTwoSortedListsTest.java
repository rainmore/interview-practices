package au.com.rainmore.extra;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import au.com.rainmore.extra.No21MergeTwoSortedLists.ListNode;

class No21MergeTwoSortedListsTest {

    private Logger logger = LoggerFactory.getLogger(No21MergeTwoSortedListsTest.class);

    private No21MergeTwoSortedLists test = new No21MergeTwoSortedLists();

    @Test
    void test1() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        ListNode r = test.mergeTwoLists(list1, list2);

        logger.info("{}", r);
    }

    @Test
    void test2() {
        ListNode list1 = null;
        ListNode list2 = null;

        ListNode r = test.mergeTwoLists(list1, list2);

        logger.info("{}", r);
    }

    @Test
    void test3() {
        ListNode list1 = null;
        ListNode list2 = new ListNode();

        ListNode r = test.mergeTwoLists(list1, list2);

        logger.info("{}", r);
    }

}
