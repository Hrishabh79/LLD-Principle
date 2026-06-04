package Lesson3_abstractClasses_interfaces.abstractClass_demo;

public class Macbook extends Product{

    @Override
    public double calculateDiscount(){
        return 0;
    }
    @Override
    public void termAndCondition(){
        System.out.println("terms of Macbook");
    }

}
