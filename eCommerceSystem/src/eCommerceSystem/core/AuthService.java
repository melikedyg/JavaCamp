package eCommerceSystem.core;

import eCommerceSystem.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void login(User user);

}
