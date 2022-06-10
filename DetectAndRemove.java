import java.util.HashSet;

public class DetectAndRemove {
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
//    public int remove(){
//        Node slow=head;
//        Node fast=head;
//        while (slow!=null && fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//            if(slow==fast){
//                removeLoop(slow,head);
//                return 1;
//            }
//        }
//        return 0;
//    }
//    public void removeLoop(Node slow,Node head){
//        Node ptr1=slow;
//        Node ptr2=slow;
//        int k=1;
//        while (ptr1.next!=ptr2){
//            ptr1=ptr1.next;
//            k++;
//        }
//        ptr1=head;
//        ptr2=head;
//        for(int i=0;i<k;i++){
//            ptr2=ptr2.next;
//        }
//        while (ptr2!=ptr1){
//            ptr1=ptr1.next;
//            ptr2=ptr2.next;
//        }
//        while (ptr2.next!=ptr1){
//            ptr2=ptr2.next;
//        }
//        ptr2.next=null;
//
//    }
    public boolean remove(Node h){
        Node prev=null;
        HashSet<Node> s=new HashSet<>();
        while (h!=null){
            if(s.contains(h)){
                prev.next=null;
                return true;
            }
            else {
                s.add(h);
                prev=h;
                h=h.next;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        DetectAndRemove list=new DetectAndRemove();
        list.head=new Node(50);
        Node second=new Node(20);
        Node third=new Node(15);
        Node fourth=new Node(4);
        Node fifth=new Node(10);
        list.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=third;
        if(list.remove(list.head)){
            list.print();
        }
        else {
            System.out.println("loop not found");
        }
    }
}
