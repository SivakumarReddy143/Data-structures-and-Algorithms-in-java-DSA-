public class LinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    public void insertAtEnd(int newData){
        Node newNode=new Node(newData);
        if(head==null){
            head=new Node(newData);
            return;
        }
        //newNode.next=null;
        Node temp=head;
        while (temp.next!=null) {
            temp=temp.next;
            
        }
        temp.next=newNode;
        return;
    }
    public void insertionAtBegining(int d){
        Node newNode=new Node(d);
        newNode.next=head;
        head=newNode;
    }
    public void insertAtAnyPoint(Node d,int ele) {
        if(d==null){
            System.out.println("we can't insert values after null point");
        }
        Node newNode=new Node(ele);
        newNode.next=d.next;
        d.next=newNode;
    }
    public void printNodes(){
        Node current=head;
        while (current!=null) {
            System.out.println(current.data+" ");
            current=current.next; 
        }
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.insertAtEnd(23);
        ll.insertAtEnd(13);
        ll.insertAtEnd(90);
        ll.insertAtEnd(45);
        ll.insertAtEnd(134);
        ll.insertionAtBegining(234);
        ll.insertAtAnyPoint(ll.head,45);
        ll.insertAtEnd(59);
        ll.printNodes();
        System.out.println();
        
    }
}
