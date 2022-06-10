public class ReverseLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }
    void print(Node head){
        Node n=head;
        while (n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    void push(int d){
        Node newNode = new Node(d);
        newNode.next=head;
        head=newNode;
    }
    static  Node reverse(Node head){
        Node current=head;
        Node next=null;
        Node prev=null;
        while (current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
        return head;
    }

    public static void main(String[] args) {
        ReverseLinkedList list =new ReverseLinkedList();
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.head=list.reverse(list.head);
        list.print(list.head);

    }
}
