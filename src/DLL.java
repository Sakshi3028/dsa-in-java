public class DLL {

    Node head;

    // Insert at first
    public void insertFirst(int val) {
        Node node = new Node(val);

        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }

        head = node;
    }

    // Display in reverse
    public void displayRev() {
        Node node = head;
        Node last = null;

        // Go to last node
        while (node != null) {
            last = node;
            node = node.next;
        }

        // Traverse backwards
        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }

        System.out.println("END");
    }
    public void insertLast(int val){
        Node node = new Node(val);
        Node last=head;
         node.next=null;
        if(head==null){
            node.prev=null;
            head= node;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
        }

    // Display forward
    public void display() {
        Node node = head;

        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }

        System.out.println("END");
    }

    // Node class
    private class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        DLL list = new DLL();

        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);

        System.out.println("Forward:");
        list.display();

        System.out.println("Reverse:");
        list.displayRev();
    }
}