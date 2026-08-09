import java.util.*;

public class Linked_Hash_Set {
    public static void main(String[] args) {
        
        Set<String> lhs = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        lhs.add("One");
        lhs.add("Two");
        lhs.add("Three");
        lhs.add("Four");
        System.out.println("Initial LinkedHashSet: " + lhs);

        // Removing an element from the LinkedHashSet
        System.out.println("After removing 'Two': " + lhs.remove("Two"));

        // Checking if an element is present in the LinkedHashSet
        System.out.println("Contains 'Three': " + lhs.contains("Three"));

        // Getting the size of the LinkedHashSet
        System.out.println("Size of the LinkedHashSet: " + lhs.size());

        // Checking if the LinkedHashSet is empty
        System.out.println("Is the LinkedHashSet empty? " + lhs.isEmpty());

        // Contain the elements of the LinkedHashSet in an array
        Set<String> lhs2 = new LinkedHashSet<>();
        lhs2.add("One");
        lhs2.add("Two");
        System.out.println("Elements in the new LinkedHashSet: " + lhs2);
    }
}
