package HashMaps.Sets;
import java.util.HashMap;   
  
public class countPairs{
    int countPairs(int[] arr, int k) {
         HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int count =0;
        for(int num : arr){
            count += map.getOrDefault(num+k,0);
        }
        return count ;
    }
}