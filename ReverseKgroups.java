public class ReverseKgroups {
    Node head;
    static  class Node{
        int data;
        Node next;
        Node(int s){
            this.data=s;
            next=null;
        }
    }
    void print(Node head){
        Node n=head;
        while (n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    void push(int h){
        Node new_node =new Node(h);
        new_node.next=head;
        head=new_node;
    }
    static Node reverse(Node head,int k){
        Node dummy=new Node(0);
        dummy.next=head;
        int count=0;
        Node curr=dummy,prev=dummy,next=dummy;
        while (curr.next!=null){
            count++;
            curr=curr.next;
        }

        while (count>=k){
            curr=prev.next;
            next=curr.next;
            for(int i=1;i<k;i++){
                curr.next=next.next;
                next.next=prev.next;
                prev.next=next;
                next=curr.next;
            }
            prev=curr;
            count-=k;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ReverseKgroups list=new ReverseKgroups();
        list.push(8);
        list.push(7);
        list.push(6);
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.print(list.head);


        System.out.println();

        list.head=reverse(list.head, 3);

        list.print(list.head);
    }
}
