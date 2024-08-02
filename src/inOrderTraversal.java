import java.util.*;
public class inOrderTraversal {
    Node root;
    static class Node {
        Node left;
        Node right;
        int value;

        Node() {
        }

        Node(int value) {
            this.value = value;
        }

        Node(Node left, Node right, int value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        inOrderTraversal tree = new inOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.inOrder(tree.root);

    }

    public void inOrder(Node node) {
        if(node == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node current = root;


        while(current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.println(current.value + " ");
            current = current.right;
        }

    }
}
