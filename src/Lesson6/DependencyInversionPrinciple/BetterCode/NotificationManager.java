package Lesson6.DependencyInversionPrinciple.BetterCode;

public class NotificationManager {

    private MessageService service;

    public NotificationManager(
            MessageService service) {

        this.service = service;
    }

    public void notifyUser() {
        service.send();
    }
}
