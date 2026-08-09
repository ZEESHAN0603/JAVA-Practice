import java.util.Scanner;

public class Constant {
    static final int MAX_USERS = 11;
    public static void main(String[] args) {
        

        final float PI =  3.1423f;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int R = sc.nextInt();
        float area = PI*R*R;
        System.out.println("Area of Circle: " + area);

        final int age;
        age = 19;
        System.out.println("After Declare the Final key: "+age);

        if(MAX_USERS<=10){
            System.out.println("It's Good");
        }
        else{
            System.out.println("Crashed");
        }

        final int GST_RATE = 10;
        final String COMPANY_NAME = "ZOHO";
        final double APP_VERSION = 2.0;
        System.out.println("CONSTANT TERM WOULDN'T CHANGE: "+GST_RATE);
        System.out.println("CONSTANT TERM WOULDN'T CHANGE: "+COMPANY_NAME);
        System.out.println("CONSTANT TERM WOULDN'T CHANGE: "+APP_VERSION);



    }
}
