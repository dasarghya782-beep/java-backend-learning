package day08;

public class LoanAccount extends BankAccountHierarchy{
    private double loanAmount;
    private double emiAmount;
    private int remainingEmis;

    public LoanAccount(String accountNumber,String ownerName,double initialBalance,double loanAmount,double emiAmount,int remainingEmis){
        super(accountNumber,ownerName,initialBalance);
        this.loanAmount=loanAmount;
        this.emiAmount=emiAmount;
        this.remainingEmis=remainingEmis;
    }
    public double getLoanAmount() {return loanAmount;}
    public double getEmiAmount() {return emiAmount;}
    public int getRemainingEmis() {return remainingEmis;}

    public void payEmi(){
        if (remainingEmis == 0) {
            throw new IllegalArgumentException("No EMIs remaining.");
        }
        if (getBalance() < emiAmount) {
            throw new IllegalArgumentException("Insufficient balance to pay EMI.");
        }
        setBalance(getBalance() - emiAmount);
        remainingEmis--;
        System.out.println("EMI paid. Remaining EMIs: " + remainingEmis);
    }
    public double getTotalRemainingAmount() {
        return emiAmount * remainingEmis;
    }
    @Override
    public String toString() {
        return "LoanAccount{accountNumber='" + getAccountNumber() +
                "', owner='" + getOwnerName() +
                "', balance=" + getBalance() +
                "', emiAmount=" + getEmiAmount() +
                "', remainingEmis=" + getRemainingEmis() +
                "', loanAmount=" + getLoanAmount() + "}";
    }
}
