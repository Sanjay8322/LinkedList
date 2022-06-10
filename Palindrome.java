//import java.util.Stack;
//
//public class Palindrome {
//    Node head;
//    static class Node{
//        int data;
//        Node next;
//        Node(int d){
//            this.data=d;
//            next=null;
//        }
//    }
//    public boolean isPalind(Node h){
//        Node temp=h;
//        Stack<Integer> st=new Stack<>();
//        while (temp!=null){
//            st.push(temp.data);
//            temp=temp.next;
//        }
//        while (h!=null){
//            int i=st.pop();
//            if(h.data==i){
//                return true;
//            }
//            else {
//                return false;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Palindrome list=new Palindrome();
//        list.head=new Node(1);
//        Node second=new Node(2);
//        Node third=new Node(2);
//        Node fourth =new Node(1);
//        list.head.next=second;
//        second.next=third;
//        third.next=fourth;
//        System.out.println(list.isPalind(list.head));
//    }
//}

public class Palindrome {
    Node head;
    Node second_half;
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
    public boolean isPalindrome(){
        Node slow=head;
        Node fast=head;
        Node prev_slow=head;
        Node midNode=null;
        boolean res=true;
        if(head!=null && head.next!=null){
            while (fast!=null && fast.next!=null){
                fast=fast.next.next;
                prev_slow=slow;
                slow=slow.next;
            }
            if(fast!=null){
                midNode=slow;
                slow=slow.next;
            }
            second_half=slow;
            prev_slow.next=null;
            reverse();
            res=check(head,second_half);
            reverse();

            if(midNode!=null){
                prev_slow.next=midNode;
                midNode.next=second_half;

            }
            else{
                prev_slow.next=second_half;
            }
        }
        return res;

    }
    public void reverse(){
        Node prev=null;
        Node current=second_half;
        Node next;
        while (current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        second_half=prev;
    }
    public boolean check(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        while (temp2!=null && temp1!=null){
            if(temp1.data ==temp2.data){
                temp1=temp1.next;
                temp2=temp2.next;
            }
            else {
                return false;
            }
            if(temp1==null && temp2 ==null){
                return true;
            }
        }
        return false;
    }
//    public void push(int data){
//        Node new_node =new Node(data);
//        new_node.next=head;
//        head=new_node;
//    }

    public static void main(String[] args) {
        Palindrome list=new Palindrome();
        list.head=new Node(1);
        Node sec=new Node(2);
        Node third=new Node(3);
        Node fourth=new Node(2);
        Node fifth=new Node(1);
        list.head.next=sec;
        sec.next=third;
        third.next=fourth;
        fourth.next=fifth;
        if(list.isPalindrome()){
            System.out.println("this is plaindrome");
        }else {
            System.out.println("not a palindrome");
        }
    }
}
