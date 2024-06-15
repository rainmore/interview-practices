package au.com.rainmore.datastructure.trees;


/**
 * <a href="https://leetcode.com/problems/implement-trie-prefix-tree/description/">
 * 208. Implement Trie (Prefix Tree)</a>
 */
public class No208ImplementTriePrefixTree {

    private class Node {
        Node[]  children = new Node[26];
        char    c;
        boolean isWord   = false;

        public Node(char c) {
            this.c = c;
        }
    }

    private Node root;

    public No208ImplementTriePrefixTree() {
        this.root = new Node('\0');
    }

    public void insert(String word) {
        Node curr = this.root;
        for (char c : word.toCharArray()) {
            if (curr.children[c - 'a'] == null) {
                curr.children[c - 'a'] = new Node(c);
            }
            curr = curr.children[c - 'a'];
        }
        curr.isWord = true;
    }

    public boolean search(String word) {
        Node result = getLast(word);
        return result != null && result.isWord;
    }

    public boolean startsWith(String prefix) {
        Node result = getLast(prefix);
        return result != null;
    }

    private Node getLast(String word) {
        Node curr = this.root;
        for (char c : word.toCharArray()) {
            if (curr.children[c - 'a'] == null) {
                return null;
            }
            curr = curr.children[c - 'a'];
        }
        return curr;
    }
}
