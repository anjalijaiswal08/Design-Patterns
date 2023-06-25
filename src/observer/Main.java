package observer;


public class Main {

	public static void main(String[] args) {
		Group g = new Group();
		User user1 = new User("user1");
		User user2 = new User("user2");
		User user3 = new User("user3");
		g.subscribe(user1);
		g.subscribe(user2);
		g.subscribe(user3);
		g.notifyAll("First message");
		g.unsubscribe(user3);
		g.notifyAll("Second message");

	}

}
