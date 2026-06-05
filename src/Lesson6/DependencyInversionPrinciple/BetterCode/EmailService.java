package Lesson6.DependencyInversionPrinciple.BetterCode;

public class EmailService implements MessageService {

    @Override
    public void send() {
        System.out.println("Email Sent");
    }
}
