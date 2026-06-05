package Lesson2.OpenClosedPrinciple.BetterCode;

public class SMSNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending SMS");
    }
}
