package DesignPatterns.Behavioral;

public interface NotificationStrategy {
    public void sendNotification();
}

class EmailNotification implements  NotificationStrategy{

    @Override
    public void sendNotification() {
        System.out.println("Email Sent");
    }
}

class SmsNotification implements  NotificationStrategy{
    @Override
    public void sendNotification() {
        System.out.println(" SMS Sent");
    }
}

class PushNotification implements NotificationStrategy{
    @Override
    public void sendNotification() {
        System.out.println("notification pushed");
    }
}
class NotificationService implements NotificationStrategy{
    private NotificationStrategy notificationStrategy;

    public void setStrategy(NotificationStrategy notificationStrategy){
        this.notificationStrategy = notificationStrategy;
    }

    @Override
    public void sendNotification() {
        notificationStrategy.sendNotification();
    }
}