import DataStructs.Node;
import Problems.LinkedListProblem;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTests {

    LinkedListProblem linkedListProblem = new LinkedListProblem();

    @Test
    public void removeLast() {
        Node node = new Node(1);
        for (int i = 2; i < 10; i++) {
            node.appendToTail(i);
        }
        node.remove(8);
        assertEquals("[1 2 3 4 5 6 7 8 ]", node.toString());
    }

    @Test
    public void buildGood() {
        Node node = new Node(1);
        for (int i = 2; i < 10; i++) {
            node.appendToTail(i);
        }
        assertEquals("[1 2 3 4 5 6 7 8 9 ]", node.toString());
    }

    @Test
    public void removeFirstGood() {
        Node node = new Node(1);
        for (int i = 2; i < 10; i++) {
            node.appendToTail(i);
        }
        node = node.remove(0);
        assertEquals("[2 3 4 5 6 7 8 9 ]", node.toString());
    }


    @Test
    public void remove3RemoveGood() {
        Node node = new Node(1);
        for (int i = 2; i < 10; i++) {
            node.appendToTail(i);
        }
        node = node.remove(0);
        node = node.remove(0);
        node = node.remove(0);
        assertEquals("[4 5 6 7 8 9 ]", node.toString());
    }

    @Test
    public void removeCatch() {
        boolean caught = false;
        Node node = new Node(1);
        for (int i = 2; i < 10; i++) {
            node.appendToTail(i);
        }
        try {
            node = node.remove(-1);
        } catch (ArrayIndexOutOfBoundsException e) {
            caught = true;
        }
        assertEquals(true, caught);
    }

    @Test
    public void dupRemoval() {
        Node node = new Node(1);
        for (int i = 2; i < 10; i++) {
            node.appendToTail(i);
        }
        for (int i = 2; i < 10; i++) {
            node.appendToTail(5);
        }
        for (int i = 2; i < 10; i++) {
            node.appendToTail(i);
        }
        assertEquals("[1 2 3 4 5 6 7 8 9 ]", linkedListProblem.removeDup(node).toString());
    }

    @Test
    public void kEnd() {
        Node node = new Node(1);
        for (int i = 2; i < 10; i++) {
            node.appendToTail(i);
        }

        assertEquals(6, linkedListProblem.kEnd(node, 3));
    }

    @Test
    public void kLastEnd() {
        Node node = new Node(1);
        for (int i = 2; i < 10; i++) {
            node.appendToTail(i);
        }

        assertEquals(1, linkedListProblem.kEnd(node, 10));
    }

    @Test
    public void kFirstEnd() {
        Node node = new Node(1);
        for (int i = 2; i < 10; i++) {
            node.appendToTail(i);
        }
        assertEquals(9, linkedListProblem.kEnd(node, 0));
    }

    @Test
    public void sumListSimpleGood() {
        Node a = new Node(7);
        a.appendToTail(1);
        a.appendToTail(6);

        Node b = new Node(5);
        b.appendToTail(9);
        b.appendToTail(2);

        Node c = new Node(2);
        c.appendToTail(1);
        c.appendToTail(9);

        assertEquals(c.toString(), linkedListProblem.sumLinkedList(a, b).toString());
    }

    @Test
    public void sumListWeirdWeightGood() {
        Node a = new Node(1);


        Node b = new Node(5);
        b.appendToTail(9);
        b.appendToTail(2);
        b.appendToTail(9);
        b.appendToTail(2);
        b.appendToTail(9);
        b.appendToTail(2);

        Node c = new Node(6);
        c.appendToTail(9);
        c.appendToTail(2);
        c.appendToTail(9);
        c.appendToTail(2);
        c.appendToTail(9);
        c.appendToTail(2);

        assertEquals(c.toString(), linkedListProblem.sumLinkedList(a, b).toString());
    }

    @Test
    public void reverseLine() {
        Node a = new Node(7);
        a.appendToTail(6);
        a.appendToTail(5);
        a.appendToTail(4);

        Node b = new Node(4);
        b.appendToTail(5);
        b.appendToTail(6);
        b.appendToTail(7);

        assertEquals(a.toString(), linkedListProblem.reverseList(b).toString());
    }

    @Test
    public void sumListSimpleCarry() {
        Node a = new Node(7);

        Node b = new Node(5);

        Node c = new Node(2);
        c.appendToTail(1);

        assertEquals(c.toString(), linkedListProblem.sumLinkedList(a, b).toString());
    }

}
