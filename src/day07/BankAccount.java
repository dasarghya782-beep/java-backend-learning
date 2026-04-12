package day07;

public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;
    private String accountType;

    public BankAccount(String accountNumber,String ownerName,double initialBalance,String accountType){
        this.accountNumber=accountNumber;
        this.ownerName=ownerName;
        this.balance=initialBalance;
        this.accountType=accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setOwnerName(String ownerName) {
        if(this.ownerName==null || this.ownerName.trim().isEmpty()){
            throw new IllegalArgumentException("Owner name cannot be empty.");
        }
        this.ownerName=ownerName.trim();
    }
    private void setBalance(double balance){
        if(balance<0){
            throw new IllegalArgumentException("Balance cannot be negative.");
        }
        this.balance=balance;
    }
    public void deposit(double amount){
        if(isInValidAmount(amount)){
            System.out.println("Amount cannot be negative or Zero.");
            return;
        }
        System.out.println("Deposit successfull.");
        balance+=amount;
    }
    public void withdraw(double amount){
        if(isInValidAmount(amount)){
            System.out.println("Amount cannot be negative or Zero.");
        }
        balance-=amount;
        System.out.println("Withdraw successfull.");
    }
    private boolean isInValidAmount(double amount){
        return amount<=0;
    }
    @Override
    public String toString(){
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                ", accountType='" + accountType + '\'' +
                '}';
    }

}
