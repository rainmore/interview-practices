package au.com.rainmore.datastructure.arrays;


import java.util.LinkedList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/design-hashset/description/">
 * 705. Design HashSet</a>
 * <p>
 * Time O(1)
 * <p>
 * Space O(n)
 */
public class No705DesignHashSet {


    public static class MyHashSet {

        // we keep the buckets larger than the no of calls
        // we use seperate chaining like in graphs how we design an adjacency list
        int          buckets = 15000;
        LinkedList<Integer>[] arr;

        // it stores the key at a unique index found using this function, idea taken from load factor
        private int hashingFunction(int key) {
            return key % buckets;
        }

        @SuppressWarnings("unchecked")
        public MyHashSet() {
            arr = new LinkedList[15000];
        }

        // adding the value in the reuired list
        public void add(int key) {
            int idx = hashingFunction(key);
            // if first element to be added then initiaize it
            if (arr[idx] == null)
                arr[idx] = new LinkedList<>();

            // get the list and add the value
            LinkedList<Integer> list = arr[idx];
            // this condition is to avoid duplicates
            if (!list.contains(key)) {
                list.add(key);
            }
        }

        // remove the value if present
        public void remove(int key) {
            int idx = hashingFunction(key);
            // check if the list from where the value has to be removed exists
            if (arr[idx] != null) {
                LinkedList<Integer> list = arr[idx];
                for (int i = 0; i < list.size(); i++) {
                    // if key exists then remove else if not present then do nothing
                    if (key == list.get(i)) {
                        list.remove(i);
                    }
                }
            }
        }

        // same like remove
        public boolean contains(int key) {
            int idx = hashingFunction(key);
            // check if the list is present and is not null
            if (arr[idx] != null) {
                LinkedList<Integer> list = arr[idx];
                for (int i = 0; i < list.size(); i++) {
                    if (key == list.get(i)) {
                        return true;
                    }
                }
            }
            // nothing found then return false

            return false;

        }
    }


    public static class MyHashSet1 {

        private class ListNode {

            int      key;
            ListNode next;

            public ListNode(int key, ListNode next) {
                this.key = key;
                this.next = next;
            }

            public ListNode(int key) {
                this(key, null);
            }
        }


        private ListNode[] set;

        public MyHashSet1() {
            set = new ListNode[15000];
        }

        public void add(int key) {
            int tmp = getHash(key);
            if (set[tmp] == null) {
                set[tmp] = new ListNode(0);
            }
            ListNode curr = set[tmp];
            while (curr.next != null) {
                if (curr.next.key == key) return;
                curr = curr.next;
            }
            curr.next = new ListNode(key);
        }

        public void remove(int key) {
            int tmp = getHash(key);
            if (set[tmp] == null) {
                set[tmp] = new ListNode(0);
            }
            ListNode curr = set[tmp];
            while (curr.next != null) {
                if (curr.next.key == key) {
                    curr.next = curr.next.next;
                    return;
                }
                curr = curr.next;
            }
        }

        public boolean contains(int key) {
            int tmp = getHash(key);
            if (set[tmp] == null) {
                set[tmp] = new ListNode(0);
            }
            ListNode curr = set[tmp];
            while (curr.next != null) {
                if (curr.next.key == key) {
                    return true;
                }
            }
            return false;
        }

        private int getHash(int key) {
            return key % set.length;
        }

    }
}
