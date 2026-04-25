package day11;

import java.time.LocalDateTime;

public final class Transactions {
    private final String transactionId;
    private final String accountNumber;
    private final double amount;
    private final String type;
    private final LocalDateTime timestamp;

    private Transactions(String transactionId,String accountNumber,double amount,String type,LocalDateTime timestamp){
        if (transactionId == null || accountNumber == null || type == null || timestamp == null) {
            throw new IllegalArgumentException("Fields cannot be null");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be > 0");
        }
        if (!type.equals("Debit") && !type.equals("Credit")) {
            throw new IllegalArgumentException("Type must be DEBIT or CREDIT");
        }
        this.transactionId=transactionId;
        this.accountNumber=accountNumber;
        this.amount=amount;
        this.type=type;
        this.timestamp=timestamp;
    }
    public static Transactions debit(String transactionId,String accountNumber,double amount){
        return new Transactions(transactionId,accountNumber,amount,"Debit",LocalDateTime.now());
    }
    public static Transactions credit(String transactionId,String accountNumber,double amount){
        return new Transactions(transactionId,accountNumber,amount,"Credit",LocalDateTime.now());
    }
    public String getTransactionId() {
        return transactionId;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getAmount() {
        return amount;
    }
    public String getType() {
        return type;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    @Override
    public String toString() {
        return "Transaction{" +
                "ID='" + transactionId + '\'' +
                ", Account='" + accountNumber + '\'' +
                ", Amount=" + amount +
                ", Type='" + type + '\'' +
                ", Time=" + timestamp +
                '}';
    }
}
