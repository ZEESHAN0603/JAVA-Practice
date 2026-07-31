import java.util.*;

public class Tree_Map {
    public static void main(String[] args) {
        Map<Integer, String> TMap = new TreeMap<>();
        TreeMap<Integer, String> tm = new TreeMap<>();

        // Adding ele to the Map
        TMap.put(1, "One");
        TMap.put(2, "Two");
        TMap.put(3, "Three");
        TMap.put(4, "Four");
        TMap.put(5, "Five");
        System.out.println("Initial Tree Map" + TMap);

        tm.put(1, "One One");
        tm.put(2, "Two Two");
        tm.put(3, "Three Three");
        tm.put(4, "Four Four");
        tm.put(5, "Five Five");

        // Getting value by key
        System.out.println("Value for key 2: " + TMap.get(2));

        // Return values if it contains it returns that value if it not.. it returns default value
        System.out.println("Value for key 4 (default): " + TMap.getOrDefault(4, "Not Found"));

        // Checking the key exists in the HashMap
        System.out.println("Contains key 3: " + TMap.containsKey(3));

        // Checking the value exists in the HashMap
        System.out.println("Contains value 'Two': " + TMap.containsValue("Two"));

        // Replace the value associated with a key it will show the old value before replacing is our output
        System.out.println("Replacing value for key 2: " + TMap.replace(2, "Twenty Two"));

        // Replacing the value using replace method
        System.out.println("Replacing value for key 3: " + TMap.replace(3, "Three", "Thirty Three"));

        // Removing an element from the HashMap
        System.out.println("Removing key 2: " + TMap.remove(2));

        // Getting the First key of the Map returns the smallest key becoz it sorted the ele legacy of Treemap
        System.out.println("First key of the map" + tm.firstKey());

        // Getting the Last key of the Map returns the largest key becoz it sorted the ele legacy of Treemap
        System.out.println("Last key of the map" + tm.lastKey());

        // Getting the Higher key next of given key
        System.out.println("Given Key's next ele" + tm.higherKey(3));

        // Getting the Lowest key next of given key
        System.out.println("Given key's next ele" + tm.lowerKey(1));

        // Returns the given number equal or higher ele in the map
        System.out.println("Ceiling element of '25': " + tm.ceilingKey(2));
        // Returns the given number equal or lower ele in the map
        System.out.println("Floor element of '25': " + tm.floorKey(2));

        // Removing the first and last ele by using pollFirst and pollLast method it returns the output of removed element from the set
        System.out.println("Removed first element: " + tm.pollFirstEntry());
        System.out.println("Removed last element: " + tm.pollLastEntry());

        // Getting the size of the HashMap
        System.out.println("Size of HashMap: " + TMap.size());

        // Getting all keys from the HashMap
        System.out.println("Keys in HashMap: " + TMap.keySet());

        // Getting all values from the HashMap
        System.out.println("Values in HashMap: " + TMap.values());

        // Getting all entries from the HashMap
        System.out.println("Entries in HashMap: " + TMap.entrySet());
    }
}
