import java.util.*;

public class Linked_Hash_Map{
    public static void main(String[] args) {
        Map<Integer, String>lnhMap = new LinkedHashMap<>();

        // Adding the element to the Map
        lnhMap.put(1, "One");
        lnhMap.put(2, "Two");
        lnhMap.put(3, "Three");
        lnhMap.put(4, "Four");
        lnhMap.put(5, "Five");
        System.out.println("Initial HashMap: "+ lnhMap);

        // Getting value by key
        System.out.println("Value for key 2: " + lnhMap.get(2));

        // Return values if it contains it returns that value if it not.. it returns default value
        System.out.println("Value for key 4 (default): " + lnhMap.getOrDefault(4, "Not Found"));

        // Checking the key exists in the HashMap
        System.out.println("Contains key 3: " + lnhMap.containsKey(3));

        // Checking the value exists in the HashMap
        System.out.println("Contains value 'Two': " + lnhMap.containsValue("Two"));

        // Replace the value associated with a key it will show the old value before replacing is our output
        System.out.println("Replacing value for key 2: " + lnhMap.replace(2, "Twenty Two"));

        // Replacing the value using replace method
        System.out.println("Replacing value for key 3: " + lnhMap.replace(3, "Three", "Thirty Three"));

        // Removing an element from the HashMap
        System.out.println("Removing key 2: " + lnhMap.remove(2));

        // Getting the size of the HashMap
        System.out.println("Size of HashMap: " + lnhMap.size());

        // Getting all keys from the HashMap
        System.out.println("Keys in HashMap: " + lnhMap.keySet());

        // Getting all values from the HashMap
        System.out.println("Values in HashMap: " + lnhMap.values());

        // Getting all entries from the HashMap
        System.out.println("Entries in HashMap: " + lnhMap.entrySet());
    }
}