package HashMaps;
import java.util.HashSet;
public class sets_stl {
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("Hello"); // Duplicate, will not be added

        System.out.println(set); // Output: [Hello, World]

        // Check if an element exists
        System.out.println(set.contains("Hello")); // Output: true
        System.out.println(set.contains("Java"));  // Output: false

        // Remove an element
        set.remove("World");
        System.out.println(set); // Output: [Hello]

        // Iterate through the set
        for (String s : set) {
            System.out.println(s);
        }
    }
}
    