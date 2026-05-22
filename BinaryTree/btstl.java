package BinaryTree;
import java.util.*;
public class btstl {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    static class pair{
        Node node;
        int level;
        pair(Node node,int level){
            this.node = node;
            this.level = level;
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
                System.out.println("\nLevel Order Traversal:");
                levelOrder(a);
                System.out.println("\nLevel Order Traversal with Levels:");
                levelOrderWithlevel(a);
                System.out.println("\nReverse Level Order Traversal:");
                reverseLevelOrder(a);
                System.out.println("\nNodes at Kth Level:");
                int k = 2; // Change this value to get nodes at different levels
                Kthlevel(a, 0, k);
                              
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
        public static void levelOrder(Node root){
            if(root == null) return;
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                Node current = queue.poll();
                System.out.print(current.val + " ");
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
            }
        }
        private static void levelOrderWithlevel(Node root) {
            if (root == null) return;
            Queue<pair> queue = new LinkedList<>();
            queue.add(new pair(root, 0));
            int currentLevel = 0;
            while (!queue.isEmpty()) {
                pair currentPair = queue.poll();
                Node currentNode = currentPair.node;
                int nodeLevel = currentPair.level;
                if (nodeLevel > currentLevel) {
                    System.out.println(); // Move to the next line for a new level
                    currentLevel = nodeLevel;
                }
                System.out.print(currentNode.val + " ");
                if (currentNode.left != null) queue.add(new pair(currentNode.left, nodeLevel + 1));
                if (currentNode.right != null) queue.add(new pair(currentNode.right, nodeLevel + 1));
            }
        } 
        public static void reverseLevelOrder(Node root){
            if(root == null) return;
            Queue<Node> queue = new LinkedList<>();
            Stack<Node> stack = new Stack<>();
            queue.add(root);
            while(!queue.isEmpty()){
                Node current = queue.poll();
                stack.push(current);
                if(current.right != null) queue.add(current.right);
                if(current.left != null) queue.add(current.left);
            }
            while(!stack.isEmpty()){
                System.out.print(stack.pop().val + " ");
            }
        }
        public static void Kthlevel(Node root,int level,int k)
        {
            if(root ==  null) return ;
            if(level == k) System.out.print(root.val + " ");
            Kthlevel(root.left, level + 1, k);
            Kthlevel(root.right, level + 1, k);
        }      
}       

