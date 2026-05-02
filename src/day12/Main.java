package day12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("-------------Transactions------------------");

        List<Transaction> transactions = new ArrayList<>();

        transactions.add(Transaction.debit("T1", "ACC1", 5000));
        transactions.add(Transaction.credit("T2", "ACC1", 10000));
        transactions.add(Transaction.debit("T3", "ACC2", 2000));
        transactions.add(Transaction.credit("T4", "ACC3", 7000));
        transactions.add(Transaction.debit("T5", "ACC4", 1500));

        // Print all transactions with signed amounts
        System.out.println("All Transactions:");
        for (Transaction t : transactions) {
            System.out.println(t);
        }

        // Filter DEBIT transactions
        System.out.println("\nDEBIT Transactions:");
        for (Transaction t : transactions) {
            if (t.getType() == TransactionType.DEBIT) {
                System.out.println(t);
            }
        }

        // Calculate total net balance change
        double net = 0;
        for (Transaction t : transactions) {
            net += t.getSignedAmount();
        }

        System.out.println("\nNet Balance Change: " + net);

        System.out.println("-------------OrderStatus------------------");

        Order o1=new Order("01","Laptop",80000);
        Order o2=new Order("02","Phone",30000);
        Order o3=new Order("03","Headphones",2000);

        o1.printStatus();
        o1.transition(OrderStatus.CONFIRMED);
        o1.transition(OrderStatus.SHIPPED);
        o1.transition(OrderStatus.DELIVERED);
        o1.printStatus();

        try{
            o2.transition(OrderStatus.SHIPPED);
        }catch (IllegalStateException e){
            System.out.println("Caught error: " + e.getMessage());
        }

        try{
            o1.transition(OrderStatus.CANCELLED);
        }catch (IllegalStateException e){
            System.out.println("Caught error: " + e.getMessage());
        }

        System.out.println("-------------Months------------------");

        System.out.println("All Months: ");
        for(Month m: Month.values()){
            System.out.println(m + " -> Number: " + m.getMonthNumber() + ", Days: " + m.getDaysInMonth());
        }

        for (Month m: Month.values()){
            if(m.isQuarter()){
                System.out.println(m);
            }
        }

        // Valid lookup
        Month july = Month.fromNumber(7);
        System.out.println("\nMonth for 7: " + july);

        // Invalid lookup
        try {
            Month invalid = Month.fromNumber(13);
            System.out.println(invalid);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught error: " + e.getMessage());
        }

    }
}
