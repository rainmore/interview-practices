package au.com.rainmore.trees;

import au.com.rainmore.extra.data.TreeNode;

/**
 * <a href="https://leetcode.com/problems/delete-node-in-a-bst/">
 * 450. Delete Node in a BST</a>
 */
public class No450DeleteNodeInABinarySearchTree {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public TreeNode deleteNode(TreeNode root, int val) {

        if (root == null) {
            return null;
        }

        if (val > root.val) {
            root.right = deleteNode(root.right, val);
        } else if (val < root.val) {
            root.left = deleteNode(root.left, val);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                TreeNode min = findMinNode(root.right);
                root.val = min.val;
                root.right = deleteNode(root.right, min.val);
            }
        }

        return root;
    }

    private TreeNode findMinNode(TreeNode root) {
        TreeNode current = root;
        while (current != null && current.left != null) {
            current = current.left;
        }
        return current;
    }

}
