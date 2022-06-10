public class IntersectionOfLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }
    void push(int s){
        Node new_node=new Node(s);
        new_node.next=head;
        head=new_node;
    }
    static Node intersection(Node head1,Node head2){
        if(head1==null)
            return null;
        if(head2==null)
            return null;
        Node d1 = head1;
        Node d2 = head2;

        while(d1 != d2) {
            d1 = d1 == null? head2:d1.next;
            d2 = d2 == null? head1:d2.next;
        }
        return d1;
    }
    void print(Node head){
        Node n=head;
        while (n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }

    public static void main(String[] args) {
        IntersectionOfLinkedList list1=new IntersectionOfLinkedList();
        IntersectionOfLinkedList list2=new IntersectionOfLinkedList();
        list1.push(6);
        list1.push(7);
        list1.push(8);
        list1.push(2);
        list1.push(1);

        list2.push(6);
        list2.push(7);
        list2.push(8);
        list2.push(3);
        list2.push(1);
        list2.push(8);
        list2.push(2);

        list1.print(list1.head);
        System.out.println();
        list2.print(list2.head);

//        list1.head=intersection(list1.head,list2.head);
//        System.out.println(list1.head.data);

    }

}
