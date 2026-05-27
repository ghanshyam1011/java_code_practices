
import java.util.*;

public class min {
    static class Node{
        int val;
        Node left , right;
        Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        // Constructing the binary tree
        //        a
        //      /   \
        //     b     c
        //    / \  /  \
      //     d   e f   g

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);  
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Minimum value in the tree: " + min(root));
    }
    public static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
}