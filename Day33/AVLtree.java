public class AVLtree {

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

    private Node root;

    // Get height
    private int height(Node node) {
        return node == null ? -1 : node.height;
    }

    // Get balance factor
    private int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    // Right Rotation (LL case)
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // rotation
        x.right = y;
        y.left = T2;

        // update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // Left Rotation (RR case)
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // rotation
        y.left = x;
        x.right = T2;

        // update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    // Insert
    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        // Normal BST insertion
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insert(node.left, value);
        } else if (value > node.value) {
            node.right = insert(node.right, value);
        } else {
            return node; // duplicate not allowed
        }

        // Update height
        node.height = Math.max(height(node.left), height(node.right)) + 1;

        // Get balance factor
        int balance = getBalance(node);

        // LL Case
        if (balance > 1 && value < node.left.value) {
            return rightRotate(node);
        }

        // RR Case
        if (balance < -1 && value > node.right.value) {
            return leftRotate(node);
        }

        // LR Case
        if (balance > 1 && value > node.left.value) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL Case
        if (balance < -1 && value < node.right.value) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    // Inorder traversal
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