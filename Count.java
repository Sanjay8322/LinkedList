public class Count {
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
    public void count(int x){
        Node n=head;
        int count=0;
        while (n!=null){
            if(n.data==x){
                count++;
            }
            n=n.next;
        }
        System.out.println("occur "+ count+" times.");
    }
    public static void main(String[] args) {
        Count list=new Count();
        list.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        Node fourth =new Node(3);
        Node fifth=new Node(3);
        list.head.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        list.print();
        list.count(3);

    }
}
