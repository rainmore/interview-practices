package au.com.rainmore.trees;


import au.com.rainmore.extra.data.TreeNode;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/binary-tree-right-side-view/description/">
 * 199. Binary Tree Right Side View</a>
 */
public class No199BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        traverse(root, list);
        return list;
    }

    private void traverse(TreeNode root, List<Integer> list) {
        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            int s = q.size();
            for (int i = 0; i < s; i++) {
                TreeNode tn = q.poll();
                if (i == 0) list.add(tn.val);
                if (tn.right != null) q.offer(tn.right);
                if (tn.left != null) q.offer(tn.left);
            }
        }
    }

}
