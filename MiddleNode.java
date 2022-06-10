//public class MiddleNode {
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
//    public void printMiddle(){
//        int len=0;
//        Node n=head;
//        while (n!=null){
//            n=n.next;
//            len++;
//        }
//        System.out.println(len);
//        int middle=len/2;
//        n=head;
//        for(int i=0;i<middle-1;i++){
//            n=n.next;
//        }
//        System.out.println(n.data);
//    }
//
//    public static void main(String[] args) {
//        MiddleNode list=new MiddleNode();
//        list.head=new Node(1);
//        Node second= new Node(2);
//        Node third=new Node(3);
//        Node fourth =new Node(4);
//        Node fifth=new Node(5);
//        Node sixth=new Node(6);
//        list.head.next=second;
//        second.next=third;
//        third.next=fourth;
//        fourth.next=fifth;
//        fifth.next=sixth;
//
//        list.print();
//        System.out.println();
//        list.printMiddle();
//    }
//}

public class MiddleNode {
    Node head;
    static  class  Node{
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
//    public void middle(){
//        Node fast_ptr=head;
//        Node slow_ptr=head;
//        while (fast_ptr!=null && fast_ptr.next!=null){
//            fast_ptr=fast_ptr.next.next;
//            slow_ptr=slow_ptr.next;
//        }
//        System.out.println("middle is "+ slow_ptr.data);
//    } // pointer
    public void middle(){
        int len=0;
        Node n=head;
        while (n!=null){
            n=n.next;
            len++;
        }
        int mid=len/2;
        n=head;
        for(int i=0;i<mid;i++){
            n=n.next;
        }
        System.out.println(n.data);
    }
    public static void main(String[] args) {
        MiddleNode list = new MiddleNode();
        list.head=new Node(1);
        Node second= new Node(2);
        Node third =new Node(3);
        Node fourth=new Node(4);
        Node fifth =new Node(5);

        list.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        list.print();
        System.out.println();
        list.middle();
    }
}