public class reverseSortedLinkedList {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }
    public void push(int data){
        Node new_node =new Node(data);
        new_node.next=head;
        head=new_node;
    }
    public void print(){
        Node n=head;
        while (n!=null){
            System.out.println(n.data+" ");
            n=n.next;
        }
    }
    public void remove(){
        Node curr=head;
        while (curr!=null){
            Node temp=curr;
            while (temp!=null && curr.data==temp.data){
                temp=temp.next;
            }
            curr.next=temp;
            curr=curr.next;
        }
    }
//    public Node remove(Node head){
//        Node to_free;
//        if(head==null){
//            return null;
//        }
//        if(head.next!=null){
//            if(head.data==head.next.data){
//                to_free=head.next;
//                head.next=head.next.next;
//                remove(head);
//            }else {
//                remove(head.next);
//            }
//        }
//        return head;
//    }

    public static void main(String[] args) {
        reverseSortedLinkedList list=new reverseSortedLinkedList();
        Node head=null;
        list.push(11);
        list.push(8);
        list.push(8);
        list.push(8);
        list.push(2);
        list.push(2);
        list.push(2);
        list.remove();
        list.print();
    }
}
