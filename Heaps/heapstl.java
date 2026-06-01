package Heaps;
import java.util.PriorityQueue;
public class heapstl {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(5);
        // total time nlogn lagta hai insertion me
        System.out.println(pq); // [5,20,10]
        System.out.println(pq.size()); // 3
        System.out.println(pq.peek()); // 5
        System.out.println(pq.contains(10)); // true
        System.out.println(pq.poll()); // 5
        System.out.println(pq.peek()); // 10
        // heap me working O(n) hota hai, aur peek me O(1) hota hai, aur poll me O(logn) hota hai, aur contains me O(n) hota hai
    
        // what is heap
        // heap is a data structure that is used to store a collection of elements in a way that allows for efficient retrieval of the minimum or maximum element. It is a binary tree that satisfies the heap property, which states that for a min-heap, the value of each node is less than or equal to the values of its children, and for a max-heap, the value of each node is greater than or equal to the values of its children. Heaps are commonly used in algorithms such as heapsort and priority queues.
        // kaisa pata lage ki sawal heap ka hai 
        // agar sawal me minimum ya maximum element nikalna hai to wo heap ka sawal hota hai, agar sawal me priority queue ka use karna hai to wo heap ka sawal hota hai, agar sawal me sorting karna hai to wo heap ka sawal hota hai, agar sawal me k smallest ya k largest element nikalna hai to wo heap ka sawal hota hai, agar sawal me median nikalna hai to wo heap ka sawal hota hai, agar sawal me merge k sorted arrays karna hai to wo heap ka sawal hota hai, agar sawal me top k frequent elements nikalna hai to wo heap ka sawal hota hai, agar sawal me kth largest element nikalna hai to wo heap ka sawal hota hai
    }
}