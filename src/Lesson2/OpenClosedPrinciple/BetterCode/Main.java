package Lesson2.OpenClosedPrinciple.BetterCode;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Notification> notifications =
                Arrays.asList(
                        new SMSNotification(),
                        new EmailNotification(),
                        new WhatsappNotification()
                );

        NotificationSender sender =
                new NotificationSender();

        sender.sendNotifications(notifications);
    }
}