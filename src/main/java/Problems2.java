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

    public Node sumLinkedList(Node a, Node b) {
        if(a==null||b==null){
            throw new NullPointerException();
        }


        int carry = (a.data+b.data)/10;
        Node c=new Node((a.data+b.data)%10);
        Node cRunner=c;
        a=a.next;
        b=b.next;
        while(a!=null&&b!=null){
            cRunner.next = new Node((a.data+b.data+carry)%10);
            carry = (a.data+b.data+carry)/10;
            cRunner=cRunner.next;
            a=a.next;
            b=b.next;
        }
        while(a!=null){
            cRunner.next = new Node((a.data+carry)%10);
            carry = (a.data)/10;
            cRunner=cRunner.next;
            a=a.next;

        }

        while(b!=null){
            cRunner.next = new Node((b.data+carry)%10);
            carry = (b.data)/10;
            cRunner=cRunner.next;
            b=b.next;
        }

        if(carry!=0)
            cRunner.next=new Node(carry);
        return c;
    }

}
