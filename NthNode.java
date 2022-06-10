public class NthNode {
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
    public int getNth(int indexx){
        Node n=head;
        int count=0;
        while (n!=null){
            if(count==indexx){
                return n.data;
            }
            count++;
            n=n.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        NthNode list=new NthNode();
        list.head = new Node(1);
        Node second= new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        list.head.next=second;
        second.next=third;
        third.next=fourth;
        list.print();
        System.out.println();
        System.out.println(list.getNth(2));
    }
}
