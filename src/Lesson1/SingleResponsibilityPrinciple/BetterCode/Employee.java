package Lesson1.SingleResponsibilityPrinciple.BetterCode;

public class Employee {

    private final int employeeId;

    public Employee(int id){
        this.employeeId = id;
    }
    public  int getEmployeeId(){
        return this.employeeId;
    }
}
