package Phase2;

import java.util.Scanner;

public class RelationalDemo {
    
    public static void main(String[] args) {
        System.out.print("Enter the a and b value: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Six Relational Operators
        System.out.println("Equals: "+ (a==b));
        System.out.println("Not Equals: "+(a!=b));
        System.out.println("Greater than: "+(a>b));
        System.out.println("Less than: "+(a<b));
        System.out.println("Greater Than or Equal: "+(a>=b));
        System.out.println("Lesser than or Equal: "+(a<=b));

        // Comparison using relational
        if(a>=90){
            System.out.println("Distinction");
        }
        else if(a>=70 || a>=80){
            System.out.println("Good not bad");
        }
        else if(a==35){
            System.out.println("Fail");
        }

        // Voting Ebligity Checking
        int age = 18;
        if(age == 18){
            System.out.println("You're able to Voting");
        }
        else{
            System.out.println("You're not able to vote");
        }

        // Compare two strings
        String name1 = "IMMU";
        String name2 = "IMMU";
        System.out.println("Equals or not: "+ (name1.equals(name2)));


        
    }
    
    

}
