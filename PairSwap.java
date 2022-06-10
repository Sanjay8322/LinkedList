public class PairSwap {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }
    void push(int data){
        Node new_node = new Node(data);
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
    void swap(){
        Node temp=head;
        while (temp!=null && temp.next!=null){
            int k=temp.data;
            temp.data=temp.next.data;
            temp.next.data=k;
            temp=temp.next.next;
        }
    }
    public static void main(String[] args) {
        PairSwap list=new PairSwap();
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        System.out.println("before sapping : ");
        list.print();
        list.swap();
        System.out.println("after swapping : ");
        list.print();

    }
}
