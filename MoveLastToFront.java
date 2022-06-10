public class MoveLastToFront {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }
    void push(int d){
        Node new_node=new Node(d);
        new_node.next=head;
        head=new_node;
    }
    void print(){
        Node n=head;
        while (n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }

    void LastToFront(){
        Node secLast=null;
        Node last=head;
        while (last.next!=null){
            secLast=last;
            last=last.next;
        }
        secLast.next=null;
        last.next=head;
        head=last;
    }

    public static void main(String[] args) {
        MoveLastToFront list =new MoveLastToFront();
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        System.out.println("before moving last element ");
        list.print();

        for(int i=0;i<2;i++){
            list.LastToFront();
        }
        System.out.println();
        System.out.println("after moving ");
        list.print();
    }
}
