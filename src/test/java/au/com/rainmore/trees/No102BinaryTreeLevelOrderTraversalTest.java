package au.com.rainmore.trees;

import au.com.rainmore.extra.data.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class No102BinaryTreeLevelOrderTraversalTest {

    private No102BinaryTreeLevelOrderTraversal test = new No102BinaryTreeLevelOrderTraversal();

    @Test
    void test1() {
        TreeNode tn20 = new TreeNode(20, new TreeNode(15), new TreeNode(7));
        TreeNode root = new TreeNode(3, new TreeNode(9), tn20);
        List<List<Integer>> result = test.levelOrder(root);

        assertIterableEquals(List.of(3), result.get(0));
        assertIterableEquals(List.of(9, 20), result.get(1));
        assertIterableEquals(List.of(15, 7), result.get(2));
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(1);
        List<List<Integer>> result = test.levelOrder(root);

        assertIterableEquals(List.of(1), result.get(0));
    }

    @Test
    void test3() {
        TreeNode root = null;
        List<List<Integer>> result = test.levelOrder(root);
        assertTrue(result.isEmpty());
    }

}
