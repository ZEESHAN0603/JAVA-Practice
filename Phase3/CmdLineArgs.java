package Phase3;

public class CmdLineArgs {
    public static void main(String[] args) { // Cmd input is stored in string of array string[]
        // We give the input in the terminal code using "javac Phase3\CmdLineAgrs.java java Phase3.CmdLineAgrs"
        
        // Multiple Cmd Line arguments
        System.out.println("Lang 1: "+args[0]);
        System.out.println("Lang 2: "+args[1]);
        System.out.println("Lang 3: "+args[2]);
        
        // Addition of two num
        int a = Integer.parseInt(args[3]);
        int b = Integer.parseInt(args[4]);
        int sum = a+b;
        System.out.println("Add of Two number: "+sum);

        // Fix the input to the crt format prompt using index number
        System.out.println("Name: "+args[5]);
        System.out.println("Age: "+args[6]);
        System.out.println("Marks: "+args[7]);

        // Find the largest Number
        int c = Integer.parseInt(args[8]);
        int d = Integer.parseInt(args[9]);
        if(c>d){
            System.out.println("C is Largest Number");
        }
        else if(c<d){
            System.out.println("D is Largest Number");
        }


    }
}
