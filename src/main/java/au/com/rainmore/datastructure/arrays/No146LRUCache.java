package au.com.rainmore.datastructure.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/lru-cache/description/">
 * 146. LRU Cache</a>
 */

public class No146LRUCache {

    private class Node {
        int key;
        int  val;
        Node left;
        Node right;

        public Node(int key, int val, Node left, Node right) {
            this.key = key;
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public Node(int key, int val) {
            this(key, val, null, null);
        }
    }

    private Map<Integer, Node> map;
    private int capacity;

    private Node leastNode;
    private Node mostNode;
    public No146LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>(capacity);
        this.leastNode = new Node(0, 0);
        this.mostNode = new Node(0, 0);
        this.leastNode.right = this.mostNode;
        this.mostNode.left = this.leastNode;
    }

    private void remove(Node node) {
        Node prev = node.left;
        Node next = node.right;
        prev.right = next;
        next.left = prev;
    }

    private void insert(Node node) {
        Node prev = mostNode.left;
        Node next = mostNode;

        prev.right = node;
        node.left = prev;

        node.right = next;
        next.left = node;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            this.remove(map.get(key));
            this.insert(map.get(key));
            return map.get(key).val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if(map.containsKey(key)) {
            remove(map.get(key));
        }
        map.put(key, new Node(key, value));
        insert(map.get(key));

        if (map.size() > capacity) {
            Node lru = leastNode.right;
            remove(lru);
            map.remove(lru.key);
        }
    }
}
