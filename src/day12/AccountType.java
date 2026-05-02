package day12;

public enum AccountType {

    SAVINGS("Savings Account",1000),
    CURRENT("Current Account",0.0),
    FIXED_DEPOSIT("Fixed Deposit",10000);

    private final String displayName;
    private final double minBalance;

    AccountType(String displayName,double minBalance){
        this.displayName=displayName;
        this.minBalance=minBalance;
    }
    public String getDisplayName() {
        return displayName;
    }
    public double getMinBalance() {
        return minBalance;
    }
}
