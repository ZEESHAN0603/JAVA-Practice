import java.util.*;

public class Tree_Set {
    public static void main(String[] args) {
        
        Set<Integer> ts = new TreeSet<>();
        
        //Adding elements to the TreeSet
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(50);
        System.out.println("Initial TreeSet: " + ts);

        // Removing an element from the TreeSet
        System.out.println("After removing '30': " + ts.remove(30));

        TreeSet<Integer> ts2 = new TreeSet<>(ts);

        // Checking if an element is exists in the TreeSet it is implemented by Treeset
        System.out.println("Contains '20': " + ts.contains(20));

        // Getting the Smallest and Largest element in the TreeSet it is implemented by Treeset
        System.out.println("Smallest element: " + ts2.first());
        System.out.println("Largest element: " + ts2.last());

        // Getting the next Higher and next Lower element in the TreeSet it is implemented by Treeset
        System.out.println("Higher element than '20': " + ts2.higher(20));
        System.out.println("Lower element than '20': " + ts2.lower(20));

        // Returns the given number equal or higher ele in the set
        System.out.println("Ceiling element of '25': " + ts2.ceiling(25));
        // Returns the given number equal or lower ele in the set
        System.out.println("Floor element of '25': " + ts2.floor(25));

        // Removing the first and last ele by using pollFirst and pollLast method it returns the output of removed element from the set
        System.out.println("Removed first element: " + ts2.pollFirst());
        System.out.println("Removed last element: " + ts2.pollLast());

        // Compare and Returns the elem from set 1 to set 3 using retainAll method it returns matched elem from set 1 to set 4
        Set<Integer> ts3 = new TreeSet<>();
        ts3.add(10);
        ts3.add(60);
        System.out.println("Elements in set 3: " + ts3);

        
    }
}
