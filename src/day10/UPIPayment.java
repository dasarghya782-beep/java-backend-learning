package day10;

public class UPIPayment extends BasePayment implements Refundable{
    private String upiId;

    public UPIPayment(String paymentId,String upiId){
        super(paymentId);
        this.upiId=upiId;
    }
    @Override
    public void processPayment(double amount) {
        if(amount<=0){
            status="Failed";
            logTransaction("Invalid UPI payment.");
        }
        status="Success";
        logTransaction("Paid " + amount + "using UPI id " + upiId);
    }
    @Override
    public void processRefund(double amount) {
        logTransaction("Refunded " + amount + " to UPI id " + upiId);
    }

    @Override
    public boolean isrefundEligible() {
        return status.equals("Success.");
    }

}
