package factory;

public class SMSNotification implements Notification {
	
	SMSNotification() {
		
	}
	
	@Override
	public void pushNotification() {
		System.out.println("SMS Notification");

	}

}
