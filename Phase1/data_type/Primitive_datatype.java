package data_type;

// Creation of variables for primitive data types
public class Primitive_datatype {
    byte a = 1;
    short b = 30;
    int c = 100;
    long d = 1000L;
    float e = 10.0f;
    double f = 20.929238d;
    char g = 'a';
    boolean h = true;

// Creation of inner class variables for boolean data type
public class Booleanex{
    boolean isCorrect = true;
}
    // Main method to run
    public static void main(String[] args) {

        // Create an obj for use the primitive data type variables
        Primitive_datatype obj = new Primitive_datatype();
        System.out.println("Byte value: " + obj.a);
        System.out.println("Short value: " + obj.b);
        System.out.println("Integer value: " + obj.c);
        System.out.println("Long value: " + obj.d);
        System.out.println("Float value: " + obj.e);
        System.out.println("Double value: " + obj.f);
        System.out.println("Character value: " + obj.g);
        System.out.println("Boolean value: " + obj.h);

        // Simple prgm for add of two num
        int x = 100;
        int y = 200;
        System.out.println("Addition of x and y: " +(x+y));

        // Create an obj for use the inner cls boolean data type variable
        Booleanex obj2 = obj.new Booleanex(); // obj.new Booleanex() why becoz boolean cls is inside the primitiive datatype cls so we need to create obj of outer cls first then we can create obj of inner cls
        if(obj2.isCorrect){
            System.out.println("The value is true");
        }
        else{
            System.out.println("The value is false");
        }

    }
}
