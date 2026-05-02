package day12;

public class Order {
    private final String orderId;
    private final String productName;
    private double amount;
    private OrderStatus status;

    public Order(String orderId,String productName,double amount){
        if (orderId == null || productName == null) {
            throw new IllegalArgumentException("Fields cannot be null");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be > 0");
        }
        this.orderId=orderId;
        this.productName=productName;
        this.amount=amount;
        this.status=OrderStatus.PLACED;
    }
    public void transition(OrderStatus newStatus){
        if(!status.canTransitionTo(newStatus)){
            throw new IllegalArgumentException("Invalid transition: " + status + " -> " + newStatus);
        }
        this.status=newStatus;

    }
    public void printStatus() {
        System.out.println("Order " + orderId + " [" + productName + "] Status: " + status);
    }

    public OrderStatus getStatus() {
        return status;
    }
}
