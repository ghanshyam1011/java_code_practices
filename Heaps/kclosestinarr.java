package Heaps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    class Pair implements Comparable<Pair>{
        int diff;
        int val;
        Pair(int diff,int val){
            this.diff = diff;
            this.val = val;
        }
        @Override
        public int compareTo(Pair p){
            if(this.diff != p.diff){
                return p.diff - this.diff;
            }
            return p.val - this.val;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int num : arr){
            int diff = Math.abs(num-x);
            pq.add(new Pair(diff,num));
            if(pq.size()>k){
                pq.remove();
            }
        }
        List<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty()){
            ans.add(pq.remove().val);
        }
        Collections.sort(ans);
        return ans;
    }
}