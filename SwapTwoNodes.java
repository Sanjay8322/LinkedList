public class SwapTwoNodes {
    Node head;
    static  class  Node{
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
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    public void insert(int s){
        Node new_node= new Node(s);
        new_node.next=head;
        head=new_node;
    }
    public void swap(int x,int y){
        if(x==y){
            return;
        }
        Node prev=null,currX=head;
        while (currX!=null && currX.data!=x){
            prev=currX;
            currX=currX.next;
        }

        Node prevy=null,currY=head;
        while (currY!=null && currY.data!=y){
            prevy=currY;
            currY=currY.next;
        }

        if(currX==null || currY ==null){
            return;
        }
        if(prev!=null){
            prev.next=currY;
        }
        else {
            head=currX;
        }
        if(prevy!=null){
            prevy.next=currX;
        }
        else {
            head=currY;
        }
        Node temp=currX.next;
        currX.next=currY.next;
        currY.next=temp;
    }

    public static void main(String[] args) {
        SwapTwoNodes list=new SwapTwoNodes();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.print();

        list.swap(3,5);
        System.out.println();
        list.print();
    }
}
