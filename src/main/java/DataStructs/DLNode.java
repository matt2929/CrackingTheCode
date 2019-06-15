package DataStructs;

public class DLNode {
    DLNode next;
    DLNode previous;
    int key;

    public DLNode(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }
}
