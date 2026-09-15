public class SinglyLinkedlist {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedlist() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Insert at Head
    public void insertAthead(int data) {

        Node newNode = new Node(data);

        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }

        size++;
    }

    // Insert at Tail
    public void insertAttail(int data) {

        Node newNode = new Node(data);

        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        size++;
    }

    // Display Linked List
    public void display() {

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Main method
    public static void main(String[] args) {

        SinglyLinkedlist list = new SinglyLinkedlist();

        list.insertAthead(10);
        list.insertAthead(20);
        list.insertAthead(30);

        list.insertAttail(40);
        list.insertAttail(50);

        list.display();
    }
}