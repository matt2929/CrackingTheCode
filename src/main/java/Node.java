public class Node {
    Node next = null;
    int data;

    public Node(int d){
        data = d;
    }

    Node appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while (n.next != null){
            n = n.next;
        }
        n.next=end;
        return this;
    }

    Node remove(int index){
        if(index<0){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(index==0){
            return this.next;
        }
        Node n = new Node(-1);
        n.next = this;
        for (int i =0;i<index && n.next != null;i++){
            n = n.next;
        }
        if(n.next==null){
            throw new ArrayIndexOutOfBoundsException();
        }
        n.next=n.next.next;
        return this.next;
    }

    public String toString(){
        String out = "[";
        Node n = this;
        while (n != null){
            out+=n.data+" ";
            n = n.next;
        }
        out+="]";
        return out;
    }
}
