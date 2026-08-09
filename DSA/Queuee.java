import java.util.*;

public class Queuee {
    public static void main(String[] args) {
        
        Deque<String> deq = new ArrayDeque<>();

        // Adding elements to the queue
        deq.add("One");
        deq.add("Two");
        deq.add("Three");
        deq.add("Four");
        System.out.println("Initial Deque: " + deq);

        // Removing elements from the queue first item will be removed as it is FIFO
        deq.remove();
        System.out.println("After removing an element: " + deq);

        // Add elem to the que if the insertion is fails it throws an exception
        deq.addFirst("Zero");
        System.out.println("After adding an element at the start: " + deq);

        // Add elem to the que if the insertion is fails it throws an exception
        deq.addLast("Five");
        System.out.println("After adding an element at the end: " + deq);

        // Adding element at first using offer method avail on Deque
        deq.offerFirst("Ninee");
        System.out.println("After adding an element using offer: " + deq);

        // Adding element at last using offer method avail on Deque
        deq.offerLast("Six");
        System.out.println("After adding an element using offer: " + deq);

        // Removing the first element
        System.out.println("After removing the first element: " + deq.removeFirst());

        // Removing the last element
        System.out.println("After removing the last element: " + deq.removeLast());

        // Viewing the first element
        System.out.println("First element: " + deq.peekFirst());

        // Viewing the last element
        System.out.println("Last element: " + deq.peekLast());

        // Remove and Retrive the first ele using poll method it throws exception if the queue is empty
        System.out.println("After removing the first element using poll: " + deq.pollFirst());

        // Remove and Retrive the last ele using poll method it throws exception if the queue is empty
        System.out.println("After removing the last element using poll: " + deq.pollLast());

        // Checking the element present in the queue or not
        System.out.println("Contains 'Two': " + deq.contains("Two"));

        // Getting the size of the queue
        System.out.println("Size of the Deque: " + deq.size());

        // Descending Iterator through the queue
        System.out.print("Descending Iterator: ");
        Iterator<String> descit = deq.descendingIterator();
        while (descit.hasNext()) {
            System.out.print(descit.next() + " ");
        }
        System.out.println();

    }
}
