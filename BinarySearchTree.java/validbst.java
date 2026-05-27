import java.util.*;
public class validbst {

//  * Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
 
class Solution {
    // public boolean isValidBST(TreeNode root) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     inorder(root,ans);
    //     for(int i=0;i<ans.size()-1;i++){
    //         if(ans.get(i)<ans.get(i+1)){
    //         }else{
    //             return false;
    //         }
    //     }
    //     return true ;
    // }
    // public void inorder(TreeNode root,ArrayList<Integer> ans){
    //     if(root==null) return ;
    //     inorder(root.left,ans);
    //     ans.add(root.val);
    //     inorder(root.right,ans);
    TreeNode prev = null;

    public boolean isValidBST(TreeNode root) {

        if(root == null){
            return true;
        }

        // left subtree
        if(!isValidBST(root.left)){
            return false;
        }

        // current node check
        if(prev != null && prev.val >= root.val){
            return false;
        }

        prev = root;

        // right subtree
        return isValidBST(root.right);
    }

}
}
