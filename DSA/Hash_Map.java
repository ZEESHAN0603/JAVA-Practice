import java.util.*;

public class Hash_Map {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();

        // Adding elements to the HashMap
        hm.put(1, "One");
        hm.put(2, "Two");
        hm.put(3, "Three");
        hm.put(4, "Four");
        hm.put(5, "Five");
        hm.put(6, "Six");
        System.out.println("Initial HashMap: " + hm);

        // Getting the value associated with a key
        System.out.println("Value for key 2: " + hm.get(2));

        // Return values if it contains it returns that value if it not.. it returns default value
        System.out.println("Value for key 4 (default): " + hm.getOrDefault(4, "Not Found"));

        // Checking the key exists in the HashMap
        System.out.println("Contains key 3: " + hm.containsKey(3));

        // Checking the value exists in the HashMap
        System.out.println("Contains value 'Two': " + hm.containsValue("Two"));

        // Replace the value associated with a key it will show the old value before replacing is our output
        System.out.println("Replacing value for key 2: " + hm.replace(2, "Twenty Two"));

        // Replacing the value using replace method
        System.out.println("Replacing value for key 3: " + hm.replace(3, "Three", "Thirty Three"));

        // Removing an element from the HashMap
        System.out.println("Removing key 2: " + hm.remove(2));

        // Getting the size of the HashMap
        System.out.println("Size of HashMap: " + hm.size());

        // Getting all keys from the HashMap
        System.out.println("Keys in HashMap: " + hm.keySet());

        // Getting all values from the HashMap
        System.out.println("Values in HashMap: " + hm.values());

        // Getting all entries from the HashMap
        System.out.println("Entries in HashMap: " + hm.entrySet());
    }
}
