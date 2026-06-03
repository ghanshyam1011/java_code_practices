package Heaps;

class Heap{
    int[] arr;
    int size = 0;
    int idx = 1;
    int peek(){
        return arr[1];
    }
    void add(int ele){
        arr[idx++] = ele;
        int root = idx-1;
        while(root!=1){
            int parent = root/2;
            if(arr[root]<arr[parent]){
                int temp = arr[root];
                arr[root] = arr[parent];
                arr[parent] = temp;
                root = parent;
            }else break;
        }
    }
    int remove(){
        if(idx == 1) {
            System.out.println("Heap is Empty");
            return -1;
        }
        int min = arr[1];
        arr[1] = arr[idx-1];
        idx--;
        int root = 1;
        while(root<=size()){
            int left = 2*root;
            int right = 2*root+1;
            int leftval = (left<=size()) ? arr[left] : Integer.MAX_VALUE;
            int rightval = (right<=size()) ? arr[right] : Integer.MAX_VALUE;
            if(arr[root]<leftval && arr[root]<rightval) break;
            else{

             if(leftval<rightval){
                int temp = arr[root];
                arr[root] = arr[left];
                arr[left] = temp;
                root = left;
            }else{
                int temp = arr[root];
                arr[root] = arr[right];
                arr[right] = temp;
                root = right;
            }
        }
        }
        return min;

    }
    int size(){
        return idx-1;
    }
    Heap(int capacity){
        arr = new int[capacity+1];
    }

}
public class minHeapimpl {
    public static void main(String[] args) {
        Heap h = new Heap(10);
        h.add(5);
        h.add(3);
        h.add(8);
        h.add(1);
        System.out.println(h.peek());
        System.out.println(h.remove());
        System.out.println(h.peek());
    }
}
