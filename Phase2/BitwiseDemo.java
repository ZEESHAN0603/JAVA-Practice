package Phase2;

public class BitwiseDemo {
    public static void main(String[] args) {
        
        // 12 & 10
        int  AND = 12 & 10;
        System.out.println("12 & 10 = " + AND); // 8

        // 12 | 10
        int OR = 12 | 10;
        System.out.println("12 | 10 = " + OR); // 14

        // 12 ^ 10
        int XOR = 12 ^ 10;
        System.out.println("12 ^ 10 = " + XOR); // 6

        // Complement of 5
        int COMP = ~5;
        System.out.println("~5 = " + COMP); // -6 it first do the 1's complement then goes to 2's complement and reverse that is answer
    }
}
