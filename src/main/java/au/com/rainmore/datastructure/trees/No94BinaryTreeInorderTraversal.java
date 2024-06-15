package au.com.rainmore.datastructure.trees;


import au.com.rainmore.datastructure.extra.data.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/binary-tree-inorder-traversal/">
 * 94. Binary Tree Inorder Traversal</a>
 */
public class No94BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        traversal(root, list);
        return list;
    }

    private void traversal(TreeNode root, List<Integer> list) {
        if (root == null) return;

        traversal(root.left, list);
        list.add(root.val);
        traversal(root.right, list);
    }

}
