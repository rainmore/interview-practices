package au.com.rainmore.datastructure.trees;

import au.com.rainmore.datastructure.extra.data.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class No94BinaryTreeInorderTraversalTest {

    private No94BinaryTreeInorderTraversal test = new No94BinaryTreeInorderTraversal();

    @Test
    void test1() {

        TreeNode treeNode2 = new TreeNode(2, new TreeNode(3), null);
        TreeNode treeNode = new TreeNode(1, null,  treeNode2);

        List<Integer> r = test.inorderTraversal(treeNode);

        assertEquals("1,3,2", r.stream().map(Object::toString).collect(Collectors.joining(",")));
    }

    @Test
    void test2() {
        List<Integer> r = test.inorderTraversal(null);

        assertEquals("", r.stream().map(Object::toString).collect(Collectors.joining(",")));
    }

    @Test
    void test3() {
        List<Integer> r = test.inorderTraversal(new TreeNode(1));

        assertEquals("1", r.stream().map(Object::toString).collect(Collectors.joining(",")));
    }

    @Test
    void test4() {
        List<Integer> r = test.inorderTraversal(new TreeNode(1, new TreeNode(2), null));

        assertEquals("2,1", r.stream().map(Object::toString).collect(Collectors.joining(",")));
    }


}
