package Phase2;
public class ArithmeticDemo{
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 4;

        // All five arithmetic operations
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2));

        // Area of a rectangle
        int length = 8;
        int width = 5;
        int area = length * width;
        System.out.println("\nArea of rectangle: " + area);

        // Average of three numbers
        double a = 10, b = 20, c = 30;
        double average = (a + b + c) / 3;
        System.out.println("\nAverage of three numbers: " + average);

        // Check even or odd
        int number = 15;
        if (number % 2 == 0)
            System.out.println("\n" + number + " is even.");
        else
            System.out.println("\n" + number + " is odd.");

        // Effect of parentheses
        int result1 = num1 + num2 * 2;        // Without parentheses
        int result2 = (num1 + num2) * 2;      // With parentheses
        System.out.println("\nWithout parentheses: " + result1);
        System.out.println("With parentheses: " + result2);
    }
}