package Phase3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderr {
    public static void main(String[] args) throws IOException  {

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("GOAT: ");
        String name = br1.readLine(); // Br always returns the string output
        System.out.println("Name: "+name);

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the two number: ");
        int num1 = Integer.parseInt(br2.readLine()); // Buffer reader always return the string output so we need to convert them into which datatype need
        int num2 = Integer.parseInt(br2.readLine());
        System.out.println("Sum of Two Number: "+ (num1+num2));
        
        BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the You're Salary: ");
        double salary = Double.parseDouble(br3.readLine()); // output in double
        System.out.println("The Salary is: "+ salary);

    }
}
