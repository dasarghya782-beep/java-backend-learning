package day08;

public class Manager extends EmployeeHierarchy {
    private int teamSize;

    public Manager(String employeeId,String name,double salary,String department,int teamSize){
        super(employeeId, name, salary, department);
        this.teamSize=teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void addTeamMember(){
        teamSize++;
    }

    @Override
    public double getAnnualSalary(){
        return getSalary()*12*1.20;
    }
    @Override
    public String toString() {
        return "Manager{employeeId='" + getEmployeeId() +
                "', name='" + getName() +
                "', salary=" + getSalary() +
                "', teamSize='" + getTeamSize() +
                "', department='" + getDepartment() + "'}";
    }

}
