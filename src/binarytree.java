import java.util.Scanner;

public class binarytree {

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // Populate the tree
    public void populate(Scanner scanner) {

        System.out.println("Enter the root Node:");
        int value = scanner.nextInt();

        root = new Node(value);

        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {

        // Left child
        System.out.println("Do you want to enter left of " + node.value + "?");
        boolean left = scanner.nextBoolean();

        if (left) {
            System.out.println("Enter the value of left of " + node.value);
            int value = scanner.nextInt();

            node.left = new Node(value);

            populate(scanner, node.left);
        }

        // Right child
        System.out.println("Do you want to enter right of " + node.value + "?");
        boolean right = scanner.nextBoolean();

        if (right) {
            System.out.println("Enter the value of right of " + node.value);
            int value = scanner.nextInt();

            node.right = new Node(value);

            populate(scanner, node.right);
        }
    }

    // Display tree
    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {

        if (node == null) {
            return;
        }

        System.out.println(indent + node.value);

        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        binarytree tree = new binarytree();

        tree.populate(scanner);

        System.out.println("\nBinary Tree:");
        tree.display();

        scanner.close();
    }
}