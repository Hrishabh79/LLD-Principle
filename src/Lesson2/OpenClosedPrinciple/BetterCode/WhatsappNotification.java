package Lesson2.OpenClosedPrinciple.BetterCode;

public class WhatsappNotification implements Notification {

    @Override
    public void send() {
        System.out.println("Sending Whatsapp");
    }
}
