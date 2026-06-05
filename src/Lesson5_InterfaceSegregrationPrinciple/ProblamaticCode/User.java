package Lesson5_InterfaceSegregrationPrinciple.ProblamaticCode;

public interface User {

     boolean canBuyProducts();

     boolean canModifyProduct();

     boolean canAddProduct();

     boolean canApproveProducts();

     public void approveProduct();
}
