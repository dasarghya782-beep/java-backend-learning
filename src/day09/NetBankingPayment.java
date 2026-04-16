package day09;

public class NetBankingPayment extends Payment{
    private String bankName;
    private String accountNumber;

    public NetBankingPayment(String paymentId,double amount,String bankName,String accountNumber){
        super(paymentId,amount);
        this.bankName=bankName;
        this.accountNumber=accountNumber;
    }
    @Override
    public void processPayment(){
        super.processPayment();
        System.out.println("Debited from Bank: " + bankName + ", Account ending: " + accountNumber);
    }
    @Override
    public String toString() {
        return "NetBankingPayment [paymentId=" + getPaymentId() +
                ", amount=" + getAmount() +
                ", status=" + getStatus() +
                ", bankName=" + bankName +
                ", accountLast4=" + accountNumber + "]";
    }

}
