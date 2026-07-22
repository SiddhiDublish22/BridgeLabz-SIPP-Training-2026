import java.util.*;
public public class HeightTree {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    static int height(Node root) {

        if (root == null)
            return -1;

        return Math.max(height(root.left),
                        height(root.right)) + 1;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println(height(root));
    }
} {
  
}
