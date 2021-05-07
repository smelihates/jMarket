package jMarket.business.abstracts;

import jMarket.entities.concretes.User;

public interface AuthService {
	void signIn (String email, String password);
	void signUp (User user);
	void signOut (String email);

	
}
