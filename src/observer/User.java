package observer;

public class User {
	private String name;
	public User(String name){
		this.name = name;
	}
	public void notify(String msg) {
		System.out.println("Notification: "+ msg);
	}
	public String getName() {
		return this.name;
	}

}
