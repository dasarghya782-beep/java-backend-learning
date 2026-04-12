package day08;

public class SavingsAccount extends BankAccountHierarchy {
    private double interestRate;

    public SavingsAccount(String accountNumber,String ownerName,double initialBalance,double interestRate){
        super(accountNumber,ownerName,initialBalance);
        this.interestRate=interestRate;
    }

    public void applyInterest(){
        double interest=getBalance()* interestRate/100;
        deposit(interest);
        System.out.println("Interest applied: " + interest);
    }
    public double getInterestRate(){
        return interestRate;
    }
    @Override
    public void withdraw(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Amount must be positive.");
        }
        if(this.getBalance()-amount<500){
            throw new IllegalArgumentException("You have to maintain atleast 500 rupees in account");
        }
        this.setBalance(this.getBalance()-amount);
        System.out.println("Withdraw successfull.");
    }
    @Override
    public String toString() {
        return "SavingsAccount{accountNumber='" + getAccountNumber() +
                "', owner='" + getOwnerName() +
                "', balance=" + getBalance() +
                "', interestRate=" + interestRate + "}";
    }

}
