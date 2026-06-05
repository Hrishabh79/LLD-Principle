package Lesson6.DependencyInversionPrinciple.ProblamaticCode;

public class NotificationManager {

    private EmailService emailService;

    public NotificationManager() {
        this.emailService = new EmailService();
    }

    public void notifyUser() {
        emailService.send();
    }
}
