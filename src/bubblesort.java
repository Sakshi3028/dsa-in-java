public class bubblesort {

    Node head;
    Node tail;
    int size;

    public void bubbleSort() {
        bubbleSort(size - 1, 0);
    }

    private void bubbleSort(int row, int col) {

        // Base condition
        if (row == 0) {
            return;
        }

        // Compare adjacent nodes
        if (col < row) {

            Node first = get(col);
            Node second = get(col + 1);

            // Swap if first is greater than second
            if (first.value > second.value) {

                // Case 1: first node is head
                if (first == head) {

                    head = second;

                    first.next = second.next;
                    second.next = first;

                } 
                // Case 2: second node is tail
                else if (second == tail) {

                    Node prev = get(col - 1);

                    prev.next = second;
                    second.next = first;
                    first.next = null;

                    tail = first;

                } 
                // Case 3: middle nodes
                else {

                    Node prev = get(col - 1);

                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }

            // Move to next pair
            bubbleSort(row, col + 1);

        } else {

            // Start next pass
            bubbleSort(row - 1, 0);
        }
    }

    // Get node at a particular index
    private Node get(int index) {
        Node temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp;
    }

    // Node class
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}