import java.util.*;

class Main {

    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    // Function to create balanced BST
    public static Node buildBST(int[] arr, int start, int end) {

        if (start > end)
            return null;

        int mid = (start + end) / 2;

        Node root = new Node(arr[mid]);

        root.left = buildBST(arr, start, mid - 1);
        root.right = buildBST(arr, mid + 1, end);

        return root;
    }

    // Preorder traversal with required format
    public static void display(Node node) {

        if (node == null)
            return;

        String left = (node.left != null) ? String.valueOf(node.left.val) : ".";
        String right = (node.right != null) ? String.valueOf(node.right.val) : ".";

        System.out.println(left + " <- " + node.val + " -> " + right);

        display(node.left);
        display(node.right);
    }

    public static void userLogic(int N, int[] arr) {

        // Sort array first
        Arrays.sort(arr);

        // Build balanced BST
        Node root = buildBST(arr, 0, N - 1);

        // Print preorder traversal
        display(root);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();

        userLogic(N, arr);
    }
}