public class Traversal {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    // Preorder Traversal (Root, Left, Right)
    public static void preorderTraversal(TreeNode root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }

    // Inorder Traversal (Left, Root, Right)
    public static void inorderTraversal(TreeNode root) {
        if (root == null)
            return;

        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    // Postorder Traversal (Left, Right, Root)
    public static void postorderTraversal(TreeNode root) {
        if (root == null)
            return;

        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    // Check if two trees are same
    public static boolean isSameTree(TreeNode root1, TreeNode root2) {

        if (root1 == null && root2 == null)
            return true;

        if (root1 == null || root2 == null)
            return false;

        if (root1.val != root2.val)
            return false;

        return isSameTree(root1.left, root2.left)
                && isSameTree(root1.right, root2.right);
    }

    public static void main(String[] args) {

        // Tree 1
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.left.right = new TreeNode(5);

        // Tree 2 (same as Tree 1)
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(8);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);

        // Traversals
        System.out.print("Preorder: ");
        preorderTraversal(root1);

        System.out.print("\nInorder: ");
        inorderTraversal(root1);

        System.out.print("\nPostorder: ");
        postorderTraversal(root1);

        // Same Tree Check
        System.out.println("\nSame Tree: " + isSameTree(root1, root2));
    }
}