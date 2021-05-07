package jMarket.core;


public interface googleAuthService {
	void signIn (String username);
	void signUp (String username);
	void signOut (String username);
}
