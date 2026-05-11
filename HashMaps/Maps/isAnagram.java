package HashMaps.Maps;
import java.util.HashMap;
public class isAnagram {
    public boolean isAnagram(String s, String t) {
    //    HashMap<Character,Integer> smap = new HashMap<>();
    //    for(int i=0;i<s.length();i++){
    //     char ch = s.charAt(i);
    //     if(smap.containsKey(ch)){
    //         smap.put(ch,smap.get(ch)+1);
    //     } else {
    //         smap.put(ch, 1);
    //     }
    //    }
    //      HashMap<Character,Integer> tmap = new HashMap<>();
    //      for(int i=0;i<t.length();i++){
    //         char ch = t.charAt(i);
    //         if(tmap.containsKey(ch)){
    //             tmap.put(ch,tmap.get(ch)+1);
    //         } else {
    //             tmap.put(ch, 1);
    //         }
    //      }
    //      for(char ch : smap.keySet()){
    //         if(!tmap.containsKey(ch) || smap.get(ch) != tmap.get(ch)){
    //             return false;
    //         }
    //      }
    //      for(char ch : tmap.keySet()){
    //         if(!smap.containsKey(ch) || smap.get(ch) != tmap.get(ch)){
    //             return false;
    //         }
    //      }
    //      return true;

    if(s.length()!= t.length()){
        return false;
    }
    HashMap<Character,Integer> map = new HashMap<>();
    for(char ch : s.toCharArray()){
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    for(char ch : t.toCharArray())
    {
        if(!map.containsKey(ch)){
            return false;
        }
        map.put(ch,map.get(ch)-1);
        if(map.get(ch) == 0){
            map.remove(ch);
        }
    }
    return map.isEmpty();
}
}