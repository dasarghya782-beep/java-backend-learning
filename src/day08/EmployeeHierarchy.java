package day08;

public class EmployeeHierarchy {
    private String employeeId;
    private String name;
    private double salary;
    private String department;

    public EmployeeHierarchy(String employeeId,String name,double salary,String department){
        this.employeeId=employeeId;
        setName(name);
        setDepartment(department);
        setSalary(salary);
    }
    public String getEmployeeId() {return employeeId;}
    public String getName() {return name;}
    public double getSalary() {return salary;}
    public String getDepartment() {return department;}

    private void setSalary(double salary){
        if(salary<=0){
            throw new IllegalArgumentException("Salary must be positive.");
        }
        this.salary=salary;
    }
    public void setName(String name) {
        if(name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name.trim();
    }
    public void setDepartment(String department){
        if (department == null || department.trim().isEmpty())
            throw new IllegalArgumentException("Department cannot be empty.");
        this.department = department.trim();
    }
    public void applyRaise(double percentage){
        if(percentage<=0 || percentage>100){
            throw new IllegalArgumentException("Raise percentage should be more than 0 and 100.");
        }
        this.salary+=this.salary*percentage/100;
        System.out.println("Raise applied. New salary: " + this.salary);
    }
    public double getAnnualSalary(){
        return salary*12;
    }
    @Override
    public String toString() {
        return "Employee{employeeId='" + employeeId +
                "', name='" + name +
                "', salary=" + salary +
                "', department='" + department + "'}";
    }
}
