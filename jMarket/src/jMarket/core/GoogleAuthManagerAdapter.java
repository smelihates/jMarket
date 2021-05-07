package jMarket.core;

import jMarket.googleAuth.GoogleAuth;

public class GoogleAuthManagerAdapter implements googleAuthService {
	private GoogleAuth googleAuth=new GoogleAuth();
	
	@Override
	public void signIn(String username) {
		googleAuth.SignIn(username);
		
	}

	@Override
	public void signUp(String username) {
		googleAuth.signUp(username);
		
	}

	@Override
	public void signOut(String username) {
		googleAuth.SignOut(username);
		
	}

}
