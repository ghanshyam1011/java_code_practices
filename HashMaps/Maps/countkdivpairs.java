package HashMaps.Maps;
import java.util.HashMap;
class countkdivpairs{
    public static long countkdivpairs(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            int x = ele % k;
            map.put(x,map.getOrDefault(x,0)+1);
        }
        long pairs =0;
        long zerocount = map.getOrDefault(0,0);
        pairs += zerocount*(zerocount-1)/2;
        map.remove(0);
        if(k%2==0){
            long halfcount = map.get(k/2);
            pairs += halfcount*(halfcount-1)/2;
            map.remove(k/2);
        }
        pairs *= 2;
        for(int key : map.keySet()){
            int rem = k - key;
            if(map.containsKey(rem)){
                pairs += (map.get(key))*(map.get(rem))  ;
                
            }
            
        }
        pairs /= 2;
        return (int)pairs;

    }
}
