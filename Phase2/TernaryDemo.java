package Phase2;

import java.util.Scanner;

public class TernaryDemo {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        System.out.println(num>=0?"Positive":"Negative");

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter two values: ");
        int a = sc1.nextInt();
        int b = sc1.nextInt();
        System.out.println(a>b?"Larger":"Smaller");

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num2 = sc2.nextInt();
        System.out.println(num2%2==0?"Even":"Odd");

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the mark: ");
        int mark = sc3.nextInt();
        System.out.println(mark>=90?"A":mark>=80?"B":mark>=40?"C":"F");



    }


}
