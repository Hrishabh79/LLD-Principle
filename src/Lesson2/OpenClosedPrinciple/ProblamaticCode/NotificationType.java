package Lesson2.OpenClosedPrinciple.ProblamaticCode;

public enum NotificationType {

    SMS,
    EMAIL,
    WHATSAPP;

    public void sendSMSNotification(){
        System.out.println("Sending notification");
    }
    public void sendEmailNotification(){
        System.out.println("Sending Emails");
    }
    public void sendWhatsappNotification(){
        System.out.println("Sending Whatsapp");
    }
}
