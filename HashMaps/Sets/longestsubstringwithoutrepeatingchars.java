package HashMaps.Sets;
import java.util.HashSet;
public class longestsubstringwithoutrepeatingchars {
    int longestSubstringWithoutRepeatingChars(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxlen = 0;
        while(right<s.length()){
            char ch = s.charAt(right);
            if(!set.contains(ch)){
                set.add(ch);
                right++;
                maxlen = Math.max(maxlen,right-left);
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        return maxlen;  
    }
}
                      