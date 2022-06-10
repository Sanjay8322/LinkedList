public class NthNodeFromEnd {
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
//    public int Nth(int n){
//        int len=0;
//        Node temp=head;
//        while (temp!=null){
//            temp=temp.next;
//            len++;
//        }
//        if(len<n){
//            return 0;
//        }
//        temp=head;
//        for(int i=1;i<len-n+1;i++){
//            temp=temp.next;
//        }
//        return temp.data;
//    }
    public void Nth(Node head,int n){
        int i=0;
        if(head==null){
            return;
        }
        Nth(head.next,n);
        if(++i==n){
            System.out.println(head.data);
        }
    }
    public static void main(String[] args) {
        NthNodeFromEnd list=new NthNodeFromEnd();
        list.head=new Node(1);
        Node second=new Node(2);
        Node third =new Node(3);
        Node fourth = new Node(4);
        Node fifth=new Node(5);
        Node sixth=new Node(6);
        list.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=sixth;
        list.print();
        System.out.println();
        list.Nth(list.head,3);
    }
}
