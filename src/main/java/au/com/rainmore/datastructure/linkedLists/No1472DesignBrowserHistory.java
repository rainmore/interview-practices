package au.com.rainmore.datastructure.linkedLists;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/design-browser-history/description/">
 * 1472. Design Browser History</a>
 */
public class No1472DesignBrowserHistory {

    private Logger logger = LoggerFactory.getLogger(No1472DesignBrowserHistory.class);

    class Node {
        String val;
        Node previous;
        Node next;

        public Node(String val, Node previous, Node next) {
            this.val = val;
            this.previous = previous;
            this.next = next;
        }

        public Node(String val) {
            this.val = val;
        }
    }

    class BrowserHistory1 {

        private Node current;

        public BrowserHistory1(String homepage) {
            current = new Node(homepage);
        }

        public void visit(String url) {
            Node node = new Node(url);
            node.previous = current;
            current.next = node;
            current = node;
        }

        public String back(int steps) {
            while (current.previous != null && steps > 0) {
                current = current.previous;
                steps -= 1;
            }
            return current.val;
        }

        public String forward(int steps) {
            while (current.next != null && steps > 0) {
                current = current.next;
                steps -= 1;
            }
            return current.val;
        }
    }

    class BrowserHistory {

        int i = 0;
        int len = 0;

        List<String> history = new ArrayList<>();

        public BrowserHistory(String homepage) {
            history.add(homepage);
            len = history.size();
        }

        public void visit(String url) {
            if (history.size() < i + 2) {
                history.add(url);
            } else {
                history.set(i + 1, url);
            }

            i += 1;
            len = i + 1;
        }

        public String back(int steps) {
            i = Math.max(i - steps, 0);
            return history.get(i);
        }

        public String forward(int steps) {
            i = Math.min(i + steps, len - 1);
            return history.get(i);
        }
    }

}
