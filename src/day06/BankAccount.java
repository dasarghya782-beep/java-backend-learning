package day06;

public class BankAccount {
    private String accountNumber;
    private String ownername;
    private double balance;
    private String accountType;

    public BankAccount(String accountNumber, String ownername, double balance, String accountType){
        this.accountNumber=accountNumber;
        this.ownername=ownername;
        this.balance=balance;
        this.accountType=accountType;
    }
    public BankAccount(String accountNumber, String ownername){
        this(accountNumber,ownername,0,"SAVINGS");
    }

    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Invalid deposit amount");
        }else{
            balance+=amount;
            System.out.println("Amount deposited");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            System.out.println("Amount withdrawn");
            balance-=amount;
        }else{
            System.out.println("Invalid amount or Insufficient Funds");
        }
    }

    public double getBalance() {
        return balance;
    }
    public void printStatement(){
        System.out.println("AccountNumber is: "+ accountNumber+" OwnerName is: "+ ownername+" Balance is: "+ balance+ " AccountType is: "+ accountType);
    }
    public boolean isActive(){
        return balance > 0;
    }
    @Override
    public String toString(){
        return "BankAccount{accountNumber='" + accountNumber +
                "', owner='" + ownername +
                "', accountType='" + accountType + "', balance=" + balance + "}";
    }
}
