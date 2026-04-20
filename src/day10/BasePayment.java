package day10;

public class BasePayment implements Payable,Loggable{
    protected String paymentId;
    protected String status;

    public BasePayment(String paymentId){
        this.paymentId=paymentId;
        this.status="Initiated";
    }


    @Override
    public void logTransaction(String message) {
        System.out.println("[LOG] PaymentID: " + paymentId + " | " + message);
    }

    @Override
    public void processPayment(double amount) {

    }

    @Override
    public boolean validatePayment() {
        return true;
    }
}
