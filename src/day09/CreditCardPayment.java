package day09;

public class CreditCardPayment extends Payment{
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String paymentId, double amount,String cardNumber, String cardHolderName){
        super(paymentId,amount);
        this.cardNumber=cardNumber.substring(cardNumber.length() - 4);
        this.cardHolderName=cardHolderName;
    }

    @Override
    public void processPayment(){
        super.processPayment();
        System.out.println("Charged to card ending; " + cardNumber);
    }

    @Override
    public String getPaymentSummary(){
        return super.getPaymentSummary() +
                ", Card Holder: " + cardHolderName +
                ", Card Last 4: " + cardNumber;
    }

    @Override
    public String toString(){
        return "CreditCardPayment [paymentId=" + getPaymentId() +
                ", amount=" + getAmount() +
                ", status=" + getStatus() +
                ", cardHolderName=" + cardHolderName +
                ", cardLast4=" + cardNumber + "]";
    }

}
