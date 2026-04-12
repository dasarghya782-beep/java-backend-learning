package day08;

public class CurrentAccount extends BankAccountHierarchy {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber,String ownerName, double initialBalance,double overdraftLimit){
        super(accountNumber,ownerName,initialBalance);
        this.overdraftLimit=overdraftLimit;
    }
    public double getAvailableBalance(){
        return getBalance()+overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void withdraw(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Amount must be positive.");
        } else if (amount>getAvailableBalance()) {
            throw new IllegalArgumentException("Insufficient balance.");
        }
        setBalance(getBalance()-amount);
        System.out.println("Withdraw sucessfully.");

    }
    @Override
    public String toString() {
        return "CurrentAccount{accountNumber='" + getAccountNumber() +
                "', owner='" + getOwnerName() +
                "', balance=" + getBalance() +
                "', overdraftLimit=" + getOverdraftLimit() + "}";
    }
}
