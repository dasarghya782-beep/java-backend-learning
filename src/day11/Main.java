package day11;


import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args){

        System.out.println("------------BankAccount-------------");
        BankAccount acc1= new BankAccount.Builder("6501","Rahul").balance(6000).accountType("Savings").build();
        BankAccount acc2=new BankAccount.Builder("6502","Arghya").balance(6000).accountType("Savings").build();
        BankAccount acc3=new BankAccount.Builder("6503","Arnav").balance(6000).accountType("Savings").build();
        BankAccount acc4=new BankAccount.Builder("6504","Sujal").balance(6000).accountType("Savings").build();

        acc1.deposit(40000);
        acc2.deposit(50000);
        acc3.deposit(60000);
        acc4.deposit(45000);

        acc1.withdraw(30000);
        acc2.withdraw(60000);
        acc3.withdraw(60000);
        acc4.withdraw(25000);

        System.out.println("Total accounts: " + BankAccount.getTotalAccounts());
        System.out.println("Total deposits across all accounts: " + BankAccount.getTotalDepositsAllAccounts());


        System.out.println("------------Transactions-------------");

        Transactions t1=Transactions.debit("T001","ACC1001",5000);
        Transactions t2=Transactions.credit("T002","ACC1002",10000);

        // ❌ This should NOT compile (immutability check)
        // t1.amount = 2000;
        // t1.setAmount(2000);

        List<Transactions> transactions=new ArrayList<>();
        transactions.add(t1);
        transactions.add(t2);
        transactions.add(Transactions.debit("T003","ACC1003",2000));
        transactions.add(Transactions.debit("T004","ACC1004",8000));
        transactions.add(Transactions.debit("T005","ACC1005",1500));

        for (Transactions t:transactions){
            System.out.println(t);
        }

        System.out.println("------------UtilityClasses-------------");

        // Using AppConstants
        System.out.println("GST Rate: " + AppConstants.GST_RATE);
        System.out.println("Currency: " + AppConstants.DEFAULT_CURRENCY);

        // Using MathUtils
        double amount = 12345.6789;

        System.out.println("Rounded: " + MathUtils.roundToTwoDecimals(amount));
        System.out.println("Valid Amount: " + MathUtils.isValidAmount(amount));

        double si = MathUtils.calculateSimpleInterest(10000, 5, 2);
        double ci = MathUtils.calculateCompoundInterest(10000, 5, 2);

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);

        // ❌ This should NOT compile (constructor is private)
        // AppConstants obj = new AppConstants();

        // Reason:
        // The constructor is private, so it cannot be accessed from outside the class.
        // This prevents creating objects of a utility class.

    }
}
