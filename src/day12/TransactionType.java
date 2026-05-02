package day12;

public enum TransactionType {

    DEBIT("Debit", -1),
    CREDIT("Credit",1);

    private final String displayName;
    private final int multiplier;

    TransactionType(String displayName, int multiplier) {
        this.displayName = displayName;
        this.multiplier = multiplier;
    }

    public double applyToAmount(double amount) {
        return amount * multiplier;
    }

    public String getDisplayName() {
        return displayName;
    }
}
