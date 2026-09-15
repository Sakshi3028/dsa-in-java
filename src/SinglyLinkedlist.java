public class SinglyLinkedlist {
    static class Node{
        int data;
        Node Next;
         Node(int data){
            this.data=data;
            this.next=null;
        
         }
    }
    private Node next;
    private Node tail;
    private int size;

    public SinglyLinkedlist(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }

    
    public static void main(String[]args){

    }
}
