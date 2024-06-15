package au.com.rainmore.datastructure.trees;

import au.com.rainmore.datastructure.extra.data.TreeNode;

/**
 * <a href="https://leetcode.com/problems/search-in-a-binary-search-tree/">
 * 700. Search in a Binary Search Tree</a>
 */
public class No700SearchInABinarySearchTree {

    /**
     * Time complexity: O(log n)
     * Space complexity: O(1)
     */
    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) {
            return null;
        }

        if (val > root.val) {
            return searchBST(root.right, val);
        } else if (val < root.val) {
            return searchBST(root.left, val);
        } else {
            return root;
        }
    }

    public TreeNode minValueNode(TreeNode root) {
        TreeNode current = root;

        while (current != null && current.left != null) {
            current = root.left;
        }
        return current;
    }

    public TreeNode maxValueNode(TreeNode root) {
        TreeNode current = root;

        while (current != null && current.right != null) {
            current = root.right;
        }
        return current;
    }

}
