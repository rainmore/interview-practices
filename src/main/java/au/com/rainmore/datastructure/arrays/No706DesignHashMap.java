package au.com.rainmore.datastructure.arrays;


/**
 * <a href="https://leetcode.com/problems/design-hashmap/description/">
 * 706. Design HashMap</a>
 * <p>
 * Time O(1)
 * <p>
 * Space O(n)
 */
public class No706DesignHashMap {

    public static class MyHashMap {

        class ListNode {

            int key, val;
            ListNode next;

            public ListNode(int key, int val, ListNode next) {
                this.key = key;
                this.val = val;
                this.next = next;
            }
        }

        private static int size  = 19997;
        private static int token = 1999999997;

        ListNode[] data;

        public MyHashMap() {
            this.data = new ListNode[size];
        }

        private int hash(int key) {
            return (int) ((long) key * token % size);
        }

        public void put(int key, int value) {
            remove(key);

            int h = hash(key);
            ListNode node = new ListNode(key, value, data[h]);
            data[h] = node;
        }

        public int get(int key) {
            int h = hash(key);
            ListNode node = data[h];

            for (; node != null; node = node.next)
                if (node.key == key) return node.val;
            return -1;
        }

        public void remove(int key) {
            int h = hash(key);
            ListNode node = data[h];

            if (node == null) return;
            if (node.key == key) {
                data[h] = node.next;
            } else {
                for (; node.next != null; node = node.next)
                    if (node.next.key == key) {
                        node.next = node.next.next;
                        return;
                    }
            }
        }
    }
}
