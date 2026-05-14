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
public class burningtree {
    static Node start;
    static HashMap<Node,Node> parent;
    public static int burntree(Node root , int target){
         start = null;
         parent = new HashMap<>();
         dfs(root,target);
         Queue<pair> q = new LinkedList<>();
         q.add(new pair(start,0));
         HashSet<Node> burned = new HashSet<>();
         burned.add(start);
         int time = Math.max(time,dist);
         while(q.size()>0){
            pair front = q.remove();
            int dist = front.dist;
            Node node = front.node;
            if(node.left!=null && !burned.contains(node.left)){
                q.add(new pair(node.left,dist+1));
                burned.add(node.left);
            }
            if(node.right!=null && !burned.contains(node.right)){
                q.add(new pair(node.right,dist+1));
                burned.add(node.right);
            }
            if(parent.containsKey(node) && !burned.contains(parent.get(node))){
                q.add(new pair(parent.get(node),dist+1));
                burned.add(parent.get(node));
            }
         }
         return time;
    }
    private static void dfs(Node root, int target){
         if(root == null) return ;
         if(root.data == target) start = root;
         if(root.left!=null) parent.put(root.left,root);
         if(root.right!=null) parent.put(root.right,root);
         dfs(root.left,target);
         dfs(root.right,target);
    }
}
