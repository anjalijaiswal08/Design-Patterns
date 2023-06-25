package observer;

import java.util.ArrayList;
import java.util.List;

public class Group {
	
	List<User> userList = new ArrayList<>();
	public void subscribe(User user) {
		userList.add(user);
	}
	
	public void unsubscribe(User user) {
		userList.remove(user);
	}
	
	public void notifyAll(String msg) {
		for(User user: userList)
			user.notify(user.getName()+" "+msg);
	}
	

}
