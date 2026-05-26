package BinaryTree;

public class lowestcommonansector {
    /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null) return null;

        if(root == p || root == q) return root;

        boolean pLiesLeft = exists(root.left, p);
        boolean qLiesLeft = exists(root.left, q);

        // both on left side
        if(pLiesLeft && qLiesLeft) {
            return lowestCommonAncestor(root.left, p, q);
        }

        // both on right side
        else if(!pLiesLeft && !qLiesLeft) {
            return lowestCommonAncestor(root.right, p, q);
        }

        // one left and one right
        else {
            return root;
        }
    }

    private boolean exists(TreeNode root, TreeNode node) {

        if(root == null) return false;

        if(root == node) return true;

        return exists(root.left, node) ||
               exists(root.right, node);
    }
}
}
