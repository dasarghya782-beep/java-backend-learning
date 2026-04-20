package day10;

public class WalletPayment extends BasePayment{
    private double walletBalance;

    public WalletPayment(String paymentId,double walletBalance){
        super(paymentId);
        this.walletBalance=walletBalance;
    }
    @Override
    public void processPayment(double amount){
        if(amount<=1){
            status="Failed";
            logTransaction("Invalid amount");
        }
        if(amount<=walletBalance){
            walletBalance-=amount;
            status="Success";
            logTransaction("Paid " + amount + "using wallet. Remaining: " + walletBalance);
        }else{
            status="Failed";
            logTransaction("Insufficient wallet balance.");
        }
    }
}
