package jMarket;

import java.util.List;

import jMarket.business.concretes.AuthManager;
import jMarket.business.concretes.UserManager;
import jMarket.core.GoogleAuthManagerAdapter;
import jMarket.core.RegisterService;
import jMarket.core.RegisterUserManagerAdapter;
import jMarket.dataAccess.abstracts.UserDao;
import jMarket.dataAccess.concretes.HibernateUserDao;
import jMarket.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User user=new User();
		user.setId(1);
		user.setFirstName("Melih");
		user.setLastName("Ateþ");
		user.setEmail("melih@melih.com");
		user.setPassword("123456");
		
		AuthManager authManager=new AuthManager(new HibernateUserDao());
		authManager.signUp(user);

		
		
		RegisterUserManagerAdapter register =new RegisterUserManagerAdapter();
		register.setRegisteredUser(user);
		
		register.isRegisterUser(user);
		
		authManager.signIn(user.getEmail(), user.getPassword());
		
		
		String username="smelihates";
		
		GoogleAuthManagerAdapter authManagerAdapter=new GoogleAuthManagerAdapter();
		
		authManagerAdapter.signUp(username);

		authManagerAdapter.signIn(username);
		
		
		
		
	}

}
