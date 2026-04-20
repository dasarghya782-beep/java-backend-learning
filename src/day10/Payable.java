package day10;

public interface Payable {
    void processPayment(double amount);
    boolean validatePayment();
    default void printRecipt(){
        System.out.println("Payment of processed successfully.");
    }

}
