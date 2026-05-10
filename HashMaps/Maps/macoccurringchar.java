package HashMaps.Maps;
import java.util.HashMap;
public class macoccurringchar {
    // public char mostOccurringChar(String str) {
    //     int[] freq = new int[256]; // Assuming ASCII character set
    //     for (char c : str.toCharArray()) {
    //         freq[c]++;
    //     }
    //     char mostOccurring = ' ';
    //     int maxFreq = 0;
    //     for (int i = 0; i < freq.length; i++) {
    //         if (freq[i] > maxFreq) {
    //             maxFreq = freq[i];
    //             mostOccurring = (char) i;
    //         }
    //     }
    //     return mostOccurring;
    // }

    public char getMaxOccurringChar(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        int maxFreq = 0;
        for(char ch : map.keySet()){
           int freq = map.get(ch);
           if(freq > maxFreq){
            maxFreq = freq;
           }
        }
        char ans = s.charAt(0);
        for(char ch : map.keySet()){
            if(map.get(ch) == maxFreq){
                ans = ch;
                break;
            }
        }
        return ans;
    }
}
