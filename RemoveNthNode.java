public class RemoveNthNode {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(){

        }
        Node(int d){
            this.data=d;
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
    void push(int s){
        Node newNode =new Node(s);
        newNode.next=head;
        head=newNode;
    }

     static Node removeNthNode(Node head,int n){
//        Node start=head;
         Node start=new Node();
         start.next=head;
        Node fast=start;
        Node slow=start;

        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        RemoveNthNode list=new RemoveNthNode();
        list.push(6);
        list.push(5);
        list.push(3);
        list.push(1);
        list.push(4);
        list.push(2);
        list.print(list.head);

        list.head=removeNthNode(list.head, 3);

        System.out.println(
        );

        list.print(list.head);
    }
}
