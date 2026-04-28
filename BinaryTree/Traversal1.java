public class Traversal1 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // sametree function code
    public static boolean isSameTree(Node root1, Node root2) {
        // base case
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;

        if (root1.data != root2.data)
            return false;

        return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
    }

    // symmetric tree(mirror)
    public static boolean isSymmetric(Node left, Node right) {
        // base case
        if (left == null && right == null)
            return true;
        if (left == null || right == null)
            return false;
        if (left.data != right.data)
            return false;

        return (isSymmetric(left.left, right.right) &&
                isSymmetric(left.right, right.left));

    }

    // height of the tree
    public static int height(Node root1) {
        // base case
        if (root1 == null)
            return 0;

        int leftHeight = height(root1.left);
        int rightHeight = height(root1.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    // count nodes of the tree
    public static int count(Node root1) {
        // base case
        if (root1 == null)
            return 0;

        int leftcount = count(root1.left);
        int rightcount = count(root1.right);

        return leftcount + rightcount + 1;

    }

    // sum of the nodes
    public static int sum(Node root1) {
        // base case
        if (root1 == null)
            return 0;

        int leftSum = sum(root1.left);
        int rightSum = sum(root1.right);

        return leftSum + rightSum + root1.data;
    }

    // merge two trees
    public static Node mergeTrees(Node root1, Node root2) {
        // base cases
        if (root1 == null && root2 == null)
            return null;
        if (root1 == null)
            return root2;
        if (root2 == null)
            return root1;

        // create new node (sum of both)
        Node node = new Node(root1.data + root2.data);

        // recursively merge left & right
        node.left = mergeTrees(root1.left, root2.left);
        node.right = mergeTrees(root1.right, root2.right);

        return node;
    }

    // transform to sum tree
    public static int SumOfTree(Node root1) {
        // base case
        if (root1 == null)
            return 0;

        int LeftSum = SumOfTree(root1.left);
        int RightSum = SumOfTree(root1.right);

        int Sum = LeftSum + RightSum;

        return Sum + root1.data;
    }

    // left view of binary tree(Recursive->DFS)
    static int maxLevel = -1;

    public static void leftview(Node root1, int level) {
        // base case
        if (root1 == null)
            return;

        if (level > maxLevel) {
            System.out.print(root1.data + " ");
            maxLevel = level;
        }

        // NO return, just calls
        leftview(root1.left, level + 1);
        leftview(root1.right, level + 1);
    }

    public static void main(String[] args) {
        // Tree 1
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(2);
        root1.left.left = new Node(4);
        root1.left.right = new Node(3);
        root1.right.left = new Node(3);
        root1.right.right = new Node(4);

        // Tree 2
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(9);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        root2.right.left = new Node(6);
        root2.right.right = new Node(7);

        // System.out.println(isSameTree(root1, root2));
        // System.out.println(isSymmetric(root1.left, root1.right));
        // System.out.println("the height of the tree is : " + height(root1));
        // System.out.println("The total number of nodes are :" + count(root1));
        // System.out.println("The sum of nodes are :" + sum(root1));
        // System.out.println(mergeTrees(root1, root2));
        // System.out.println(leftview(root1, 0));
        System.out.println(SumOfTree(root1));
    }

}
