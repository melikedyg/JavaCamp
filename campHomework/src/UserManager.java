
public class UserManager {
	
	public void add(User user) {
		System.out.println(user.firstName + user.lastName + user.course+" added");
	}
	public void delete(User user) {
		System.out.println(user.firstName +" "+ user.lastName + " "+user.course+" course deleted");
	}
	public void deleteMultiple(User[] users) {
		for(User user: users) {
			
			delete(user);
		}

	}
	
	
	
}
