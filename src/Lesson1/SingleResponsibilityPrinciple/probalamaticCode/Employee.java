package Lesson1.SingleResponsibilityPrinciple.probalamaticCode;

public class Employee {

    private int id;

    public int getId(){
        return this.id;
    }

    public String fetchBioData(){
        return "Some bio data";
    }

    public double calculateSalary(){
        return 0;
    }

    public void printPerformnceData(){
        System.out.println("Some performance related data");
    }
}
