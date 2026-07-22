public class DiameterTree {

    static int diameter = 0;

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

        int left = height(root.left);
        int right = height(root.right);

        diameter = Math.max(diameter, left + right + 2);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        height(root);

        System.out.println(diameter);
    }
}