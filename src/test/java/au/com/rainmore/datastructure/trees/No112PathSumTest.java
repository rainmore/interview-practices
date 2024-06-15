package au.com.rainmore.datastructure.trees;

import au.com.rainmore.datastructure.extra.data.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class No112PathSumTest {

    private No112PathSum test = new No112PathSum();

    @Test
    void test1() {
        TreeNode root = null;
        int targetSum = 5;

        boolean r = test.hasPathSum(root, targetSum);
        assertFalse(r);
    }

    @Test
    void test2() {
        TreeNode tn3 = new TreeNode(3);
        TreeNode tn2 = new TreeNode(2);
        TreeNode root = new TreeNode(1);
        root.left = tn2;
        root.right = tn3;

        int targetSum = 5;

        boolean r = test.hasPathSum(root, targetSum);
        assertFalse(r);
    }

    @Test
    void test3() {
        TreeNode tn311 = new TreeNode(11, new TreeNode(7), new TreeNode(2));
        TreeNode tn24 = new TreeNode(4);
        tn24.left = tn311;

        TreeNode tn34 = new TreeNode(4, null, new TreeNode(1));
        TreeNode tn28 = new TreeNode(8, new TreeNode(13), tn34);
        TreeNode root = new TreeNode(5);
        root.left = tn24;
        root.right = tn28;
        int targetSum = 22;

        boolean r = test.hasPathSum(root, targetSum);
        assertTrue(r);
    }

}
