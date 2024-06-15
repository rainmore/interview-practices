package au.com.rainmore.datastructure.trees;

import au.com.rainmore.datastructure.extra.data.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class No199BinaryTreeRightSideViewTest {

    private No199BinaryTreeRightSideView test = new No199BinaryTreeRightSideView();

    @Test
    void test1() {
        TreeNode tn2 = new TreeNode(2, null, new TreeNode(5));
        TreeNode tn3 = new TreeNode(3, null, new TreeNode(4));
        TreeNode root = new TreeNode(1, tn2, tn3);
        List<Integer> r = test.rightSideView(root);
        assertIterableEquals(List.of(1,3,4), r);
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(1, null, new TreeNode(3));
        List<Integer> r = test.rightSideView(root);
        assertIterableEquals(List.of(1,3), r);
    }

    @Test
    void test3() {
        List<Integer> r = test.rightSideView(null);
        assertTrue(r.isEmpty());
    }

    @Test
    void test4() {
        TreeNode root = new TreeNode(1, new TreeNode(2), null);
        List<Integer> r = test.rightSideView(root);
        assertIterableEquals(List.of(1,2), r);
    }
    @Test
    void test5() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));
        List<Integer> r = test.rightSideView(root);
        assertIterableEquals(List.of(1,3,4), r);
    }


}
