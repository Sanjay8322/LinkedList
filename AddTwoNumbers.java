public class AddTwoNumbers {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(){

        }
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
    void push(int d){
        Node newNode=new Node(d);
        newNode.next=head;
        head=newNode;
    }

    static Node addtwo(Node l1,Node l2){
        Node dummy=new Node();
        Node temp=dummy;
        int carry=0;
        while (l1!=null || l2!=null || carry==1){
            int sum=0;
            if(l1!=null){
                sum+=l1.data;
                l1=l1.next;
            }
            if(l2!=null){
                sum+= l2.data;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            Node haha =new Node(sum%10);
            temp.next=haha;
            temp=temp.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers list1=new AddTwoNumbers();
        AddTwoNumbers list2=new AddTwoNumbers();
        list1.push(3);
        list1.push(4);
        list1.push(2);

        list2.push(9);
        list2.push(7);
        list2.push(6);
        list2.push(5);

        list1.head=addtwo(list1.head, list2.head);
        list1.print(list1.head);

    }
}
