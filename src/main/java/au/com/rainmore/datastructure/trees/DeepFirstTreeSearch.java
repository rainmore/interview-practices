package au.com.rainmore.datastructure.trees;

import au.com.rainmore.datastructure.extra.data.TreeNode;

public class DeepFirstTreeSearch {

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        print(root);
        inOrder(root.right);
    }

    public void inReversedOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.right);
        print(root);
        inOrder(root.left);
    }

    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        print(root);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void preReversedOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        print(root);
        preOrder(root.right);
        preOrder(root.left);
    }

    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        print(root);
    }

    public void postReversedOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.right);
        postOrder(root.left);
        print(root);
    }

    private void print(TreeNode root) {
        System.out.println(root.val);
    }

}
