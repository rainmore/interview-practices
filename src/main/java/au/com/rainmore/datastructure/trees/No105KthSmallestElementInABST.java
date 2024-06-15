package au.com.rainmore.datastructure.trees;


import au.com.rainmore.datastructure.extra.data.TreeNode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/">
 * 105. Construct Binary Tree from Preorder and Inorder Traversal</a>
 */
public class No105KthSmallestElementInABST {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return traversal(map,
                preorder, 0, preorder.length - 1,
                inorder, 0, inorder.length - 1);
    }

    private TreeNode traversal(Map<Integer, Integer> map,
                               int[] preorder, int preStart, int preEnd,
                               int[] inorder, int inStart, int inEnd) {
        if (preStart > preEnd || inStart > inEnd) return null;
        int index = map.get(preorder[preStart]);
        int idxLeft = index - inStart;

        TreeNode node = new TreeNode(preorder[preStart]);
        node.left = traversal(map,
                preorder, preStart + 1, preStart + idxLeft,
                inorder, inStart, index - 1);
        node.right = traversal(map,
                preorder, preStart + idxLeft + 1, preEnd,
                inorder, index + 1, inEnd);
        return node;
    }

    public TreeNode buildTree1(int[] preorder, int[] inorder) {

        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[0]);
        int mid = searchIndex(preorder[0], inorder);

        root.left = buildTree(
                Arrays.copyOfRange(preorder, 1, mid + 1),
                Arrays.copyOfRange(inorder, 0, mid + 1)
                             );
        root.right = buildTree(
                Arrays.copyOfRange(preorder, mid + 1, preorder.length),
                Arrays.copyOfRange(inorder, mid + 1, inorder.length)
                              );
        return root;
    }

    private int searchIndex(int val, int[] array) {
        int mid = 0;
        for (int i = 0; i < array.length; i++) {
            if (val == array[i]) {
                mid = i;
                break;
            }
        }
        return mid;
    }


}
