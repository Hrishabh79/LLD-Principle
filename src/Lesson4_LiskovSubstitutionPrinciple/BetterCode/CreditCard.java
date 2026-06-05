package Lesson4_LiskovSubstitutionPrinciple.BetterCode;

public  abstract class CreditCard {

    private String ccNumber;
    private String ownerName;
    private int cvv;

    public void setCcnumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setCVV(int cvv) {
        this.cvv = cvv;
    }

    public abstract void tapAndPay();

    public abstract void onlineTransfer();

    public abstract void swipeAndPay();

    public abstract void mandatePayment();

    public void displayCreditCardDetails() {
        System.out.println("CC Number: " + this.ccNumber + " , With Owner Name: " + this.ownerName);
    }
 }
