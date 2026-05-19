package BinaryTree;

public class btstl {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
            // Constructing the binary tree
            //   a
            //  / \
            //  b  c
            //    / \     
            //    d   e 
          Node a = new Node(1);
          Node b = new Node(2); 
          Node c = new Node(3);
          Node d = new Node(4);
          Node e = new Node(5);
            a.left = b;
            a.right = c;
            b.left = d;
            b.right = e;
            display(a); 
            System.out.println(size(a));
            System.out.println(sum(a));
            System.out.println(Product(a));
            System.out.println(max(a)); 
            System.out.println(min(a));
            System.out.println(maxlevel(a));
                System.out.println("Inorder Traversal:");
                inorder(a);
                System.out.println("\nPreorder Traversal:");
                preOrder(a);
                System.out.println("\nPostorder Traversal:");
                postOrder(a);                 
    }
    public static int size(Node root){
        // if(root == null) return 0;
        // int leftSize = size(root.left);
        // int rightSize = size(root.right);
        return (root == null) ? 0 : size(root.left) + size(root.right) + 1;
    }

    public static int sum(Node root){
        return (root == null) ? 0 : sum(root.left) + sum(root.right) + root.val;
    }
    public static int Product(Node root){
        return (root == null) ? 1 : Product(root.left) * Product(root.right) * root.val;
    }
    public static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int leftMax = max(root.left);
        int rightMax = max(root.right);
        return Math.max(root.val, Math.max(leftMax, rightMax));
    }

    public static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        int leftMin = min(root.left);
        int rightMin = min(root.right);
        return Math.min(root.val, Math.min(leftMin, rightMin));
    }
    public static int maxlevel(Node root){
        if(root == null) return 0;
        int leftLevel = maxlevel(root.left);
        int rightLevel = maxlevel(root.right);
        return Math.max(leftLevel, rightLevel) + 1;
    }

    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
    public static void preOrder(Node root){
            if(root == null) return;
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
        public static void postOrder(Node root){
            if(root == null) return;
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
}

