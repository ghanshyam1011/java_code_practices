package BinaryTree;

public class pathsum {
    public class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val = val;
        }
    }
    boolean haspath(Node root, int target){
        if(root == null) return false;
        if(root.left == null && root.right == null && root.val == target) return true;
        return haspath(root.left,target-root.val) || haspath(root.right,target-root.val);
    }
}
