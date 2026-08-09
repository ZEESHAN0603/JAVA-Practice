public class Type_casting {
    public static void main(String[] args) {

        // Converting int to double
        int a = 100;
        double b = a;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        // byte to int
        byte c = 10;
        int d = c;
        System.out.println("Value of c: " + c);
        System.out.println("Value of d: " + d);

        // double to int
        double e = 20.5;
        int f = (int) e;
        System.out.println("Value of e: " + e);
        System.out.println("Value of f: " + f);

        // int to byte in this case the value of g is greater than the range of byte (-128 to 127) so it will give a negative value
        int g = 130;
        byte h = (byte) g;
        System.out.println("Value of g: " + g);
        System.out.println("Value of h: " + h);
    }
}