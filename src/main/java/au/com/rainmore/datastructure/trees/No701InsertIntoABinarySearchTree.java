package au.com.rainmore.datastructure.trees;

import au.com.rainmore.datastructure.extra.data.TreeNode;

/**
 * <a href="https://leetcode.com/problems/insert-into-a-binary-search-tree/">
 * 701. Insert into a Binary Search Tree</a>
 */
public class No701InsertIntoABinarySearchTree {

    /**
     * Time complexity: O(log n)
     * Space complexity: O(1)
     */
    public TreeNode insertIntoBST(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }

        if (val > root.val) {
            root.right = insertIntoBST(root.right, val);
        } else if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }

    public TreeNode insertIntoBST1(TreeNode root, int val) {

        if (root == null) {
            return new TreeNode(val);
        }

        TreeNode current = root;
        while (current != null) {
            if (val > current.val) {
                if (current.right == null) {
                    current.right = new TreeNode(val);
                    return root;
                }
                current = current.right;
            }
            else if (val < current.val) {
                if (current.left == null) {
                    current.left = new TreeNode(val);
                    return root;
                }
                current = current.left;
            }
        }
        return root;
    }
}
