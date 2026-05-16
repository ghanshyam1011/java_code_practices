package HashMaps.Maps;
import java.util.HashMap;
class countkdivpairs2{
    public static long countkdivpairs(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long pairs =0;
        for(int ele : arr){
            int g1 = gcd(ele,k);
            for(int g2 : map.keySet()){
                if((long)g1*g2%k==0){
                    pairs += map.get(g2);
                }
            }
            map.put(g1,map.getOrDefault(g1,0)+1);
        }
        return pairs;

    }
    public static int gcd(int a,int b){
        // while(b!=0){
        //     // 63 % 4 = 3
        //     // gcd(63,4) = gcd(4,3)
        //     // gcd(4,3) = gcd(3,1)
        //     // 3 % 1 = 0
        //     // gcd(3,1) = 1
        //     // gcd(63,4) = 1
        //     int rem = a%b;
        //     a=b;
        //     b=rem;
        // }       
        //  return a;
        if(b==0) return a;
        return gcd(b,a%b);
    }
}