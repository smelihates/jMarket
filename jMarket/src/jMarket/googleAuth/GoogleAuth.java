package jMarket.googleAuth;

public class GoogleAuth {
	public void signUp(String userName) {
		System.out.println(userName + " Google hesabý ile kayýt olundu.");
	}
	
	public void SignIn(String userName) {
		System.out.println(userName + " Google hesabý ile giriþ yapýldý.");
	}
	
	public void SignOut(String userName) {
		System.out.println(userName + " Google hesabý ile sistemden çýkýþ yapýldý.");
	}
}
