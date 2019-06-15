package DataStructs;

public class DLList {
    DLNode head;
    DLNode tail;
    int size;
    int sizeC;


    public DLList(int size) {
        this.size = size;
        sizeC = 0;
    }



    public DLNode addFirst(int key) {
        DLNode temp = new DLNode(key);
        if (tail == null) {
            this.tail = temp;
        }
        if (head != null) {
            head.previous = temp;
        }
        temp.next = head;
        this.head = temp;
        sizeC++;
        if (sizeC > size) {
            trimTail();
            sizeC--;
        }
        return temp;
    }

    public void upgradeNode(DLNode node) {
        if (node == this.head) {
            return;
        }
        if (this.tail == node) {
            this.tail = this.tail.previous;
        }

        node.previous.next = node.next;
        node.next = head;
        head.previous = node;
        this.head = node;
        head.previous = null;
    }

    public void trimTail() {
        this.tail = this.tail.previous;
        this.tail.next = null;
    }

    public String makeString() {
        DLNode runner = this.head;
        String out = "";
        while (runner != null) {
            out += (runner.key + "\t");
            runner = runner.next;
        }
        return out;
    }

    public DLNode getHead() {
        return head;
    }

    public DLNode getTail() {
        return tail;
    }

}