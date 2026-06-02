package Heaps;
import java.util.*;
class Solution {

    class Pair implements Comparable<Pair>{
        int freq;
        int ele;
        Pair(int freq,int ele){
            this.freq = freq;
            this.ele = ele;
        }

        @Override
        // the PriorityQueue behaves as a min heap.
        public int compareTo(Pair p){
            if(p.freq != this.freq){
                return this.freq - p.freq;
            }
            return this.ele - p.ele;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int ele : nums){
            hm.put(ele,hm.getOrDefault(ele,0)+1);
        }
        for(int ele : hm.keySet()){
            pq.add(new Pair(hm.get(ele), ele));
            if(pq.size()>k) pq.remove();
        }
        int[] ans = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            ans[i] = pq.remove().ele;
        }
        return ans;
    }
}