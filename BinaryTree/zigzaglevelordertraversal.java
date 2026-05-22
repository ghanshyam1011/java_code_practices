package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class zigzaglevelordertraversal {
  
//  Definition for a binary tree node.
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean b = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                if(b==true){
                    level.add(node.val);
                }else{
                    level.add(0,node.val);
                }
                if(node.left!=null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
                b=!b;
            ans.add(level);
        }
        return ans;
    }
}
}
