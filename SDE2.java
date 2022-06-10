public class SDE2 {
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data=d;
            next=null;
        }
    }
    void print(){
        Node n=head;
        while (n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    void middle(){
        Node first=head;
        Node second=head;
        while (first!=null && first.next!=null){
            first=first.next.next;
            second=second.next;
        }
        System.out.println(second.data);
    }
    void push(int data){
        Node new_Node =new Node(data);
        new_Node.next=head;
        head=new_Node;
    }

    public static void main(String[] args) {
        SDE2 list =new SDE2();
        list.push(5);
        list.push(4);
        list.push(3);
        list.push(2);
        list.push(1);
        list.middle();


    }
}
