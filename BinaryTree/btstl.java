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
    }
    public static int size(Node root){
        // if(root == null) return 0;
        // int leftSize = size(root.left);
        // int rightSize = size(root.right);
        return (root == null) ? 0 : size(root.left) + size(root.right) + 1;
    }

    public static void display(Node root){
        if(root == null) return;
        System.out.print(root.val + " ");
        display(root.left);
        display(root.right);
    }
}
