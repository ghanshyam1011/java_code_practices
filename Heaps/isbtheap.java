package Heaps;
class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class solution{
    boolean isHeap(Node root){
        s = size(root);
        return isMaxHeap(root) && isCBT(root,1);
    } 
    private int size(Node root){
        if(root==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    private boolean isCBT(Node root,int idx){
        if(root==null) return true;
        if(idx>s) return false;
        return isCBT(root.left,2*idx) && isCBT(root.right,2*idx+1);
    }
    private boolean isMaxHeap(Node root){
        if(root==null) return true;
        if(root.left!=null && root.data<root.left.data) return false;
        if(root.right!=null && root.data<root.right.data) return false;
        return isMaxHeap(root.left) && isMaxHeap(root.right);
    }                                        
     int s;
}