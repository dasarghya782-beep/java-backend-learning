package day08;

public class Main {
    public static void main(String[] args) {

        System.out.println("========== SAVINGS ACCOUNT ==========");
        SavingsAccount savings = new SavingsAccount("ACC001", "Rahul", 5000, 3.5);
        savings.deposit(2000);
        savings.applyInterest();
        try {
            savings.withdraw(6800); // should fail — would breach minimum balance of 500
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        try {
            savings.withdraw(500); // should work — stays at minimum balance
        }catch(IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(savings);

        System.out.println("\n========== CURRENT ACCOUNT ==========");
        CurrentAccount current = new CurrentAccount("ACC002", "Priya", 3000, 1000);
        current.deposit(500);
        current.withdraw(4000); // should work — uses overdraft
        try {
            current.withdraw(1000); // should fail — exceeds overdraft limit
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Available balance: " + current.getAvailableBalance());
        System.out.println(current);

        System.out.println("\n========== LOAN ACCOUNT ==========");
        LoanAccount loan = new LoanAccount("ACC003", "Aryan", 10000, 500000, 5000, 12);
        System.out.println("Total remaining: " + loan.getTotalRemainingAmount());
        loan.payEmi();
        loan.payEmi();
        System.out.println("Remaining EMIs after 2 payments: " + loan.getRemainingEmis());
        try {
            LoanAccount poorLoan = new LoanAccount("ACC004", "Test", 1000, 100000, 5000, 6);
            poorLoan.payEmi(); // should fail — insufficient balance
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(loan);

        System.out.println("\n========== EMPLOYEE HIERARCHY ==========");
        EmployeeHierarchy emp = new EmployeeHierarchy("E001", "Rahul", 50000, "Engineering");
        System.out.println("Annual salary: " + emp.getAnnualSalary());
        emp.applyRaise(10);
        System.out.println(emp);

        Manager manager = new Manager("M001", "Priya", 100000, "Engineering", 5);
        System.out.println("Manager annual salary with bonus: " + manager.getAnnualSalary());
        manager.addTeamMember();
        System.out.println(manager);

        Intern intern = new Intern("I001", "Aryan", 20000, "Engineering", 6);
        System.out.println("Intern total pay: " + intern.getAnnualSalary());
        System.out.println("Eligible for conversion: " + intern.isEligibleForConversion());
        System.out.println(intern);
    }
}

