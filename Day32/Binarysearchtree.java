public class BinarySearchTree {

    // Node class
    class Node {
        int value;
        int height;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            this.height = 0;
        }
    }

    Node root;

    // Constructor
    public BinarySearchTree() {
        root = null;
    }

    // Check if tree is empty
    public boolean isEmpty() {
        return root == null;
    }

    // Get height of node
    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    // Insert method
    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }

        // update height
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        return node;
    }

    // Display (inorder traversal)
    public void display() {
        inorder(root);
    }

    private void inorder(Node node) {
        if (node == null) return;

        inorder(node.left);
        System.out.print(node.value + " ");
        inorder(node.right);
    }
}