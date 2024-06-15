package au.com.rainmore.datastructure.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class TreePreorderTraversal {

    public static void main(String[] args) {
//        int[] arr = processInput();

        int[] arr = new int[]{1, 2, 5, 3, 6, 4};


        Node node6 = new Node(6);
        Node node4 = new Node(4);
        Node node3 = new Node(3);
        node3.right = node4;
        Node node5 = new Node(5);
        node5.left = node3;
        node5.right = node6;
        Node node2 = new Node(2);
        node2.right = node5;
        Node node1 = new Node(1);
        node1.right = node2;

//        Node node = process(arr);
//        List<String> list = toList(node);

//        System.out.println(list.stream().collect(Collectors.joining(" ")));

        preOrder(node1);
    }


    private static void preOrder(Node root) {
        if (root != null) {
            System.out.print(String.format("%d ", root.value));
        }

        if (root.left != null) {
            preOrder(root.left);
        }

        if (root.right != null) {
            preOrder(root.right);
        }
    }


    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }


}
