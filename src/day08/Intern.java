package day08;

public class Intern extends EmployeeHierarchy{
    private int internshipDurationMonths;

    public Intern(String employeeId,String name,double salary,String department, int internshipDurationMonths){
        super(employeeId,name,salary,department);
        this.internshipDurationMonths=internshipDurationMonths;
    }

    public int getInternshipDurationMonths() {
        return internshipDurationMonths;
    }

    @Override
    public double getAnnualSalary(){
        return getSalary()*internshipDurationMonths;
    }

    public boolean isEligibleForConversion(){
        return internshipDurationMonths>=6;
    }
    @Override
    public String toString() {
        return "Intern{employeeId='" + getEmployeeId() +
                "', name='" + getName() +
                "', salary='" + getSalary() +
                "', intershipDurationMonths='" + getInternshipDurationMonths() +
                "', department='" + getDepartment() + "'}";
    }
}
