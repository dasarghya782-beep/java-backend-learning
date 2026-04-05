package day07;

public class Product {
    private String productId;
    private String name;
    private double price;
    private int stockQuantity;

    public Product(String productId,String name,double price,int stockQuantity){
        if(productId==null || productId.trim().isEmpty()){
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        this.productId=productId.trim();

    }

    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getStockQuantity() { return stockQuantity; }
    public boolean isAvailable() { return stockQuantity > 0; }

    public void setName(String name){
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Product name cannot be empty");
        }
        this.name = name.trim();
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be greater than 0. Got: " + price);
        }
        this.price = price;
    }

    private void setStockQuantity(int stockQuantity) {
        if (stockQuantity < 0) {
            throw new IllegalArgumentException("Stock quantity cannot be negative. Got: " + stockQuantity);
        }
        this.stockQuantity = stockQuantity;
    }
    public void addStock(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity to add must be positive. Got: " + quantity);
        }
        this.stockQuantity += quantity;
        System.out.println("Stock added: " + quantity + " | Total stock: " + stockQuantity);
    }
    public void reduceStock(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity to reduce must be positive. Got: " + quantity);
        }
        if (quantity > stockQuantity) {
            throw new IllegalArgumentException("Insufficient stock. Available: " + stockQuantity + ", Requested: " + quantity);
        }
        this.stockQuantity -= quantity;
        System.out.println("Stock reduced: " + quantity + " | Remaining stock: " + stockQuantity);
    }
    public void applyDiscount(double percentage) {
        if (percentage <= 0 || percentage >= 100) {
            throw new IllegalArgumentException("Discount percentage must be between 0 and 100. Got: " + percentage);
        }
        double discountAmount = price * (percentage / 100);
        this.price = price - discountAmount;
        System.out.println("Discount applied: " + percentage + "% | New price: " + price);
    }
    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + "'" +
                ", name='" + name + "'" +
                ", price=" + price +
                ", stockQuantity=" + stockQuantity +
                ", available=" + isAvailable() +
                "}";
    }
}
