package factory;

public class Main {

	public static void main(String[] args) {
		NotificationFactory factory = new NotificationFactory();
		Notification sms = factory.createNotification("SMS");
		sms.pushNotification();

	}

}
