import java.util.*;

public class BinaryTree {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    Scanner sc = new Scanner(System.in);

    // Build tree recursively
    public Node buildTree() {
        System.out.print("Enter value (-1 for no node): ");
        int val = sc.nextInt();

        if (val == -1) {
            return null;
        }

        Node root = new Node(val);

        System.out.println("Enter left of " + val);
        root.left = buildTree();

        System.out.println("Enter right of " + val);
        root.right = buildTree();

        return root;
    }

    // Inorder traversal
    public void inorder(Node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        System.out.println("Build your tree:");
        Node root = bt.buildTree();

        System.out.println("\nInorder traversal:");
        bt.inorder(root);
    }
}