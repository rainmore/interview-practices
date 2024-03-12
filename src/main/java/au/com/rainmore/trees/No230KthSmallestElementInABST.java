package au.com.rainmore.trees;


import au.com.rainmore.extra.data.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/kth-smallest-element-in-a-bst/">
 * 230. Kth Smallest Element in a BST</a>
 */
public class No230KthSmallestElementInABST {

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        traversal(root, k, list);
        return list.get(list.size() - 1);
    }

    private void traversal(TreeNode root, int k, List<Integer> list) {
        if (root == null) return;

        traversal(root.left, k, list);
        if (list.size() < k) {
            list.add(root.val);
        }
        if (list.size() == k) return;
        traversal(root.right, k, list);
    }

}
