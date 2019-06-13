import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests2 {

    Problems2 problems2 = new Problems2();

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
    public void dupRemoval(){
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
        assertEquals("[1 2 3 4 5 6 7 8 9 ]",problems2.removeDup(node).toString());
    }

    @Test
    public void kEnd(){
        Node node = new Node(1);
        for (int i = 2; i < 10; i++) {
            node.appendToTail(i);
        }

        assertEquals(6,problems2.kEnd(node,3));
    }

    @Test
    public void kLastEnd(){
        Node node = new Node(1);
        for (int i = 2; i < 10; i++) {
            node.appendToTail(i);
        }

        assertEquals(1,problems2.kEnd(node,10));
    }

    @Test
    public void kFirstEnd(){
        Node node = new Node(1);
        for (int i = 2; i < 10; i++) {
            node.appendToTail(i);
        }

        assertEquals(9,problems2.kEnd(node,0));
    }

}
