////public class IntersectionOfTwoSortedList {
////    static Node a=null,b=null;
////    static Node dummy=null;
////    static Node tail=null;
////    Node head;
////    static  class Node{
////        int data;
////        Node next;
////        Node(int d){
////            this.data=d;
////            next=null;
////        }
////    }
////    void print(Node head){
////        Node n=head;
////        while (n!=null){
////            System.out.print(n.data+" ");
////            n=n.next;
////        }
////    }
////    void push(int data){
////        Node temp=new Node(data);
////        if(dummy==null){
////            dummy=temp;
////            tail=temp;
////        }else {
////            tail.next=temp;
////            tail=temp;
////        }
////    }
////    void IntersectSorted(){
////        Node p=a;
////        Node q=b;
////        while (p!=null && q!=null){
////            if(p.data==q.data){
////                push(p.data);
////                p=p.next;
////                q=q.next;
////            }else if (p.data<q.data){
////                p=p.next;
////            }else {
////                q=q.next;
////            }
////        }
////    }
////
////    public static void main(String[] args) {
////        IntersectionOfTwoSortedList list=new IntersectionOfTwoSortedList();
////        list.a = new Node(1);
////        list.a.next = new Node(2);
////        list.a.next.next = new Node(3);
////        list.a.next.next.next = new Node(4);
////        list.a.next.next.next.next = new Node(6);
////
////        // creating second linked list
////        list.b = new Node(2);
////        list.b.next = new Node(4);
////        list.b.next.next = new Node(6);
////        list.b.next.next.next = new Node(8);
////
////        list.IntersectSorted();
////        list.print(dummy);
////
////    }
////}
////
//
//import java.util.HashSet;
//
//public class IntersectionOfTwoSortedList {
//
//
//    IntersectionOfLinkedList.Node head;
//    static class Node{
//        Node next;
//        int data;
//        Node(int d){
//            this.data=d;
//            next=null;
//        }
//    }
//    void push(int d){
//        Node newNode=new Node(d);
//        newNode.next=head;
//        head=newNode;
//    }
//    void print(){
//         Node n=head;
//         while (n!=null){
//             System.out.print(n.data+" ");
//             n=n.next;
//         }
//    }
//    static void intersection(Node temp1,Node temp2,int k){
//        int res[]=new int[k];
//        int count=0;
//        HashSet<Integer> set=new HashSet<>();
//        while (temp1!=null){
//            set.add(temp1.data);
//            temp1=temp1.next;
//        }
//        while (temp2!=null){
//            if(set.contains(temp2.data)){
//                res[count]=temp2.data;
//                count++;
//            }
//            temp2=temp2.next;
//        }
//        for(int i=0;i< res.length;i++){
//            System.out.print(res[i]+" ");
//        }
//    }
//
//    public static void main(String[] args) {
//        IntersectionOfTwoSortedList list1=new IntersectionOfTwoSortedList();
//        IntersectionOfTwoSortedList list2=new IntersectionOfTwoSortedList();
//        list1.push(7);
//        list1.push(6);
//        list1.push(5);
//        list1.push(4);
//        list1.push(3);
//        list1.push(2);
//        list1.push(1);
//
//        list2.push(9);
//        list2.push(7);
//        list2.push(6);
//        list2.push(5);
//        list2.push(2);
//        list2.push(1);
//        list2.push(0);
//        intersection(list1.head, list2.head, 6);
//
//
//
//    }
//}
