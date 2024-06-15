package au.com.rainmore.datastructure.trees;


import au.com.rainmore.datastructure.extra.data.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/binary-tree-level-order-traversal/description/">
 * 102. Binary Tree Level Order Traversal</a>
 */
public class No102BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        int depth = 0;
        traverse(root, depth, list);
        return list;
    }

    private void traverse(TreeNode root, int depth, List<List<Integer>> list) {
        if (root == null) return;

        if (list.size() < (depth + 1)) {
            list.add(new ArrayList<>());
        }

        list.get(depth).add(root.val);

        traverse(root.left, depth + 1, list);
        traverse(root.right, depth + 1, list);
    }

}
