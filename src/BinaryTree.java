import java.util.Scanner;
public class BinaryTree {

    public BinaryTree(){

    }
    private static class Node {
        int value;
        Node left;
        Node right;
        public Node(int value) {
            this.value = value;
        }
    }
    private Node root;

    //insert elements
    public void populate(Scanner scanner) {
        System.out.println("Enter the root node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }
    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to enter the left value " + node.value);
        boolean left = scanner.nextBoolean();
        if(left) {
            System.out.println("Enter the value of the left " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to enter the right value " + node.value);
        boolean right = scanner.nextBoolean();
        if(right) {
            System.out.println("Enter the value of the right " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }
}
