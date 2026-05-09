package HashMaps;
import java.util.HashSet;
public class twosum {
    boolean twosum(int arr[],int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (set.contains(target - num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
