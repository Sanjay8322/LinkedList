public class LengthOfLoop {
    Node head;
    static  class Node{
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
    public int countNode(Node h){
        Node temp=h;
        int res=1;
        while (temp.next!=h){
            res++;
            temp=temp.next;
        }
        return res;
    }
    public int countLoop(){
        Node slow=head,fast=head;
        while (slow!=null && fast!=null &&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return countNode(slow);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        LengthOfLoop list=new LengthOfLoop();
        list.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(4);
        Node fifth=new Node(5);
        list.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=second;
        System.out.println(list.countLoop());
    }
}
