package HashMaps.Maps;
import java.util.HashMap;
public abstract class longestsubstring {
    int longestSubstringwithoutrepeatingchars(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        int left =0;
        int maxlen =0;
        int right =0;
        for(right=0;right<s.length();right++){
            char ch = s.charAt(right);
            if(map.containsKey(ch) && map.get(ch) >=left){
                left = map.get(ch)+1;
            }
            map.put(ch,right);
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}
