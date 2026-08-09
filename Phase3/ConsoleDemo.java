package Phase3;

import java.io.Console;
import java.util.Arrays;

public class ConsoleDemo {
    public static void main(String[] args) {
        // Create Console object
        Console cn = System.console();

        // Check the console is null or not    
        if (cn == null) {
            System.out.println("Console not available");
            return; // Exit if no console avail
        }

        // Basic Input and display
        String name = cn.readLine("Enter your name: ");
        System.out.println("Hello, " + name);

        // Password echo is disabled using readPassword key
        char[] password = cn.readPassword("Enter your password: "); //char[] means char of array why char becoz char is mutable but string is immutable password we can change or del using char not by string
        System.out.println("Password entered Length: " + password.length);

        // Login Program
        String username = cn.readLine("Username: ");
        char[] loginPassword = cn.readPassword("Password: "); // When we type pass it is not visible to us the console has special method to do this

        // Login checking  
        if (username.equals("admin") && String.valueOf(loginPassword).equals("1234")) { // we convert array of char to string cls 
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }

        // Clear password arrays for security
        Arrays.fill(password, ' '); // clear the char of array for security reasons
        Arrays.fill(loginPassword, ' '); //  this means loginPassword is filled with space 

        // Formatted Prompt
        String role = cn.readLine("Enter Your role: ");
        String Name = cn.readLine("Enter your name, %s: ", role); // %s defines the string datatype role is placed for %s
        System.out.println("Welcome, " + Name);
    }
}
