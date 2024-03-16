package au.com.rainmore.graphs;


import java.util.*;

/**
 * <a href="https://leetcode.com/problems/clone-graph/description/">
 * 133. Clone Graph</a>
 *
 * Time O(n * m)
 * Space O(n * m)
 *
 */
public class No133CloneGraph {

    public static class Node {
        int        val;
        List<Node> neighbors;

        public Node(int val, List<Node> neighbors) {
            this.val = val;
            this.neighbors = neighbors;
        }

        public Node(int val) {
            this(val, new ArrayList<>());
        }
    }

    public Node cloneGraph(Node node) {
        HashMap<Node, Node> cache = new HashMap<>();
        return (node == null) ? null : dfs(node, cache);
    }

    private Node dfs(Node node, HashMap<Node, Node> cache) {
        if (cache.containsKey(node)) {
            return cache.get(node);
        }

        Node copy = new Node(node.val);
        cache.put(node, copy);
        for (Node n: node.neighbors) {
            copy.neighbors.add(dfs(n, cache));
        }
        return copy;
    }

}
