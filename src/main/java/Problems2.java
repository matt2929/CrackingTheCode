public class Problems2 {

    public Node removeDup(Node node) {
        Node current = node;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (current.data == runner.next.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
        return node;
    }

    public int kEnd(Node node, int k) {
        Node runner = node;
        Node runner2 = node;
        while (runner.next != null) {
            if (k == 0) {
                runner2 = runner2.next;
            } else {
                k--;
            }
            runner = runner.next;
        }
        return runner2.data;
    }

}
