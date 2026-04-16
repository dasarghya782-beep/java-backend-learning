package day09;

public class Payment {
    private String paymentId;
    private double amount;
    private String status;

    public Payment(String paymentId,double amount){
        this.paymentId=paymentId;
        this.amount=amount;
        this.status="Pending";
    }

    public String getPaymentId() {
        return paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }
    protected void setStatus(String status){
        this.status=status;
    }

    public void processPayment(){
        setStatus("Processed");
        System.out.println("Payment " + paymentId + " processed successfully.");
    }
    public void refund(){
        setStatus("Refunded");
        System.out.println("Payment " + paymentId + " refunded successfully.");
    }
    public String getPaymentSummary() {
        return "Payment ID: " + paymentId +
                ", Amount: " + amount +
                ", Status: " + status;
    }
    @Override
    public String toString() {
        return "Payment [paymentId=" + paymentId +
                ", amount=" + amount +
                ", status=" + status + "]";
    }
}
