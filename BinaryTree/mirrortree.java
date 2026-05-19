package BinaryTree;

public class mirrortree {
    class Node{
        int val;
        Node left,right;
        Node(int val){
            this.val = val;
        }
    }
    void mirror(Node root){
        if(root == null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
     
}
