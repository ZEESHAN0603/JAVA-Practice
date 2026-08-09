package Phase3;

import java.util.Scanner;

public class ScannerCls { 
    public static void main(String[] args) {

        System.out.println("Enter the Values: ");
        Scanner sc1 = new Scanner(System.in);
        int sum1 = sc1.nextInt();
        int sum2 = sc1.nextInt();
        int sum3 = sc1.nextInt();
        int avg = (sum1+sum2+sum3)/3;
        System.out.println("The Avg of given three num: "+avg);

        System.out.println("Enter the Product Name: ");
        Scanner sc2 = new Scanner(System.in);
        String Prd = sc2.nextLine();
        System.out.println("Enter the Num of Quantity: ");
        int quantity = sc2.nextInt();
        System.out.println("Enter the Price of one Product: ");
        int price = sc2.nextInt();
        int total = price*quantity;
        System.out.println("Product Name: "+Prd);
        System.out.println("The total amount: "+total);

        System.out.println("The Goat of Football: ");
        Scanner sc3 = new Scanner(System.in);
        String name = sc3.nextLine();
        System.out.println("He is the Goat "+name+"!");

    }
}
