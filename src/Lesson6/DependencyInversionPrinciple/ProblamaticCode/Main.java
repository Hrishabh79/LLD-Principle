package Lesson6.DependencyInversionPrinciple.ProblamaticCode;

public class Main {

    public static void main(String[] args) {

        NotificationManager manager =
                new NotificationManager();

        manager.notifyUser();
    }
}
