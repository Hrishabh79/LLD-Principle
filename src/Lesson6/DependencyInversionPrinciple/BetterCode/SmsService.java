package Lesson6.DependencyInversionPrinciple.BetterCode;

public class SmsService
        implements MessageService {

    @Override
    public void send() {
        System.out.println("SMS Sent");
    }
}
