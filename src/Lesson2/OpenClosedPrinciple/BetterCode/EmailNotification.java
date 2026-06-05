package Lesson2.OpenClosedPrinciple.BetterCode;



public class EmailNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Email");
    }
}
