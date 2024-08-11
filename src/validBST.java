import java.util.*;
class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int value) {
        this.value = value;
    }
    TreeNode(TreeNode left, TreeNode right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }
private static class validBST {
        public boolean BST(TreeNode root) {
            return BST(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        private boolean BST(TreeNode node, long min, long max) {
            if (node == null) {
                return true;
            }
            if (node.value <= min || node.value >= max) {
                return false;
            }
            return BST(node.left, min, node.value) && BST(node.right, node.value, max);
        }
}
    private static void main(String[] args) {

        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(9);
    }
}
