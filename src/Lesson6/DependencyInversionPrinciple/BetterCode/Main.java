package Lesson6.DependencyInversionPrinciple.BetterCode;

public class Main {

    public static void main(String[] args) {

        MessageService service =
                new EmailService();

        NotificationManager manager =
                new NotificationManager(service);

        manager.notifyUser();
    }
}
