package au.com.rainmore.trees;

import au.com.rainmore.extra.data.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No230KthSmallestElementInABSTTest {

    private No230KthSmallestElementInABST test = new No230KthSmallestElementInABST();

    @Test
    void test1() {
        TreeNode tn1 = new TreeNode(1, null, new TreeNode(2));
        TreeNode treeNode = new TreeNode(3, tn1, new TreeNode(4));
        int r = test.kthSmallest(treeNode, 1);
        assertEquals(1, r);
    }

    @Test
    void test2() {
        TreeNode tn2 = new TreeNode(2, new TreeNode(1), null);
        TreeNode tn3 = new TreeNode(3, tn2, new TreeNode(4));
        TreeNode treeNode = new TreeNode(5, tn3, new TreeNode(6));
        int r = test.kthSmallest(treeNode, 1);
        assertEquals(1, r);
    }


    @Test
    void test3() {
        TreeNode tn2 = new TreeNode(2, new TreeNode(1), null);
        TreeNode tn3 = new TreeNode(3, tn2, new TreeNode(4));
        TreeNode treeNode = new TreeNode(5, tn3, new TreeNode(6));
        int r = test.kthSmallest(treeNode, 3);
        assertEquals(3, r);
    }

    @Test
    void test4() {
        TreeNode treeNode = new TreeNode(1, null, new TreeNode(2));
        int r = test.kthSmallest(treeNode, 2);
        assertEquals(2, r);
    }

}
