package HashMaps.Maps;
import java.util.HashMap;
public class issubset {
    public boolean issubset(int[] a,int[] b){
        // HashMap<Integer,Integer> mapa = new HashMap<>();
        // for(int ele : a){
        //     if(mapa.containsKey(ele)){
        //         int freq = mapa.get(ele);
        //         mapa.put(ele,freq+1);
        //     }else{
        //         mapa.put(ele,1);
        //     }
        // }
        // HashMap<Integer,Integer> mapb = new HashMap<>();
        // for(int ele : b){
        //     if(!mapa.containsKey(ele)){
        //         return false;
        //     }
        //     if(mapb.containsKey(ele)){
        //         int freq = mapb.get(ele);
        //         mapb.put(ele,freq+1);
        //     }else{
        //         mapb.put(ele,1);
        //     }
        // }
        // for(int ele : b){
        //     if(mapa.get(ele) < mapb.get(ele)){
        //         return false;
        //     }
        // }
        // return true;

        HashMap<Integer,Integer> mapa = new HashMap<>();
        for(int ele : a){
            if(mapa.containsKey(ele)){
                int freq = mapa.get(ele);
                mapa.put(ele,freq+1);
            }else{
                mapa.put(ele,1);
            }
        }
        for(int ele : b){
            if(!mapa.containsKey(ele)) return false;
            int freq = mapa.get(ele);
            if(freq == 0) return false;
            mapa.put(ele,freq-1);
        }
        return true;
    }   
}             
