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
        int complement = ~5;
        System.out.println("~5 = " + complement); // -6

        // Convert 25 to binary, then perform 25 & 15
        // 25 = 11001 (binary)
        // 15 = 01111 (binary)
        int manualAnd = 25 & 15;
        System.out.println("25 & 15 = " + manualAnd); // 9
    }
}
