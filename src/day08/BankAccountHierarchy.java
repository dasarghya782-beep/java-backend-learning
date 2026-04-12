package day08;

public class BankAccountHierarchy {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccountHierarchy(String accountNumber,String ownerName,double initialBalance){
        this.accountNumber=accountNumber;
        setOwnerName(ownerName);
        this.balance=initialBalance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getOwnerName() { return ownerName; }
    public double getBalance() { return balance; }

    public void setOwnerName(String ownerName) {
        if(ownerName==null || ownerName.trim().isEmpty()){
            throw new IllegalArgumentException("Owner name cannot be empty.");
        }
        this.ownerName = ownerName.trim();
    }

    protected void setBalance(double balance){
        this.balance=balance;
    }

    public void deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Amount must be positive.");
        }
        this.balance+=amount;
        System.out.println("Deposited: "+ amount + " | Balance: " + this.balance);
    }
    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
        if (amount > this.balance) throw new IllegalArgumentException("Insufficient balance");
        this.balance -= amount;
        System.out.println("Withdrawn: " + amount + " | Balance: " + this.balance);
    }
    @Override
    public String toString() {
        return "BankAccount{accountNumber='" + accountNumber +
                "', owner='" + ownerName + "', balance=" + balance + "}";
    }


}
