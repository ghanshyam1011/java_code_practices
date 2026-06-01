package Heaps;

import java.util.PriorityQueue;

public class sortarr {
    class Solution {
    public int[] sortArray(int[] nums) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       for(int num : nums){
        pq.add(num);
       }
       int idx=0;
       while(!pq.isEmpty()){
        nums[idx++] = pq.remove();
       }
       return nums;
    }
}
}
