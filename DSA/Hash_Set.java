import java.util.*;

public class Hash_Set {
    public static void main(String[] args) {
        
        Set<String> hset1 = new HashSet<>();

        // Adding elements to the HashSet
        hset1.add("Apple");
        hset1.add("Banana");
        hset1.add("Orange");
        System.out.println("Initial Set " + hset1);

        // Adding duplicate element to the HashSet
        hset1.add("Apple");
        System.out.println("After adding duplicate element 'Apple': " + hset1);

        // Removing an element from the HashSet
        hset1.remove("Banana");
        System.out.println("After removing 'Banana': " + hset1);

        // Checking if an element is present in the HashSet
        System.out.println("Contains 'Banana': " + hset1.contains("Banana"));

        // Getting the size of the HashSet
        System.out.println("Size of the HashSet: " + hset1.size());

        // Creating a second HashSet and checking if all elements of the first set are present in the second set
        Set<String> hset2 = new HashSet<>();
        hset2.add("Orange");
        hset2.add("Banana");
        hset2.add("Apple");
        System.out.println("All elements of first set are in second set: " + hset2.containsAll(hset1));


    }
}
