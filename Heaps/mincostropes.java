package Heaps;

import java.util.PriorityQueue;
// import java.util.Collections;                       
public class mincostropes {
    class Solution {
    public int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // int sum=0;
        int cost =0;
        for(int ele :arr){
            pq.add(ele);
        }
        while(pq.size()>1){
            int x = (pq.peek() == null) ? 0 : pq.poll();
            int y = (pq.peek() == null) ? 0 : pq.poll();
            int  sum = x + y;
            cost += sum;
            pq.add(sum);            
        }
        return cost;
// diff bwt pq.remove() and pq.poll() is that remove() throws an exception if the queue is empty, while poll() returns null.
        
    }
}












// PriorityQueue<Integer> pq = new PriorityQueue<>();
//         for(int num : arr){
//             pq.add(num);
//         }
//         int cost = 0;
//         while(pq.size()>1){
//             int a = pq.remove();
//             int b = pq.remove();
//             int sum = a + b;
//             cost += sum ;
//             pq.add(sum);
//         }
//         return cost;
}
