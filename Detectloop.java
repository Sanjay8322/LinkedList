//import java.util.HashSet;
//
//public class Detectloop {
//    Node head;
//    static class Node{
//        int data;
//        Node next;
//        Node(int d){
//            this.data=d;
//            next=null;
//        }
//    }
//    public void print(){
//        Node n=head;
//        while (n!=null){
//            System.out.println(n.data+" ");
//            n=n.next;
//        }
//    }
//    public boolean isLoop(Node head){
//        HashSet<Node> s=new HashSet<>();
//        while (head!=null){
//            if(s.contains(head)){
//                return true;
//            }
//            s.add(head);
//            head=head.next;
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Detectloop list=new Detectloop();
//        list.head =new Node(1);
//        Node second=new Node(2);
//        Node third =new Node(3);
//        Node fourth=new Node(4);
//        list.head.next=second;
//        second.next=third;
//        third.next=fourth;
//        fourth.next= second.next;
//        System.out.println();
//        System.out.println(list.isLoop(list.head));
//    }
//}

public class Detectloop {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }
    public void Print(){
        Node n=head;
        while (n!=null){
            System.out.println(n.data+" ");
            n=n.next;
        }
    }
//    public boolean detect() {
//        int flag=0;
//        Node slow=head;
//        Node fast=head;
//        while (slow!=null && fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//            if(slow==fast){
//                flag=1;
//                break;
//            }
//        }
//        if(flag==1){
//            return true;
//        }
//        return false;
//    }

    public boolean detect(Node h){
        if (h==null){
            return false;
        }
        else {
            while (h!=null){
                if(h.data==-1){
                    return true;
                }
                else {
                    h.data=-1;
                    h=h.next;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Detectloop list = new Detectloop();
        list.head=new Node(1);
        Node second =new Node(2);
        Node third =new Node(3);
        Node fourth =new Node(4);
        list.head.next=second;
        second.next=third;
        third.next=fourth;
//        fourth.next=third;
        System.out.println(list.detect(list.head));
    }
}