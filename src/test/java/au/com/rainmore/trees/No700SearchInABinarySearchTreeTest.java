package au.com.rainmore.trees;

import au.com.rainmore.extra.data.TreeNode;
import au.com.rainmore.trees.No700SearchInABinarySearchTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class No700SearchInABinarySearchTreeTest {

    private No700SearchInABinarySearchTree test = new No700SearchInABinarySearchTree();

    private TreeNode treeNode2 = new TreeNode(2, new TreeNode(1), new TreeNode(3));
    private TreeNode treeNode = new TreeNode(4, treeNode2, new TreeNode(7));

    @Test
    void test1() {
        TreeNode data = treeNode;
        TreeNode r = test.searchBST(data, 2);

        assertEquals(treeNode2, r);
    }

    @Test
    void test2() {
        TreeNode data = treeNode;
        TreeNode r = test.searchBST(data, 5);

        assertNull(r);
    }

}
