public class SinglyLinkedlist {
    static class Node{
        int data;
        Node Next;
         Node(int data){
            this.data=data;
            this.next=null;
        
         }
    }
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedlist(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
public void insertAthead(int data){
    Node newNode= new Node(data);
if(head==null && tail==null){
    head=newNode;
    tail=newNode;
}else{
    newNode.next=head;
    head=newNode;
}
}


    public static void main(String[]args){

    }
}
