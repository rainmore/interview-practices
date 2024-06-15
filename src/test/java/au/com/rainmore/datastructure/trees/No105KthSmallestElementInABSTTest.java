package au.com.rainmore.datastructure.trees;

import au.com.rainmore.datastructure.extra.data.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No105KthSmallestElementInABSTTest {

    private No105KthSmallestElementInABST test = new No105KthSmallestElementInABST();

    @Test
    void test1() {
        int[] preorder = new int[]{3,9,20,15,7};
        int[] inorder = new int[]{9,3,15,20,7};
        TreeNode result = test.buildTree(preorder, inorder);
        assertEquals(3, result.val);
    }


    @Test
    void test2() {
        int[] preorder = new int[]{-1};
        int[] inorder = new int[]{-1};
        TreeNode result = test.buildTree(preorder, inorder);
        assertEquals(-1, result.val);
    }

}
