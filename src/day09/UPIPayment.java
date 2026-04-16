package day09;

public class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(String paymentId, double amount,String upiId) {
        super(paymentId, amount);
        this.upiId=upiId;
    }

    public String getUpiId() {
        return upiId;
    }
    @Override
    public void processPayment(){
        super.processPayment();
        System.out.println("Debited via UPI: "+ upiId);
    }
    @Override
    public String toString(){
        return "UPIPayment [paymentId=" + getPaymentId() +
                ", amount=" + getAmount() +
                ", status=" + getStatus() +
                ", UPIId=" + upiId + "]";
    }
}
