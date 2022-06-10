public class SearchElement {
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
//    public boolean search(int element){
//        Node n=head;
//        while (n!=null){
//            if (n.data==element){
//                return true;
//            }
//            n=n.next;
//        }
//        return false;
//    }
    public boolean search(Node head,int element){
        if(head==null){
            return false;
        }
        if(head.data==element){
            return true;
        }
        return search(head.next,element);
    }
    public static void main(String[] args) {
        SearchElement list=new SearchElement();
        list.head=new Node(1);
        Node second=new Node(2);
        Node thid=new Node(3);
        Node fourth =new Node(4);
        list.head.next=second;
        second.next=thid;
        thid.next=fourth;
        list.print();
        System.out.println(list.search(list.head,3));
//        System.out.println(list.search(11));
    }
}
