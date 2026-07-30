import java.util.*;

public class Priority_Queue {
    public static void main(String[] args) {
        
        Queue<Integer> pq = new PriorityQueue<>();

        // Adding elements to the priority queue it will sort the elements in ascending order
        pq.add(100);
        pq.add(50);
        pq.add(200);
        pq.add(25);
        System.out.println("Priority Queue: " + pq);

        // Add ele to the queue using offer method if the insertion is fails it returns false
        pq.offer(75);
        System.out.println("After adding an element using offer: " + pq);

        // Removing ele using poll method it returns null if the queue is empty it returns the removed element from the queue
        System.out.println("After removing an element using poll: " + pq.poll());

        // Removing ele using remove method it removes the head of the queue it returns the removed element from the queue
        System.out.println("After removing an element using remove: " + pq.remove());

        // Viewing the Highest priority element using peek method
        System.out.println("Highest priority element using peek: " + pq.peek());

        // Viewing the Head of que using element method it throws exception if the queue is empty
        System.out.println("Head of the queue using element: " + pq.element());

        // Removing specific element from the queue
        System.out.println("After removing specific element '50': " + pq.remove(50));

        // Checking the element present in the queue or not
        System.out.println("Contains '200': " + pq.contains(200));

        // Getting the size of the queue
        System.out.println("Size of the Priority Queue: " + pq.size());

    }
    
}
