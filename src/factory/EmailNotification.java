package factory;

public class EmailNotification implements Notification {

	@Override
	public void pushNotification() {
		System.out.println("Email Notification");

	}

}
