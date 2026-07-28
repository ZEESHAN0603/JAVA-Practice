import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Vectorr {
    public static void main(String[] args) {
        List<Integer> vec = new Vector<>();

        // Adding elements to the vector
        vec.add(10);
        vec.add(20);
        vec.add(30);
        vec.add(100);
        System.out.println("Initial vector: " + vec);

        // Set element at specific index
        vec.set(3, 40);
        System.out.println("After setting element at index 3: " + vec);

        // Adding element at specific index
        vec.add(4, 50);
        System.out.println("After adding element at index 4: " + vec);

        // Getting the element using index
        System.out.println("Element at index 3: " + vec.get(3));

        // Removing element from the vector
        vec.remove(1);
        System.out.println("After removing element at index 1: " + vec);

        // Check whether the element is present in the vector or not
        System.out.println("Contains '20': " + vec.contains(20));

        // Getting the size of the vector
        System.out.println("Size of the vector: " + vec.size());

        // Getting the index of the element
        System.out.println("Index of '40': " + vec.indexOf(40));

        // Vector specific methods
        Vector<Integer> vector = new Vector<>(vec);

        vector.add(60);
        vector.add(70);
        vector.add(80);

        // Getting the First element of the vector
        System.out.println("First element of the vector: " + vector.firstElement());

        // Getting the Last element of the vector
        System.out.println("Last element of the vector: " + vector.lastElement());

        // Getting the capacity of the vector
        System.out.println("Capacity of the vector: " + vector.capacity());

        // Enumeration of the vector  we can't remove elements from the list using enumeration but we can iterate through the list using enumeration
        Enumeration<Integer> enumer = vector.elements();
        while (enumer.hasMoreElements()) {
            System.out.println("Enumeration:"+ enumer.nextElement() + " ");
        }

        // Iterator of the vector we can remove elements from the list using iterator
        Iterator<Integer> it = vector.iterator();
        while (it.hasNext()) {
            System.out.print("Iterator:" + it.next() + " ");
        }
    }
}