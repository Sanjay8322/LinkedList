public class LinkedList {
    Node head;
    static class  Node{
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
    public void insertAtStart(int data){
        Node n = new Node(data);
        n.next=head;
        head=n;
    }

    public void insertAt(int position,int data){
        Node n = new Node(data);
        Node temp=head;
        for(int i=0;i<position-1;i++){
            temp=temp.next;
        }
        n.next=temp.next.next;
        temp.next=n;
    }
    public void insertAtnextNode(Node prevNode , int data){
        Node n=new Node(data);
        if(prevNode==null){
            System.out.println("not possible");
            return;
        }
        n.next=prevNode.next;
        prevNode.next=n;
    }
    public void insertAtend(int data){
        Node n=new Node(data);
        n.next=null;
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;
        return;
    }
    public void delete(int key){
        Node temp=head,prev= null;
        if(temp!=null && temp.data==key){
            head=temp.next;
            return;
        }
        while (temp!= null && temp.data!=key){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
    public void  deleteAtPosition(int position){
        Node temp=head;
        if(position ==0){
            head=temp.next;
            return;
        }
        for(int i=0;i<position-1;i++){
            temp=temp.next;
        }
        Node ne= temp.next.next;
        temp.next=ne;

    }
//    public void deleteList(){
//        head=null;
//    }

    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.head = new Node(1);
        Node second=new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        list.head.next = second;
        second.next=third;
        third.next=fourth;
        list.insertAtStart(8);
        list.insertAt(2,9);
        list.insertAtnextNode(third,11);
        list.insertAtend(19);
        list.delete(11);
        list.deleteAtPosition(3);
//        list.deleteList();
        list.print();

    }
}