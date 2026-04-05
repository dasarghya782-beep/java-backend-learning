package day07;

public class Main {
    public static void main(String[] args){

        BankAccount acc1=new BankAccount("1234","Arghya",2000,"SAVINGS");
        BankAccount acc2=new BankAccount("1235","Arnav",1500,"CURRENT");
        BankAccount acc3=new BankAccount("1236","Avash",2500,"SAVINGS");

        acc1.deposit(500);
        acc2.deposit(-300);
        acc3.deposit(600);
        acc1.withdraw(1500);
        acc2.withdraw(-200);
        acc3.withdraw(5000);

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc3);


        // =====================
        // Testing Person
        // =====================
        System.out.println("\n===== Person Tests =====");

        Person p1 = new Person("Rahul Sharma", 21, "rahul@gmail.com");
        Person p2 = new Person("Priya Singh", 25, "priya@outlook.com");

        System.out.println(p1.getInfo());
        System.out.println(p2.getInfo());

        // Update name using setter
        System.out.println("Before update: " + p1.getName());
        p1.setName("Rahul Kumar");
        System.out.println("After update: " + p1.getName());

        // Invalid operations
        try {
            Person p3 = new Person("", 21, "test@gmail.com");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            Person p4 = new Person("Aryan", -5, "aryan@gmail.com");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            Person p5 = new Person("Aryan", 21, "invalidemail");
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            p2.setAge(200);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println(p1);
        System.out.println(p2);

        // =====================
        // Testing Product
        // =====================
        System.out.println("\n===== Product Tests =====");

        Product prod1 = new Product("P001", "Laptop", 75000, 10);
        Product prod2 = new Product("P002", "Mouse", 999, 50);

        System.out.println(prod1);
        System.out.println(prod2);

        prod1.addStock(5);
        prod1.reduceStock(3);
        prod1.applyDiscount(10);

        prod2.addStock(20);
        prod2.reduceStock(10);
        prod2.applyDiscount(5);

        // Invalid operations
        try {
            prod1.addStock(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            prod2.reduceStock(1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            prod1.applyDiscount(150);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        try {
            prod2.setPrice(-500);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }

        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println("Prod1 available: " + prod1.isAvailable());

    }
}
