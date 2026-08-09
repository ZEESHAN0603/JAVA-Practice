package Phase2;

public class LogicalDemo {
    public static void main(String[] args) {
        
        // And Operator 
        int marks = 40;
        int attendance = 80;
        if(marks >= 35 && attendance >= 75){
            System.out.println("Pass status: ");
        }
        else{
            System.out.println("Failed");
        }
        

        // OR Operator
        boolean Prem = false;
        int Buy = 6000;
        boolean dis = (Prem || Buy >= 5000);
        System.out.println("Discount eligible: " + dis);

        // NOR Operator
        boolean flag = true;
        System.out.println("Original flag: " + flag);
        System.out.println("Reversed flag: " + !flag);

        // Short-circuit evaluation using &&
        int x = 0;
        if (x != 0 && 10 / x > 1) {
            System.out.println("Valid division");
        } else {
            System.out.println("Short-circuited with &&, safe from error");
        }

        // Short-circuit evaluation using ||
        int y = 10;
        if (y > 5 || 10 / 0 > 1) {
            System.out.println("Short-circuited with ||, avoided error");
        }
    }
}
