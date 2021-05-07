package jMarket.business.concretes;

import jMarket.business.abstracts.AuthService;
import jMarket.dataAccess.abstracts.UserDao;
import jMarket.entities.concretes.User;

public class AuthManager implements AuthService {

	private UserDao userDao;
	
	public AuthManager(UserDao userDao) {

		this.userDao = userDao;
	}

	@Override
	public void signIn(String email, String password) {
		if(this.userDao.getAll()!=null) {
			for (User user: this.userDao.getAll()) {
				if(email==user.getEmail()&&password==user.getPassword()) {
					System.out.println(email + " ile sisteme giriþ yapýldý.");
					return;
				}
			}
		}
		System.out.println("sisteme giriþ yapýlamadý!");
		
	}

	@Override
	public void signUp(User user) {
		userDao.add(user);
		System.out.println(user.getFirstName() +" kullanýcý kaydý yapýldý.");
		
	}

	@Override
	public void signOut(String email) {
		System.out.println(email+ " sistemden çýkýþ yapýldý!");
		
	}

}
