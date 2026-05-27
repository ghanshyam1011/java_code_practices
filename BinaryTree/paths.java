package BinaryTree;
import java.util.ArrayList;
public class paths {
    static class Node{
        int val;
        Node left,right;
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

        // System.out.println("Size of the tree: " + size(root));
        // System.out.println("Sum of all nodes: " + sum(root));
        // System.out.println("Product of all nodes: " + Product(root));
        // System.out.println("Maximum value in the tree: " + max(root));
        // System.out.println("Minimum value in the tree: " + min(root));
        // System.out.println("Maximum level of the tree: " + maxlevel(root));  
}
    public static ArrayList<ArrayList<Integer>> paths(Node root){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root, arr, ans);
        return ans;
    }
    public static void dfs(Node root,ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> ans){
        if(root == null) return ;
        if(root.left == null && root.right == null){
            // arr.add(root.val);
            ArrayList<Integer> list = new ArrayList<>(arr);
            list.addAll(arr);
            ans.add(list);
        }
        // arr.add(root.val);
        dfs(root.left, arr, ans);
        dfs(root.right, arr, ans);
        arr.remove(arr.size() - 1);
    }

}
