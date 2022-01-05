package eCommerceSystem.core;

import eCommerceSystem.entities.concretes.User;
import eCommerceSystem.googleAccount.GoogleManager;

public class GoogleAuthManagerAdapter implements AuthService{
  GoogleManager googleAuthManager; 
	
	public GoogleAuthManagerAdapter(GoogleManager googleAuthManager) {
	this.googleAuthManager = googleAuthManager;
}

	@Override
	public void register(User user) {
		googleAuthManager.register(user);
	}

	@Override
	public void login(User user) {
		googleAuthManager.login(user);
		
	}

}
