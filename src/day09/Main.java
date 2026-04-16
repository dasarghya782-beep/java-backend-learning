package day09;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static Shape findLargest(List<Shape> shapes){
        Shape largest=shapes.getFirst();
        for(Shape s:shapes){
            if(s.area()> largest.area()){
                largest=s;
            }
        }
        return largest;
    }
    public static void main(String args[]){

        System.out.println("========== SHAPES ==========");

        List<Shape> shapes=new ArrayList<>();
        shapes.add(new Circle("Blue",5));
        shapes.add(new Rectangle("Red",6,7));
        shapes.add(new Triangle("Green",5,6,7));

        for(Shape s:shapes){
            s.printInfo();
            System.out.println();
        }

        Shape largest=findLargest(shapes);
        System.out.println("Largest shape: " + largest);

        for(Shape s:shapes){
            if(s instanceof Rectangle rectangle){
                System.out.println("Rectangle found. Is square: " + rectangle.isSquare());
            }
        }

        System.out.println("\n========== PAYMENTS ==========");

        List<Payment> payments=new ArrayList<>();
        payments.add(new CreditCardPayment("PAY001",5000,"1234567890123456","Rahul Kumar"));
        payments.add(new UPIPayment("PAY002",1500,"rahul@upi"));
        payments.add(new NetBankingPayment("PAY003",3000,"HDFC","9876543210"));

        System.out.println("--- Processing Payments ---");
        for(Payment p:payments){
            p.processPayment();
            System.out.println();
        }
        System.out.println("--- Refunding UPI Payments ---");
        for(Payment p:payments){
            if(p instanceof UPIPayment upi){
                upi.refund();
            }
        }

        System.out.println("\n--- Payment Summaries ---");
        for (Payment p : payments) {
            System.out.println(p.getPaymentSummary());
        }
    }
}
