package day10;

public class CreditCardPayment extends BasePayment implements Refundable {
    private String cardLastFourDigits;
    private String cardHolderName;

    public CreditCardPayment(String paymentId,String last4,String holder){
        super(paymentId);
        this.cardLastFourDigits=last4;
        this.cardHolderName=holder;
    }
    @Override
    public void processPayment(double amount) {
        if(amount<=0){
            status="Failed";
            logTransaction("Invalid amount");
        }
        status="Success";
        logTransaction("Paid " + amount + "using card ending" + cardLastFourDigits);
    }
    @Override
    public void processRefund(double amount) {
        logTransaction("Refunded " + amount + " to card ending " + cardLastFourDigits);
    }

    @Override
    public boolean isrefundEligible() {
        return status.equals("Success");
    }

    @Override
    public void printRecipt() {
        super.printRecipt();
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Card: ****" + cardLastFourDigits);
    }
}
