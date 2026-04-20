package day10;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){

        System.out.println("========== SHAPES ==========");

        List<Shape> shapes=new ArrayList<>();
        shapes.add(new Circle("Red",5));
        shapes.add(new Rectangle("Blue", 4, 6));
        shapes.add(new Triangle("Green", 3, 4, 5));
        shapes.add(new Pentagon("Yellow", 3));

        for(Shape s:shapes){
            s.printInfo();

            if(s instanceof Polygon p){
                p.printSideInfo();
            }
        }
        // ❌ Compile-time error:
        // Shape s = new Shape("Red");
        // ERROR: Shape is abstract; cannot be instantiated.

        System.out.println("========== Payments ==========");

        List<Payable> payments=new ArrayList<>();
        payments.add(new CreditCardPayment("P1","1234","Arghya"));
        payments.add(new UPIPayment("P2","user@upi"));
        payments.add(new WalletPayment("P3",500));

        for(Payable p:payments){
            p.processPayment(200);
            p.printRecipt();
        }

        for(Payable p: payments){
            if(p instanceof Refundable r){
                if(r.isrefundEligible()){
                    r.processRefund(100);
                }
            }
        }

        for(Payable p: payments){
            if(p instanceof Loggable l){
                l.logTransaction("Transaction checked");
            }
        }
    }
}
