public class Wrapper_cls {
    public static void main(String[] args) {

        // Conversion of primitive int to wrapper integer obj using valueOf() method
        Integer a = Integer.valueOf(10);
        System.out.println("Integer value: " + a);

        // Conversion of String wrapper obj to primitive int using parseInt() method
        String num = "100";
        int cha = Integer.parseInt(num);
        System.out.println("String to Integer: " + cha);

        // Converting the primitive int to String using toString() method
        int x = 250;
        String str = Integer.toString(x);
        System.out.println("Integer to String: " + str);

        // Priniting the Max value & Min value of int using Integer cls these are the constant values of Integer cls
        System.out.println("Maximum int value"+Integer.MAX_VALUE);
        System.out.println("Minimum int value"+Integer.MIN_VALUE);

        // Autoboxing it convert the primitive data type to wrapper cls obj automatically
        int y = 20;
        Integer b = y;
        System.out.println("Autoboxing: " + b);

        // Unboxing it convert the wrapper cls obj to primitive data type automatically
        Integer c = 40;
        int z = c;
        System.out.println("Unboxing: " + z);



    }
}
