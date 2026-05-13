package HashMaps.Maps;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
}
class pair{
    Node node;
    int dist;
    pair(Node node,int dist){
        this.node = node;
        this.dist = dist;
    }
}
public class topviewbt {
    static ArrayList<Integer> topview(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root,0));
        int minDist = Integer.MAX_VALUE;
        int maxDist = Integer.MIN_VALUE;
        while(q.size()>0){
            pair front = q.remove();
            Node node = front.node;
            int dist = front.dist;
            minDist = Math.min(dist,minDist);
            maxDist = Math.max(dist,maxDist);
            if(!map.containsKey(dist)){
                map.put(dist,node.data);
            }
            if(node.left!=null){
                q.add(new pair(node.left,dist-1));
            }
            if(node.right!=null){
                q.add(new pair(node.right,dist+1));
            }
        }
        for(int i=minDist;i<=maxDist;i++){
            ans.add(map.get(i));
        }
        return ans;  
    }
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

// class Solution {

//     class Tuple {
//         TreeNode node;
//         int row;
//         int col;

//         Tuple(TreeNode node, int row, int col) {
//             this.node = node;
//             this.row = row;
//             this.col = col;
//         }
//     }

//     public List<List<Integer>> verticalTraversal(TreeNode root) {

//         // col -> row -> minHeap(values)
//         TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map
//                 = new TreeMap<>();

//         Queue<Tuple> q = new LinkedList<>();
//         q.offer(new Tuple(root, 0, 0));

//         while (!q.isEmpty()) {

//             Tuple t = q.poll();

//             TreeNode node = t.node;
//             int row = t.row;
//             int col = t.col;

//             map.putIfAbsent(col, new TreeMap<>());

//             map.get(col).putIfAbsent(row, new PriorityQueue<>());

//             map.get(col).get(row).offer(node.val);

//             if (node.left != null) {
//                 q.offer(new Tuple(node.left, row + 1, col - 1));
//             }

//             if (node.right != null) {
//                 q.offer(new Tuple(node.right, row + 1, col + 1));
//             }
//         }

//         List<List<Integer>> ans = new ArrayList<>();

//         for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {

//             List<Integer> list = new ArrayList<>();

//             for (PriorityQueue<Integer> pq : rows.values()) {

//                 while (!pq.isEmpty()) {
//                     list.add(pq.poll());
//                 }
//             }

//             ans.add(list);
//         }

//         return ans;
//     }
// }