package design_patterns.parking_lot;

import java.util.Scanner;

public class Payment {
    void makePayment(String price, String vehicleNo){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose payment options");
        System.out.println("1: UPI");
        System.out.println("2: Debit Card");
        System.out.println("3: Credit Card");
        System.out.println("Choose No : ");
        String options = sc.nextLine();
        switch (options){
            case "1":
                System.out.println("You have choosed UPI");
                System.out.println("Making "+price +" payment through UPI");
                System.out.println("Payment is done");
                break;
            case "2":
                System.out.println("You have Debit Card");
                System.out.println("Making "+price +" payment through Debit Card");
                System.out.println("Payment is done");
                break;
            case "3":
                System.out.println("You have choosed Credit Card");
                System.out.println("Making "+price +" payment through Credit Card");
                System.out.println("Payment is done");
                break;
            default:
                break;
        }
    }
}
