public class Type_conversion {
    public static void main(String[] args) {
        
        String str1 = "100";
        int num = Integer.parseInt(str1); // Converting String to int
        System.out.println("String to int: " + num);

        int a = 200;
        String str2 = Integer.toString(a); // Converting int to String
        System.out.println("int to String: " + str2);

        String str3 = "3.14";
        double d = Double.parseDouble(str3); // Converting String to double
        System.out.println("String to double: " + d);

        Integer obj = Integer.valueOf(50); // Converting int to Integer object
        int b =  obj;
        System.out.println("Integer object to int: " + b);
    }
}
