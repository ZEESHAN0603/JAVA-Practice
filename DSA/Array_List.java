import java.util.*;

public class Array_List{
    public static void main(String[] args) {
        
        List<String> lst = new ArrayList<>();
        
        // Adding elements to the list
        lst.add("Apple");
        lst.add("Banana");
        lst.add("Orange");
        lst.add("Helloooo");

        System.out.println("Initial list: " + lst);

        // Set element at specific index
        lst.set(3, "Grapes");
        System.out.println("After setting element at index 3: " + lst);

        // Adding element at specific index
        lst.add(4, "Mango");
        System.out.println("After adding element at index 4: " + lst);

        // Getting the element using index
        System.out.println("Element at index 3: " + lst.get(3));

        // Removing element from the list
        lst.remove(2);
        System.out.println("After removing element at index 2: " + lst);

        // Check whether the element is present in the list or not
        System.out.println("Contains 'Banana': " + lst.contains("Banana"));

        // Getting the size of the list
        System.out.println("Size of the list: " + lst.size());

        // Getting the index of the element
        System.out.println("Index of 'Apple': " + lst.indexOf("Apple"));

    }
}