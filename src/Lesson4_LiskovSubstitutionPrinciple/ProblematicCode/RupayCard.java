package Lesson4_LiskovSubstitutionPrinciple.ProblematicCode;

public class RupayCard extends CreditCard{
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of RupayCard");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of RupayCard");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe Transfer impl of RupayCard");
    }

    @Override
    public void mandatePayment() {
        System.out.println("Mandate payment impl of RupayCard");
    }
}
