import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Linked_List {
    public static void main(String[] args) {
        List<String> lst = new LinkedList<>();

        // Adding elements to the list
        lst.add("10");
        lst.add("20");
        lst.add("30");
        System.out.println("Initial list: " + lst);

        // Set element at specific index
        lst.set(2, "40");
        System.out.println("After setting element at index 2: " + lst);

        // Adding element at the first
        lst.addFirst("50");
        System.out.println("After adding element at the first: " + lst);

        // Adding element at the last
        lst.addLast("60");
        System.out.println("After adding element at the last: " + lst);

        // Getting the element using index
        System.out.println("Element at index 2: " + lst.get(2));

        // Removing element from the list
        lst.remove(1);
        System.out.println("After removing element at index 1: " + lst);

        // Check whether the element is present in the list or not
        System.out.println("Contains '60': " + lst.contains("60"));

        // Getting the size of the list
        System.out.println("Size of the list: " + lst.size());
        
        // Getting the index of the element
        System.out.println("Index of '40': " + lst.indexOf("40"));

        // For loop
        for(int i=0; i<lst.size(); i++){
            System.out.println("For Looping: " + lst.get(i));
        }

        // Iterator same as for loop but it is more efficient than for loop because it doesn't use index and it uses hasNext() and next() methods to iterate through the list
        Iterator<String> it = lst.iterator();
        while(it.hasNext()){   // hasNext() checks if there is a next element in the list or not
            System.out.println("Iterator: " + it.next());  // next() returns the next element in the list
        }

    }
}
