import java.util.*;
public class rootToLeafBT {
    private static class Node{
        private int value;
        private Node left;
        private Node right;
        Node() {}
        Node(int value) {
            this.value = value;
        }
        Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }
    // Function to insert nodes
    public static Node insert(Node root, int value) {
        // If tree is empty, new node becomes the root
        if (root == null) {
            root = new Node(value);
            return root;
        }
        // Queue to traverse the tree and find the position to
        // insert the node
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            // Insert node as the left child of the parent node
            if (temp.left == null) {
                temp.left = new Node(value);
                break;
            }
            // If the left child is not null push it to the
            // queue
            else
                q.offer(temp.left);
            // Insert node as the right child of parent node
            if (temp.right == null) {
                temp.right = new Node(value);
                break;
            }
            // If the right child is not null push it to the
            // queue
            else
                q.offer(temp.right);
        }
        return root;
    }

    // Function for Level order tree traversal
    public static void levelOrderTraversal(Node root) {
        if (root == null)
            return;
        // Queue for level order traversal
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.print(temp.value + " ");
            // Push left child in the queue
            if (temp.left != null)
                q.offer(temp.left);
            // Push right child in the queue
            if (temp.right != null)
                q.offer(temp.right);
        }
    }

    static void rootToLeaf(Node root, int visited, List<Integer> ans) {
        if(root == null) {
            return;
        }
        if(root.left == null && root.right == null) {
            ans.add(visited * 10 + root.value);
            return;
        }
        visited = visited * 10 + root.value;
        rootToLeaf(root.left, visited, ans);
        rootToLeaf(root.right, visited, ans);
    }




    public static void main(String[] args) {
        Node root = null;
        // Insertion of nodes
        root = insert(root, 1);
        root = insert(root, 0);
        root = insert(root, 1);
        root = insert(root, 0);
        root = insert(root, 1);
        root = insert(root, 0);
        root = insert(root, 1);
        levelOrderTraversal(root);
        List<Integer> ans = new ArrayList<>();
        rootToLeaf(root, 0 , ans);

        for(int i = 0; i < ans.size(); i++) {
            System.out.println("nodes are " + ans.get(i));
        }
    }
}
