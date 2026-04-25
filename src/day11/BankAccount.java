package day11;

public class BankAccount {
    private static int totalAccounts=0;
    private static double totalDepositsAllAccounts=0;
    private static final int MAX_WITHDRAWL_LIMIT=50000;
    private final String accountNumber;
    private double balance;
    private String ownerName;
    private String accountType;

    static {
        System.out.println("BAnkAccount class initialized.");
    }

    private BankAccount(Builder builder){
        this.accountNumber=builder.accountNumber;
        this.ownerName=builder.ownerName;
        this.balance=builder.balance;
        this.accountType=builder.accountType;
        totalAccounts++;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static double getTotalDepositsAllAccounts() {
        return totalDepositsAllAccounts;
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance+=amount;
        totalDepositsAllAccounts+=amount;
        System.out.println("Amount: " + amount + " deposited successfully.");
    }

    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Invalid withdraw amount.");
            return;
        }
        else if(amount>balance){
            System.out.println("Insufficient balance.");
            return;
        }
        else if(amount>MAX_WITHDRAWL_LIMIT){
            System.out.println("Amount cannot be greater than MAX_WITHDRAWL_LIMIT.");
            return;
        }
        balance-=amount;
        System.out.println("Amount: " + amount + " withdrawn successfully.");
    }
    public static class Builder{
        private final String accountNumber;
        private final String ownerName;

        private double balance = 0.0;
        private String accountType = "Savings";

        public Builder(String accountNumber, String ownerName) {
            this.accountNumber = accountNumber;
            this.ownerName = ownerName;
        }
        public Builder balance(double balance) {
            this.balance = balance;
            return this;
        }
        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public BankAccount build() {
            // validate before building
            if (accountNumber == null || accountNumber.isEmpty())
                throw new IllegalArgumentException("Account number required");
            if (ownerName == null || ownerName.isEmpty())
                throw new IllegalArgumentException("Owner name required");
            return new BankAccount(this); // calls private constructor
        }
    }
}
