package BinaryTree;


import java.util.ArrayList;
public class preorederinarraylist {
    class Node{
        int val ;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            
        }
    }
    public ArrayList<Integer> preorderTraversal(Node root){
        ArrayList<Integer> result = new ArrayList<>();
        dfs(root,result);
        return result;
    }
    public void dfs(Node root,ArrayList<Integer> result){
        if(root == null) return ;
        result.add(root.val);
        dfs(root.left,result);
        dfs(root.right,result);
    }
}
