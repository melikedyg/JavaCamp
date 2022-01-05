package eCommerceSystem;

import eCommerceSystem.business.abstracts.UserService;
import eCommerceSystem.business.concretes.UserManager;

import eCommerceSystem.core.GoogleAuthManagerAdapter;
import eCommerceSystem.dataAccess.concretes.HibernateUserDao;
import eCommerceSystem.entities.concretes.User;
import eCommerceSystem.googleAccount.GoogleManager;

public class Main {

	public static void main(String[] args) {
		
		UserService userService=new UserManager(new HibernateUserDao(),new GoogleAuthManagerAdapter(new GoogleManager()));
		
		User user=new User("Zeynep","Özdemir","zeynepozdemir@gmail.com","123456",true);
		User user2=new User("Özlem","Yýlmaz","ozlem@gmail.com","3423",false);
	
		userService.register(user);
		userService.login(user);
		userService.confirm(user);
		userService.registerWithAccount(user);
		userService.loginWithAccount(user);
		
		userService.register(user2);
		userService.login(user2);
		userService.confirm(user2);
		userService.registerWithAccount(user2);
		userService.loginWithAccount(user2);
		
		
		
		

	}

}
