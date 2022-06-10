public class MergeTwoSortedList {
    Node head;
    static class Node{
        int data;
        Node next;
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
    static  Node merge(Node l1,Node l2){
        if(l1==null)
            System.out.print(l2.data);
        if(l2==null)
            System.out.print(l1.data);
        if(l1.data> l2.data){
            Node temp=l1;
            l1=l2;
            l2=temp;
        }
        Node res=l1;
        while (l1!=null&& l2!=null){
            Node temp=null;
            while (l1!=null && l1.data<= l2.data){
                temp=l1;
                l1=l1.next;
            }
            temp.next=l2;

            Node tempe=l1;
            l1=l2;
            l2=tempe;
        }
        return res;

    }
    void push(int s){
        Node new_node = new Node(s);
        new_node.next=head;
        head=new_node;
    }

    public static void main(String[] args) {
        MergeTwoSortedList list1=new MergeTwoSortedList();
        MergeTwoSortedList list2=new MergeTwoSortedList();
        list1.push(9);
        list1.push(7);
        list1.push(5);

        list2.push(10);
        list2.push(8);
        list2.push(4);
        list2.push(3);

        list2.print(list2.head);
        System.out.println();
        list1.print(list1.head);

        System.out.println();

        list1.head=list1.merge(list1.head, list2.head );
        list1.print(list1.head);

    }
}
