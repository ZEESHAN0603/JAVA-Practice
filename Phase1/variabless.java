// Creation of Variables
public class variabless {
    String name;
    int age;
    float CGPA;

    //Main method to run this program
    public static void main(String[] args) {

        // Create obj for use the variables
        variabless obj1 = new variabless();
        obj1.name = "Zeeshan";
        obj1.age = 20;
        obj1.CGPA = 9.0f;
        System.out.println("Name: " + obj1.name);
        System.out.println("Age: " + obj1.age);
        System.out.println("CGPA: " + obj1.CGPA);

        // Create a another obj for another set of variables
        variabless obj2 = new variabless();
        obj2.name = "Ali";
        obj2.age = 21;
        obj2.CGPA = 8.5f;   
        System.out.println("Name: " + obj2.name);
        System.out.println("Age: " + obj2.age);
        System.out.println("CGPA: " + obj2.CGPA);

        int a = 10;
        int b = 20;
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swap Value of a: " + a);
        System.out.println("After swap Value of b: " + b);

    }
}
