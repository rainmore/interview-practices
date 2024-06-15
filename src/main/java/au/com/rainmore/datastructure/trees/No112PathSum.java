package au.com.rainmore.datastructure.trees;


import au.com.rainmore.datastructure.extra.data.TreeNode;

/**
 * <a href="https://leetcode.com/problems/path-sum/description/">
 * 112. Path Sum</a>
 */
public class No112PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        return pathSum(root, targetSum, 0);
    }

    private boolean pathSum(TreeNode root, int targetSum, int sum) {

        if (root == null) {
            return false;
        }

        sum += root.val;
        if (root.right == null && root.left == null) {
            return sum == targetSum;
        }

        return pathSum(root.left, targetSum, sum) || pathSum(root.right, targetSum, sum);
    }

}
