package day12;

import java.time.LocalDateTime;

public class Transaction {
    private final String transactionId;
    private final String accountNumber;
    private final double amount;
    private final TransactionType type;
    private final LocalDateTime timestamp;

    public Transaction(String transactionId, String accountNumber, double amount, TransactionType type, LocalDateTime timestamp) {
        if (transactionId == null || accountNumber == null || type == null || timestamp == null) {
            throw new IllegalArgumentException("Fields cannot be null");
        }

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be > 0");
        }
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.type = type;
        this.timestamp = timestamp;
    }

    public TransactionType getType() {
        return type;
    }

    public static Transaction debit(String id, String acc, double amount){
        return new Transaction(id,acc,amount,TransactionType.DEBIT,LocalDateTime.now());
    }
    public static Transaction credit(String id,String acc,double amount){
        return new Transaction(id,acc,amount,TransactionType.CREDIT,LocalDateTime.now());
    }
    public double getSignedAmount(){
        return type.applyToAmount(amount);
    }
    @Override
    public String toString() {
        return "Transaction{" +
                "ID='" + transactionId + '\'' +
                ", Account='" + accountNumber + '\'' +
                ", Amount=" + amount +
                ", Type=" + type +
                ", SignedAmount=" + getSignedAmount() +
                ", Time=" + timestamp +
                '}';
    }

}
