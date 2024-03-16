package au.com.rainmore.graphs;

import org.junit.jupiter.api.Test;

import au.com.rainmore.graphs.No133CloneGraph.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class No133CloneGraphTest {

    private No133CloneGraph test = new No133CloneGraph();

    @Test
    void test1() {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node1.neighbors.add(node2);
        node1.neighbors.add(node4);

        node2.neighbors.add(node1);
        node2.neighbors.add(node3);

        node3.neighbors.add(node2);
        node3.neighbors.add(node4);

        node4.neighbors.add(node1);
        node4.neighbors.add(node3);



        Node result = test.cloneGraph(node1);


        assertEquals1(node1, result);
    }


    private void assertEquals1(Node expected, Node actual) {
        assertEquals(expected.val, actual.val);
        assertNotEquals(expected.hashCode(), actual.hashCode());

        List<Integer> expectedNeighbors = expected.neighbors.stream().map(n -> n.val).toList();
        List<Integer> actualNeighbors = actual.neighbors.stream().map(n -> n.val).toList();

        assertIterableEquals(expectedNeighbors, actualNeighbors);
        assertNotEquals(expected.neighbors.hashCode(), actual.neighbors.hashCode());
    }

}
