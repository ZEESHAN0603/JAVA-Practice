public class Type_promotion {
    public static void main(String[] args) {

        // Byte to int promotion it automatically promoted to the larger data type
        byte a = 10;
        byte b = 20;
        int c = a+b;
        System.out.println("Value of c: " + c);

        int d = 100;
        double e = 200.5;
        double f = d+e;
        System.out.println("Value of f: " + f);

        char g = 'Z';
        System.out.println("Value of g: " + g+1);

        long h = 1000L;
        float i = 20.5f;
        float j = h+i;
        System.out.println("Value of j: " + j);

        byte k = 10;
        short l = 20;
        int m = 30;
        double n = 40L;
        System.out.println("Value of 4 variables: " + k+l+m+n);
    }
}
