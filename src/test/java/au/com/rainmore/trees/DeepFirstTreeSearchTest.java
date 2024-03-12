package au.com.rainmore.trees;

import au.com.rainmore.extra.data.TreeNode;
import org.junit.jupiter.api.Test;

class DeepFirstTreeSearchTest {

    private DeepFirstTreeSearch test = new DeepFirstTreeSearch();


    private TreeNode treeNode3 = new TreeNode(3, new TreeNode(2), null);
    private TreeNode treeNode6 = new TreeNode(6, new TreeNode(5), new TreeNode(7));

    private TreeNode treeNode1 = new TreeNode(4, treeNode3, treeNode6);

    @Test
    void testInOrder() {
        System.out.println("In Order");
        test.inOrder(treeNode1);
        System.out.println("======");
    }

    @Test
    void testInReversedOrder() {
        System.out.println("In Reversed Order");
        test.inReversedOrder(treeNode1);
        System.out.println("======");
    }

    @Test
    void testPreOrder() {
        System.out.println("Pre Order");
        test.preOrder(treeNode1);
        System.out.println("======");
    }

    @Test
    void testPreReversedOrder() {
        System.out.println("Pre Reversed Order");
        test.preReversedOrder(treeNode1);
        System.out.println("======");
    }


    @Test
    void testPostOrder() {
        System.out.println("Post Order");
        test.postOrder(treeNode1);
        System.out.println("======");
    }

    @Test
    void testPostReversedOrder() {
        System.out.println("Post Reversed Order");
        test.postReversedOrder(treeNode1);
        System.out.println("======");
    }

}
