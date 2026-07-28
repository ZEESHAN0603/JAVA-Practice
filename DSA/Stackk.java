public class Stackk {
    public static void main(String[] args) {
        java.util.Stack<String> stack = new java.util.Stack<>();

        // Adding elements to the stack
        stack.push("Python");
        stack.push("C++");
        stack.push("Java");
        stack.push("World");
        System.out.println("Initial stack: " + stack);

        // Getting the top element of the stack
        System.out.println("Top element of the stack: " + stack.peek());

        // Setting the top element of the stack
        System.out.println("After setting element at index 3: " + stack.set(3, "JavaScript"));

        // Searching for an element in the stack
        System.out.println("Position of 'C++' in the stack: " + stack.search("C++"));

        // Getting the Size of the stack
        System.out.println("Size of the stack: " + stack.size());

        // Checking the element is present in the stack or not
        System.out.println("Is 'Java' present in the stack? " + stack.contains("Java"));

        // Removing the top element from the stack
        System.out.println("After popping the top element: " + stack.pop());

        // Check whether the stack is empty or not
        System.out.println("Is the stack empty? " + stack.isEmpty());

        // Getting the First element of the stack
        System.out.println("First element of the stack: " + stack.firstElement());

        // Getting the Last element of the stack
        System.out.println("Last element of the stack: " + stack.lastElement());

        // Getting the Capacity of the stack
        System.out.println("Capacity of the stack: " + stack.capacity());

        // Getting the size of the stack
        System.out.println("Size of the stack: " + stack.size());

    }
}
