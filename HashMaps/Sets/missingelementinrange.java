package HashMaps.Sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
public class missingelementinrange {
   public ArrayList<Integer> missingRange(int[] arr ,int low, int high){
    ArrayList<Integer> res = new ArrayList<>();
    HashSet<Integer> set = new HashSet<>();
    for (int num : arr){
        set.add(num);
    }
    for(int i=low;i<high;i++){
        if(!set.contains(i)){
            res.add(i);
        }
    }
    return res;
   } 
}
//    public ArrayList<Integer> missingRange(int[] arr ,int low, int high){
//     ArrayList<Integer> res = new ArrayList<>();
//     int[] a = new int[high-low+1];
//     for (int num : arr){
//         a[num-low] = 1;
//     }
//     for(int i=low;i<high;i++){
//         if(a[i-low] == 0){
//             res.add(i);
//         }
//     }
//     return res;
//    } 
// public ArrayList<Integer> missingRange(int[] arr ,int low, int high){
//     Arrays.sort(arr);
//     ArrayList<Integer> res = new ArrayList<>();
//     int current = low;
//     for(int num : arr){
//         if(num <low) continue;
//         if(num > high) break;
//         while(current < num){
//             res.add(current);
//             current++;
//         }
//         current = num + 1;

//     }
//     while(current <= high){
//         res.add(current);
//         current++;
//     }
//     return res;
// }

// class Solution {
//     public List<Integer> findMissingElements(int[] nums) {
//         Arrays.sort(nums);
//         ArrayList<Integer> res = new ArrayList<>();
//         int n = nums.length;
//         int curr = nums[0];
        
//        for(int num : nums) {

//             while(curr < num) {
//                 res.add(curr);
//                 curr++;
//             }

//             curr = num + 1;
//         }

//         return res;
        
//     }
// }