//import java.util.*;
////class Node {
////    int value;
////    Node left;
////    Node right;
////    Node() {
////    }
////    Node(int value) {
////        this.value = value;
////    }
////    Node(Node left, Node right, int value) {
////        this.left = left;
////        this.right = right;
////        this.value = value;
////    }
////}
//public class levelOrderTraversing {
//    Node root;
//
//    void levelOrder() {
//        Queue<Node> queue = new LinkedList<>();
//
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            Node tempNode = queue.poll();
//            System.out.println(tempNode.value+ " ");
//
//            if(tempNode.left != null) {
//                queue.add(tempNode.left);
//            }
//
//            if(tempNode.right != null) {
//                queue.add(tempNode.right);
//            }
//        }
//    }
//
//    public static void main(String args[])
//    {
//        // Creating a binary tree and entering
//        // the nodes
//        levelOrderTraversing tree = new levelOrderTraversing();
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(3);
//        tree.root.left.left = new Node(4);
//        tree.root.left.right = new Node(5);
//
//        System.out.println("Level order traversal of binary tree is - ");
//        tree.levelOrder();
//    }
////    private void levelOrderTraversing() {
////    }
//
//}
//
