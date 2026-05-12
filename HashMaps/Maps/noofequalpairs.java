package HashMaps.Maps;
import java.util.HashMap;
public class noofequalpairs {
    public int equalpairs(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
       for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
      }
      long ans =0;
      for(int freq:map.values()){
        ans += (long)freq * freq;;
      }
      return (int)ans;
    }
}
