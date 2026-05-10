package HashMaps.Sets;
import java.util.HashSet;
public class countdistinctelements {
    static int countDistinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }
}
