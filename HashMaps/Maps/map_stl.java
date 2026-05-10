package HashMaps.Maps;

public class map_stl {
    public static void main(String[] args) {
        // Example usage of HashMap
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        
        // Adding key-value pairs to the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);
        
        // Accessing values using keys
        System.out.println("Value for 'One': " + map.get("One")); // Output: 1
        System.out.println("Value for 'Two': " + map.get("Two")); // Output: 2
        
        // Checking if a key exists
        System.out.println("Contains key 'Three': " + map.containsKey("Three")); // Output: true
        System.out.println("Contains key 'Four': " + map.containsKey("Four"));   // Output: false
        
        // Removing a key-value pair
        map.remove("Two");
        System.out.println("Contains key 'Two' after removal: " + map.containsKey("Two")); // Output: false
        
        // Iterating through the map
        for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
