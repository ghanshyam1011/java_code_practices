package BinaryTree;

public class mirror {
    class Node{
        int val;
        Node left , right;
        Node(int val){
            this.val = val;
        }
    boolean isMirror(Node p, Node q){
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val!= q.val) return false;
        return isMirror(p.left,q.left) && isMirror(p.right,q.right);
    }
    }
}
