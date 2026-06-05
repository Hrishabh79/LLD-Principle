package Lesson4_LiskovSubstitutionPrinciple.ProblematicCode;

public class MasterCard extends CreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of MasterCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of MasterCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe Transfer impl of MasterCard");
    }

    @Override
    public void mandatePayment() {
        System.out.println("Mandate payment impl of MasterCard");
    }

    @Override
    public void upiPayment() {
        System.out.println("throw new Error");
    }

    @Override
    public void internationlPayment() {
        System.out.println("intl payment impl of MasterCard");

    }
}
