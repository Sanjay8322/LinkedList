import java.util.HashSet;

public class DuplicatesInUnsorted {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }
    public void print(){
        Node n=head;
        while (n!=null){
            System.out.println(n.data+" ");
            n=n.next;
        }
    }
//    public void removeDuplicate(){
//        Node ptr1=null;
//        Node ptr2=null;
//        ptr1=head;
//        while (ptr1!=null && ptr1.next!=null){
//            ptr2=ptr1;
//            while (ptr2.next!=null){
//                if(ptr1.data==ptr2.next.data){
//                    ptr2.next=ptr2.next.next;
//                }
//                else {
//                    ptr2=ptr2.next;
//                }
//            }
//            ptr1=ptr1.next;
//        }
//    }
    public void removeDuplicate(){
        Node current=head;
        Node prev=null;
        HashSet<Integer> hs=new HashSet<>();
        while (current!=null){
            int k=current.data;
            if(hs.contains(k)){
                prev.next=current.next;
            }
            else {
                hs.add(k);
                prev=current;
            }
            current=current.next;
        }
    }
    public static void main(String[] args) {
        DuplicatesInUnsorted list=new DuplicatesInUnsorted();
        list.head=new Node(2);
        Node second =new Node(3);
        Node third=new Node(2);
        Node fourth=new Node(4);
        Node fifth=new Node(3);
        list.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        list.removeDuplicate();
        list.print();
    }
}
